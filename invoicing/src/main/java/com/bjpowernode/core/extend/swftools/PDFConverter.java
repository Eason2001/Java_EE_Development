package com.bjpowernode.core.extend.swftools;

/**
 * PDF文档转换接口
 * @author  
 *
 */
public interface PDFConverter {
	public void convert2PDF(String inputFile,String pdfFile,String extend);
	public void convert2PDF(String inputFile,String extend);

}
