package daggerok.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class HomeUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("hi from vaadin!"));
    }
}
