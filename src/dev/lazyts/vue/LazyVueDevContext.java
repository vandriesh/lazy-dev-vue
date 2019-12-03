package dev.lazyts.vue;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class LazyVueDevContext extends TemplateContextType {
    protected LazyVueDevContext() {
        super("TYPESCRIPT", "TypeScript");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".vue") ||
                file.getName().endsWith(".ts");
    }
}
