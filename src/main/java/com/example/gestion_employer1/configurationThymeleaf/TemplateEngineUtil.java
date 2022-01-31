package com.example.gestion_employer1.configurationThymeleaf;

import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;

@WebListener
public class TemplateEngineUtil {

        private static final String TEMPLATE_ENGINE_ATTR = "net.manage_employee.registration.thymleaf.TemplateEngineInstance";
        public static void storeTemplateEngine(ServletContext context, TemplateEngine engine) {
            context.setAttribute(TEMPLATE_ENGINE_ATTR, engine);
        }

        public static TemplateEngine getTemplateEngine(ServletContext context) {
            return (TemplateEngine) context.getAttribute(TEMPLATE_ENGINE_ATTR);
        }


    }

