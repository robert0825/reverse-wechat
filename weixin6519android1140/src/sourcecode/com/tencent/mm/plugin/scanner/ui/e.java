package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;

public final class e
  extends Preference
{
  private Context context;
  private TextView hqi;
  String mTitle;
  private View mView;
  public TextView nNG;
  private View.OnTouchListener nft;
  private final int ovF;
  public TextView ovG;
  public boolean ovH;
  public boolean ovI;
  public Boolean ovJ;
  private ViewTreeObserver.OnGlobalLayoutListener ovK;
  public a ovL;
  
  public e(Activity paramActivity)
  {
    super(paramActivity);
    GMTrace.i(6145963982848L, 45791);
    this.ovF = 5;
    this.ovH = false;
    this.ovI = false;
    setLayoutResource(R.i.cBY);
    this.context = paramActivity;
    GMTrace.o(6145963982848L, 45791);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6146098200576L, 45792);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6146098200576L, 45792);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6146232418304L, 45793);
    super.onBindView(paramView);
    if (this.hqi == null) {
      this.hqi = ((TextView)paramView.findViewById(16908310));
    }
    if (this.nNG == null) {
      this.nNG = ((TextView)paramView.findViewById(16908304));
    }
    if (this.ovG == null) {
      this.ovG = ((TextView)paramView.findViewById(R.h.bOm));
    }
    if (this.nft == null)
    {
      this.nft = new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(6152540651520L, 45840);
          if (paramAnonymousMotionEvent.getAction() == 0)
          {
            w.d("MicroMsg.scanner.PlainTextPreference", "moreTv onTouch");
            e.this.ovG.setVisibility(4);
            e.this.nNG.setMaxLines(2000);
            e.this.ovH = true;
            if (e.this.ovL != null)
            {
              e.this.ovL.a(e.this.hiu, Boolean.valueOf(true));
              e.this.ovL.bcU();
            }
          }
          GMTrace.o(6152540651520L, 45840);
          return false;
        }
      };
      this.ovG.setOnTouchListener(this.nft);
    }
    if (this.ovL != null)
    {
      this.ovJ = this.ovL.FP(this.hiu);
      if (this.ovJ != null) {
        if (this.ovJ.booleanValue())
        {
          this.ovG.setVisibility(8);
          this.nNG.setMaxLines(2000);
        }
      }
    }
    for (;;)
    {
      if (this.ovK == null)
      {
        this.ovK = new ViewTreeObserver.OnGlobalLayoutListener()
        {
          public final void onGlobalLayout()
          {
            GMTrace.i(6099658866688L, 45446);
            w.d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() = " + e.this.nNG.getHeight() + ", summaryTv.getLineHeight() = " + e.this.nNG.getLineHeight());
            if ((e.this.nNG.getText() != null) && (e.this.nNG.getHeight() > 0) && (e.this.nNG.getLineHeight() > 0) && (e.this.ovJ == null))
            {
              if ((e.this.nNG.getHeight() / e.this.nNG.getLineHeight() > 5) && (!e.this.ovI) && (!e.this.ovH))
              {
                e.this.ovG.setVisibility(0);
                e.this.nNG.setMaxLines(5);
                e.this.ovI = true;
                if ((e.this.ovL != null) && (e.this.ovL.FP(e.this.hiu) == null))
                {
                  e.this.ovL.a(e.this.hiu, Boolean.valueOf(false));
                  e.this.ovL.bcU();
                }
              }
              w.d("MicroMsg.scanner.PlainTextPreference", "summaryTv.getHeight() / summaryTv.getLineHeight() = " + e.this.nNG.getHeight() / e.this.nNG.getLineHeight());
            }
            e.this.nNG.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            GMTrace.o(6099658866688L, 45446);
          }
        };
        this.nNG.getViewTreeObserver().addOnGlobalLayoutListener(this.ovK);
      }
      if (!bg.nm(this.mTitle)) {
        break;
      }
      this.hqi.setVisibility(8);
      GMTrace.o(6146232418304L, 45793);
      return;
      this.ovG.setVisibility(0);
      this.nNG.setMaxLines(5);
      continue;
      this.ovG.setVisibility(8);
      this.nNG.setMaxLines(6);
      continue;
      this.ovG.setVisibility(8);
      this.nNG.setMaxLines(6);
    }
    this.hqi.setText(this.mTitle);
    this.hqi.setVisibility(0);
    GMTrace.o(6146232418304L, 45793);
  }
  
  public static abstract interface a
  {
    public abstract Boolean FP(String paramString);
    
    public abstract void a(String paramString, Boolean paramBoolean);
    
    public abstract void bcU();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */