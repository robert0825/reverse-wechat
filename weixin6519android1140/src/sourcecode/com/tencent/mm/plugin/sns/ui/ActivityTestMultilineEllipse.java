package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class ActivityTestMultilineEllipse
  extends Activity
{
  public ActivityTestMultilineEllipse()
  {
    GMTrace.i(8624294330368L, 64256);
    GMTrace.o(8624294330368L, 64256);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8624428548096L, 64257);
    super.onCreate(paramBundle);
    paramBundle = new LinearLayout(this);
    paramBundle.setOrientation(1);
    paramBundle.setBackgroundColor(-1);
    addContentView(paramBundle, new ViewGroup.LayoutParams(-1, -1));
    final Object localObject = new ScrollView(this);
    ((ScrollView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramBundle.addView((View)localObject);
    paramBundle = new LinearLayout(this);
    paramBundle.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramBundle.setOrientation(1);
    paramBundle.setBackgroundColor(-1);
    ((ScrollView)localObject).addView(paramBundle);
    localObject = new QTextView(this);
    ((QTextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    ((QTextView)localObject).pVH = "...";
    ((QTextView)localObject).pVI = " Read More!";
    ((QTextView)localObject).setText("This is some short text. It won't need to be ellipsized.");
    ((QTextView)localObject).mek = 3;
    ((QTextView)localObject).setPadding(10, 10, 10, 10);
    ((QTextView)localObject).setBackgroundColor(-1786127);
    paramBundle.addView((View)localObject);
    localObject = new QTextView(this);
    ((QTextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    ((QTextView)localObject).pVH = "...";
    ((QTextView)localObject).pVI = " Read More!";
    ((QTextView)localObject).mek = 3;
    ((QTextView)localObject).setText("This is some longer text. It should wrap and then eventually be ellipsized once it gets way too long for the horizontal width of the current application screen. We should be fixed to max [N] lines height.");
    ((QTextView)localObject).setPadding(10, 10, 10, 10);
    ((QTextView)localObject).setBackgroundColor(-204878);
    ((QTextView)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8581344657408L, 63936);
        if (localObject.pVM)
        {
          paramAnonymousView = localObject;
          paramAnonymousView.pVM = false;
          paramAnonymousView.requestLayout();
          paramAnonymousView.invalidate();
          GMTrace.o(8581344657408L, 63936);
          return;
        }
        paramAnonymousView = localObject;
        paramAnonymousView.pVM = true;
        paramAnonymousView.requestLayout();
        paramAnonymousView.invalidate();
        GMTrace.o(8581344657408L, 63936);
      }
    });
    paramBundle.addView((View)localObject);
    GMTrace.o(8624428548096L, 64257);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ActivityTestMultilineEllipse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */