package com.movie.mbg;


import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtility;

import java.text.SimpleDateFormat;
import java.util.Properties;

public class MyCommentGenerator implements CommentGenerator {

    private Properties properties = new Properties();
    /**
     * 抑制日期  默认false：不抑制
     */
    private boolean suppressDate = false;
    /**
     * 抑制注释 默认false：不抑制
     */
    private boolean suppressAllComments = false;

    /**
     * 显示数据库comments 默认false：不显示
     */
    private boolean addRemarkComments = false;
    /**
     * 日期格式
     */
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    @Override
    public void addConfigurationProperties(Properties properties) {

    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            // 注释开始的地方
            field.addJavaDocLine("/*");
            String remarks = introspectedColumn.getRemarks();
            field.addJavaDocLine(remarks);
            /*// 开启注释，并且数据库中comment有值
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                // 通过换行符分割 System.getProperty("line.separator")：换行符 ，屏蔽了 Windows和Linux的区别
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                int length = remarkLines.length;
                // 如果有多行，就换行显示
                for (int i = 0; i < length; i++) {
                    String remarkLine = remarkLines[i];
                    field.addJavaDocLine(" * " + remarkLine);
                }
            }*/
            // 注释结束
            field.addJavaDocLine(" */");
        }
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean b) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addRootComment(XmlElement xmlElement) {

    }
}
