package dz.masterschedule;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.util.Timer;
import java.util.TimerTask;
import android.text.format.Time;

import static dz.masterschedule.R.id.default_activity_button;
import static dz.masterschedule.R.id.imageView1;
import static dz.masterschedule.R.id.imageView2;
import static dz.masterschedule.R.id.imageView3;
import static dz.masterschedule.R.id.imageView4;
import static dz.masterschedule.R.id.screen;
import static dz.masterschedule.R.id.textView1;

/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {

//    private static Timer timer;
//    private static TimerTask timerTask = new TimerTask() {
//        @Override
//        Context context, AppWidgetManager appWidgetManager,int appWidgetId;
//        public void run() {
//            updateAppWidget(context,appWidgetManager,appWidgetId);
//        }
//    };

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {


        //CharSequence widgetText = context.getString(R.string.appwidget_text);
    // Construct the RemoteViews object
    RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
    //views.setTextViewText(R.id.appwidget_text, widgetText);
        Time t = new Time();
        t.setToNow();
        switch(t.hour)
        {
            case 9:case 10:case 11:
                views.setImageViewResource(imageView1,R.mipmap.youjiantou);
                views.setImageViewResource(imageView2,R.mipmap.kong);
                views.setImageViewResource(imageView3,R.mipmap.kong);
                views.setImageViewResource(imageView4,R.mipmap.kong);
                break;
            case 13:case 14:case 15:
                views.setImageViewResource(imageView1,R.mipmap.kong);
                views.setImageViewResource(imageView2,R.mipmap.youjiantou);
                views.setImageViewResource(imageView3,R.mipmap.kong);
                views.setImageViewResource(imageView4,R.mipmap.kong);
                break;
            case 16:
                views.setImageViewResource(imageView1,R.mipmap.kong);
                views.setImageViewResource(imageView2,R.mipmap.kong);
                views.setImageViewResource(imageView3,R.mipmap.youjiantou);
                views.setImageViewResource(imageView4,R.mipmap.kong);
                break;
            case 21:
                views.setImageViewResource(imageView1,R.mipmap.kong);
                views.setImageViewResource(imageView2,R.mipmap.kong);
                views.setImageViewResource(imageView3,R.mipmap.kong);
                views.setImageViewResource(imageView4,R.mipmap.youjiantou);
                break;
            default:
                views.setImageViewResource(imageView1,R.mipmap.kong);
                views.setImageViewResource(imageView2,R.mipmap.kong);
                views.setImageViewResource(imageView3,R.mipmap.kong);
                views.setImageViewResource(imageView4,R.mipmap.kong);
                break;
        }


    // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);

//        timer = new Timer();
//        timer.schedule(, 0, 500);

    }


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }

    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

