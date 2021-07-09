package test.fzmy.annotation.configration;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 *是对bean获取的过滤实现操作
 */
public class FzmyTypeFilter implements TypeFilter {
	/**
	 *
	 * @param metadataReader 读取当前正崽扫描的类信息
	 * @param metadataReaderFactory 获取其他任何类的信息
	 * @return
	 * @throws IOException
	 */

	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		//获取当前类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类信息
		ClassMetadata classMetadata =  metadataReader.getClassMetadata();
		//获取当前类的路径
		Resource resource = metadataReader.getResource();
		//
		String className = classMetadata.getClassName();
		System.out.println("FzmyTypeFilter自定义获取的类名--->"+classMetadata.getClassName());
		if(className.contains("Text")){
			return true;
		}
		return false;
	}
}
