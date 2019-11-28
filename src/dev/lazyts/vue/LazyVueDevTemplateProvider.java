package dev.lazyts.vue;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class LazyVueDevTemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[]{"liveTemplates/lazy-dev-vue"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
