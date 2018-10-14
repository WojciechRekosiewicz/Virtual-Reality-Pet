package Controller;

import javafx.scene.control.Label;

public class ModifyStats {
    public Integer modifyStats(int statToModify, int modifier) {
        statToModify += modifier;
        return statToModify;
    }

    public Label modifyLabels(Label label, String text) {
        label.setText(text);
        return label;
    }
}
