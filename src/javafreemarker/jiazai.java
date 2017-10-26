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
		
		//����freemaeker����ʵ��
		 // ͨ��Freemaker��Configuration��ȡ��Ӧ��ftl
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("gbk");
        // �趨ȥ�����ȡ��Ӧ��ftlģ���ļ�
        cfg.setDirectoryForTemplateLoading(new File("moban"));
        
        //��������ģ��
        Map root = new HashMap();
        root.put("user", "hello");
        
        //����ģ���ļ�
        Template t1 = cfg.getTemplate("a.ftl");
        
        //��ʾ���ɵ�����
        FileWriter outf = null;
        outf = new FileWriter("D:\\freemarker\\ftl\\html\\a.html");
        t1.process(root, outf);
        Writer out = new OutputStreamWriter(System.out);
        t1.process(root, out);
        out.flush();
        out.close();

	}

}
