package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import java.util.HashMap;

public class CollapsibleTextView
  extends LinearLayout
{
  private Context context;
  private String eHy;
  private String eUg;
  private ae handler;
  private boolean hasCheck;
  private int pOI;
  protected TextView pPA;
  private String pPB;
  private String pPC;
  private HashMap<String, Integer> pPD;
  private Runnable pPE;
  protected SnsPostDescPreloadTextView pPy;
  protected SnsTextView pPz;
  private boolean poX;
  private CharSequence text;
  
  public CollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8552890499072L, 63724);
    this.poX = false;
    this.hasCheck = true;
    this.handler = new ae(Looper.getMainLooper());
    this.pOI = 0;
    this.pPE = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8340155400192L, 62139);
        if ((CollapsibleTextView.this.pPy != null) && ((CollapsibleTextView.this.pPy.getTag() instanceof as)) && (((as)CollapsibleTextView.this.pPy.getTag()).eUg.equals(CollapsibleTextView.a(CollapsibleTextView.this))))
        {
          CollapsibleTextView.this.pPy.setMaxLines(6);
          CollapsibleTextView.this.pPA.setVisibility(0);
          CollapsibleTextView.this.pPA.setText(CollapsibleTextView.b(CollapsibleTextView.this));
        }
        GMTrace.o(8340155400192L, 62139);
      }
    };
    this.context = paramContext;
    this.pPB = this.context.getString(i.j.piR);
    this.pPC = this.context.getString(i.j.piQ);
    paramContext = v.fb(this.context).inflate(i.g.peO, this);
    paramContext.setPadding(0, -3, 0, 0);
    this.pPy = ((SnsPostDescPreloadTextView)paramContext.findViewById(i.f.bti));
    this.pPA = ((TextView)paramContext.findViewById(i.f.gdf));
    this.pPz = ((SnsTextView)paramContext.findViewById(i.f.paw));
    GMTrace.o(8552890499072L, 63724);
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, TextView.BufferType paramBufferType, HashMap<String, Integer> paramHashMap, String paramString1, String paramString2, av paramav, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(8553024716800L, 63725);
    this.context = paramav.ezR;
    this.pPD = paramHashMap;
    this.text = paramCharSequence;
    this.poX = paramBoolean;
    this.eHy = paramString1;
    this.eUg = paramString2;
    this.pOI = paramInt;
    this.pPB = this.context.getString(i.j.piR);
    this.pPC = this.context.getString(i.j.piQ);
    this.pPz.mAz = paramString3;
    paramString2 = new as(this.eUg, this.eHy, false, false, 1);
    if (paramInt == 0)
    {
      this.pPy.setText(paramString3);
      this.pPz.setVisibility(8);
      this.pPA.setVisibility(0);
      this.pPy.setVisibility(0);
      paramCharSequence = new k(this.context);
      this.pPy.setOnTouchListener(paramCharSequence);
      this.pPy.setTag(paramString2);
      if (paramHashMap.get(paramString1) == null)
      {
        this.hasCheck = false;
        this.pPA.setVisibility(8);
        this.pPy.setMaxLines(7);
        GMTrace.o(8553024716800L, 63725);
        return;
      }
      this.hasCheck = true;
      switch (((Integer)paramHashMap.get(paramString1)).intValue())
      {
      }
      for (;;)
      {
        GMTrace.o(8553024716800L, 63725);
        return;
        this.pPA.setVisibility(8);
        GMTrace.o(8553024716800L, 63725);
        return;
        this.pPy.setMaxLines(6);
        this.pPA.setVisibility(0);
        this.pPA.setText(this.pPB);
        GMTrace.o(8553024716800L, 63725);
        return;
        this.pPy.setMaxLines(Integer.MAX_VALUE);
        this.pPA.setVisibility(0);
        this.pPA.setText(this.pPC);
      }
    }
    this.pPz.setText(paramCharSequence, paramBufferType);
    this.pPz.setTag(paramString2);
    this.pPz.setVisibility(0);
    this.pPA.setVisibility(8);
    this.pPy.setVisibility(8);
    this.pPz.setOnClickListener(paramav.pxE.qmQ);
    GMTrace.o(8553024716800L, 63725);
  }
  
  public final int bmS()
  {
    GMTrace.i(8553158934528L, 63726);
    w.i("MicroMsg.CollapsibleTextView", "count:" + this.pPy.getLineCount() + "  height:" + this.pPy.getLineHeight());
    int i = this.pPy.getLineCount();
    int j = this.pPy.getLineHeight();
    GMTrace.o(8553158934528L, 63726);
    return (i - 6) * j;
  }
  
  public final void e(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(8553293152256L, 63727);
    if (this.pPA != null) {
      this.pPA.setOnClickListener(paramOnClickListener);
    }
    GMTrace.o(8553293152256L, 63727);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8553695805440L, 63730);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.pOI == 0) && (!this.poX))
    {
      if (this.hasCheck)
      {
        GMTrace.o(8553695805440L, 63730);
        return;
      }
      this.hasCheck = true;
      if (this.pPy.getLineCount() <= 6)
      {
        this.pPD.put(this.eHy, Integer.valueOf(0));
        GMTrace.o(8553695805440L, 63730);
        return;
      }
      this.pPD.put(this.eHy, Integer.valueOf(1));
      this.handler.post(this.pPE);
    }
    GMTrace.o(8553695805440L, 63730);
  }
  
  public void setClickable(boolean paramBoolean)
  {
    GMTrace.i(8553561587712L, 63729);
    this.pPA.setClickable(paramBoolean);
    this.pPz.setClickable(paramBoolean);
    this.pPy.setClickable(paramBoolean);
    super.setClickable(paramBoolean);
    GMTrace.o(8553561587712L, 63729);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    GMTrace.i(8553427369984L, 63728);
    this.pPA.setLongClickable(paramBoolean);
    this.pPz.setLongClickable(paramBoolean);
    this.pPy.setLongClickable(paramBoolean);
    super.setLongClickable(paramBoolean);
    GMTrace.o(8553427369984L, 63728);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\CollapsibleTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */