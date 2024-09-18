package com.example.custombtn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

public class CustomBtn extends AppCompatButton {
    private Paint paint;
    private RectF ovalRect;

    public CustomBtn(Context context) {
        super(context);
        init();
    }

    public CustomBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomBtn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        int width = getWidth();
        int height = getHeight();

        if (ovalRect == null) {
            ovalRect = new RectF(0, 0, width, height);
        }

        canvas.drawOval(ovalRect, paint);

        super.onDraw(canvas);
    }
}
