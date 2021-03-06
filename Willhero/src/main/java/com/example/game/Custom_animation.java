package com.example.game;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Custom_animation {



    public static FadeTransition fade(Node n, double fadeval,double time) {
        FadeTransition fadeload = new FadeTransition();
        fadeload.setDuration(Duration.millis(time));
        fadeload.setToValue(fadeval);
        fadeload.setNode(n);
        if(fadeval==0)n.setDisable(true);
        else if(fadeval==1)n.setDisable(false);
        return fadeload;
    }
    public static TranslateTransition translate (Node n, double x, double y, double duration) {
        TranslateTransition load = new TranslateTransition();
        load.setByY(y);
        load.setByX(x);
        load.setNode(n);
        load.setDuration(Duration.millis(duration));
        return load;
    }
    public static Timeline delay(double time)
    {
        return new Timeline(new KeyFrame(Duration.millis(time), e -> { }));
    }

}
