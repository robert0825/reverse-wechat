package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.chat.f;

public abstract class ChatFooterPanel
  extends LinearLayout
{
  public static int SCENE_SNS;
  public static int ttd;
  public static int tte;
  public static int ttf;
  public a tta;
  public f ttb;
  protected int ttc;
  
  static
  {
    GMTrace.i(1156151508992L, 8614);
    ttd = 0;
    tte = 1;
    SCENE_SNS = 2;
    ttf = 3;
    GMTrace.o(1156151508992L, 8614);
  }
  
  public ChatFooterPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1153467154432L, 8594);
    GMTrace.o(1153467154432L, 8594);
  }
  
  public void a(f paramf)
  {
    GMTrace.i(1155614638080L, 8610);
    this.ttb = paramf;
    GMTrace.o(1155614638080L, 8610);
  }
  
  public abstract void aq(boolean paramBoolean);
  
  public abstract void ar(boolean paramBoolean);
  
  public abstract void bo(String paramString);
  
  public abstract void bp(String paramString);
  
  public abstract void cT(int paramInt);
  
  public abstract void cU(int paramInt);
  
  public abstract void d(boolean paramBoolean1, boolean paramBoolean2);
  
  public void destroy()
  {
    GMTrace.i(1155883073536L, 8612);
    GMTrace.o(1155883073536L, 8612);
  }
  
  public abstract void oH();
  
  public abstract void oI();
  
  public abstract void oJ();
  
  public abstract void oK();
  
  public abstract void oL();
  
  public abstract void oM();
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract void refresh();
  
  public final void za(int paramInt)
  {
    GMTrace.i(1155748855808L, 8611);
    this.ttc = paramInt;
    GMTrace.o(1155748855808L, 8611);
  }
  
  public static abstract class RecommendView
    extends LinearLayout
  {
    public RecommendView(Context paramContext)
    {
      super();
      GMTrace.i(20294928433152L, 151209);
      GMTrace.o(20294928433152L, 151209);
    }
    
    public RecommendView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      GMTrace.i(20295062650880L, 151210);
      GMTrace.o(20295062650880L, 151210);
    }
    
    public RecommendView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      GMTrace.i(20295196868608L, 151211);
      GMTrace.o(20295196868608L, 151211);
    }
    
    public abstract void wA(String paramString);
  }
  
  public static abstract interface a
  {
    public abstract void aMV();
    
    public abstract void acZ();
    
    public abstract void append(String paramString);
    
    public abstract void fQ(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\ChatFooterPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */