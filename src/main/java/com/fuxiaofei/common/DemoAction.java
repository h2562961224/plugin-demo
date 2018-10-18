package com.fuxiaofei.common;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;

/**
 * @author huxiaohui
 * @date 2018/10/18 20:11
 */
public class DemoAction extends AnAction {
    public DemoAction() {
        super("Hello");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "Hello world!", "Greeting", Messages.getInformationIcon());
        Swagger2MarkupConfig swagger2MarkupConfig = new Swagger2MarkupConfigBuilder().build();
        System.out.println(swagger2MarkupConfig);
    }
}
