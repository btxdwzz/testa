package javafreemarker;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;


public class jiazai {

	public static void main(String[] args) throws Exception{
		
		//创建freemaeker配置实例
		 // 通过Freemaker的Configuration读取相应的ftl
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("gbk");
        // 设定去哪里读取相应的ftl模板文件
        cfg.setDirectoryForTemplateLoading(new File("moban"));
        
        //创建数据模型
        Map root = new HashMap();
        root.put("user", "hello");
        
        //加载模板文件
        Template t1 = cfg.getTemplate("a.ftl");
        
        //显示生成的数据
        FileWriter outf = null;
        outf = new FileWriter("D:\\freemarker\\ftl\\html\\a.html");
        t1.process(root, outf);
        Writer out = new OutputStreamWriter(System.out);
        t1.process(root, out);
        out.flush();
        out.close();

	}

}
