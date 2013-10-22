package au.com.jtribe.widgetapp.providers;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;
import au.com.jtribe.widgetapp.R;

public class WidgetProvider extends AppWidgetProvider {
	private static final String TAG = WidgetProvider.class.getName();
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		Log.d(TAG, "onUpdate");
		final int N = appWidgetIds.length;
		for (int i = 0; i < N; i++) {
			int appWidgetId = appWidgetIds[i];
			RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.appwidget_layout);
			views.setTextViewText(R.id.widgetTextView, appWidgetId + " " + System.currentTimeMillis());
			appWidgetManager.updateAppWidget(appWidgetId, views);
		}
		
	}
}
