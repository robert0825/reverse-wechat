package com.tencent.rtmp.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import java.text.SimpleDateFormat;

public class TXLogView
  extends LinearLayout
{
  private boolean mDisableLog = false;
  private ScrollView mEventScrollView;
  private TextView mEventTextView;
  StringBuffer mLogMsg = new StringBuffer("");
  private final int mLogMsgLenLimit = 3000;
  private ScrollView mStatusScrollView;
  private TextView mStatusTextView;
  
  public TXLogView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TXLogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    this.mStatusTextView = new TextView(paramContext);
    this.mEventTextView = new TextView(paramContext);
    this.mStatusScrollView = new ScrollView(paramContext);
    this.mEventScrollView = new ScrollView(paramContext);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, 0);
    paramAttributeSet.weight = 1.0F;
    this.mStatusScrollView.setLayoutParams(paramAttributeSet);
    this.mStatusScrollView.setBackgroundColor(1627389951);
    this.mStatusScrollView.setVerticalScrollBarEnabled(true);
    this.mStatusScrollView.setScrollbarFadingEnabled(true);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, -1);
    this.mStatusTextView.setLayoutParams(paramAttributeSet);
    this.mStatusTextView.setTextSize(2, 11.0F);
    this.mStatusTextView.setTextColor(-16777216);
    this.mStatusTextView.setTypeface(Typeface.MONOSPACE, 1);
    this.mStatusTextView.setPadding(dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F));
    this.mStatusScrollView.addView(this.mStatusTextView);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, 0);
    paramAttributeSet.weight = 1.0F;
    this.mEventScrollView.setLayoutParams(paramAttributeSet);
    this.mEventScrollView.setBackgroundColor(1627389951);
    this.mEventScrollView.setVerticalScrollBarEnabled(true);
    this.mEventScrollView.setScrollbarFadingEnabled(true);
    paramAttributeSet = new FrameLayout.LayoutParams(-1, -1);
    this.mEventTextView.setLayoutParams(paramAttributeSet);
    this.mEventTextView.setTextSize(2, 13.0F);
    this.mEventTextView.setTextColor(-16777216);
    this.mEventTextView.setPadding(dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F), dip2px(paramContext, 2.0F));
    this.mEventScrollView.addView(this.mEventTextView);
    addView(this.mStatusScrollView);
    addView(this.mEventScrollView);
    setVisibility(8);
  }
  
  private int dip2px(Context paramContext, float paramFloat)
  {
    return (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }
  
  private void scroll2Bottom(ScrollView paramScrollView, View paramView)
  {
    if ((paramScrollView == null) || (paramView == null)) {
      return;
    }
    int j = paramView.getMeasuredHeight() - paramScrollView.getMeasuredHeight();
    int i = j;
    if (j < 0) {
      i = 0;
    }
    paramScrollView.scrollTo(0, i);
  }
  
  protected void appendEventLog(int paramInt, String paramString)
  {
    String str = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
    while (this.mLogMsg.length() > 3000)
    {
      int i = this.mLogMsg.indexOf("\n");
      paramInt = i;
      if (i == 0) {
        paramInt = 1;
      }
      this.mLogMsg = this.mLogMsg.delete(0, paramInt);
    }
    this.mLogMsg = this.mLogMsg.append("\n[" + str + "]" + paramString);
  }
  
  public void clearLog()
  {
    this.mLogMsg.setLength(0);
    this.mStatusTextView.setText("");
    this.mEventTextView.setText("");
  }
  
  public void disableLog(boolean paramBoolean)
  {
    this.mDisableLog = paramBoolean;
  }
  
  protected String getNetStatusString(Bundle paramBundle)
  {
    return String.format("%-14s %-14s %-14s\n%-14s %-14s %-14s\n%-14s %-14s %-14s\n%-14s", new Object[] { "CPU:" + paramBundle.getString("CPU_USAGE"), "RES:" + paramBundle.getInt("VIDEO_WIDTH") + "*" + paramBundle.getInt("VIDEO_HEIGHT"), "SPD:" + paramBundle.getInt("NET_SPEED") + "Kbps", "JIT:" + paramBundle.getInt("NET_JITTER"), "FPS:" + paramBundle.getInt("VIDEO_FPS"), "ARA:" + paramBundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + paramBundle.getInt("CODEC_CACHE") + "|" + paramBundle.getInt("CACHE_SIZE"), "DRP:" + paramBundle.getInt("CODEC_DROP_CNT") + "|" + paramBundle.getInt("DROP_SIZE"), "VRA:" + paramBundle.getInt("VIDEO_BITRATE") + "Kbps", "SVR:" + paramBundle.getString("SERVER_IP") });
  }
  
  public void setLogText(Bundle paramBundle1, Bundle paramBundle2, int paramInt)
  {
    if (this.mDisableLog) {}
    do
    {
      do
      {
        return;
        if (paramBundle1 != null) {
          this.mStatusTextView.setText(getNetStatusString(paramBundle1));
        }
      } while (paramBundle2 == null);
      paramBundle1 = paramBundle2.getString("EVT_MSG");
    } while ((paramBundle1 == null) || (paramBundle1.isEmpty()));
    appendEventLog(paramInt, paramBundle1);
    this.mEventTextView.setText(this.mLogMsg.toString());
    scroll2Bottom(this.mEventScrollView, this.mEventTextView);
  }
  
  public void show(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      setVisibility(i);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\rtmp\ui\TXLogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */