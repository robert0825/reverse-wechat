package com.tencent.mm.plugin.emoji.ui.v2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.v;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class EmojiStoreV2HotBarView
  extends LinearLayout
{
  private View jBw;
  View ksK;
  private TextView ksL;
  View ksM;
  private TextView ksN;
  private View.OnClickListener ksO;
  
  public EmojiStoreV2HotBarView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11479239622656L, 85527);
    this.ksO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11497359015936L, 85662);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2RankUI.class);
        EmojiStoreV2HotBarView.this.getContext().startActivity(paramAnonymousView);
        GMTrace.o(11497359015936L, 85662);
      }
    };
    init();
    GMTrace.o(11479239622656L, 85527);
  }
  
  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11479373840384L, 85528);
    this.ksO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11497359015936L, 85662);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2RankUI.class);
        EmojiStoreV2HotBarView.this.getContext().startActivity(paramAnonymousView);
        GMTrace.o(11497359015936L, 85662);
      }
    };
    init();
    GMTrace.o(11479373840384L, 85528);
  }
  
  @TargetApi(11)
  public EmojiStoreV2HotBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11479776493568L, 85531);
    this.ksO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11497359015936L, 85662);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2RankUI.class);
        EmojiStoreV2HotBarView.this.getContext().startActivity(paramAnonymousView);
        GMTrace.o(11497359015936L, 85662);
      }
    };
    init();
    GMTrace.o(11479776493568L, 85531);
  }
  
  private void init()
  {
    GMTrace.i(11479910711296L, 85532);
    this.jBw = ((ViewGroup)v.fb(getContext()).inflate(R.i.cuO, this)).findViewById(R.h.bZf);
    this.ksK = this.jBw.findViewById(R.h.bvK);
    this.ksL = ((TextView)this.jBw.findViewById(R.h.bvY));
    this.ksL.setText(getResources().getText(R.l.doN) + " ");
    this.ksM = this.jBw.findViewById(R.h.btr);
    this.ksM.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11474407784448L, 85491);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(EmojiStoreV2HotBarView.this.getContext(), EmojiStoreV2SingleProductUI.class);
        EmojiStoreV2HotBarView.this.getContext().startActivity(paramAnonymousView);
        GMTrace.o(11474407784448L, 85491);
      }
    });
    this.ksN = ((TextView)this.jBw.findViewById(R.h.bQN));
    ata();
    View.OnClickListener localOnClickListener = this.ksO;
    if (this.ksL != null) {
      this.ksL.setOnClickListener(localOnClickListener);
    }
    GMTrace.o(11479910711296L, 85532);
  }
  
  public final void ata()
  {
    GMTrace.i(11480044929024L, 85533);
    at.AR();
    boolean bool = ((Boolean)c.xh().get(w.a.vqi, Boolean.valueOf(false))).booleanValue();
    TextView localTextView;
    if (this.ksN != null)
    {
      localTextView = this.ksN;
      if (!bool) {
        break label64;
      }
    }
    label64:
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      GMTrace.o(11480044929024L, 85533);
      return;
    }
  }
  
  public View getRootView()
  {
    GMTrace.i(11480179146752L, 85534);
    View localView = this.jBw;
    GMTrace.o(11480179146752L, 85534);
    return localView;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(11479508058112L, 85529);
    super.onAttachedToWindow();
    w.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    GMTrace.o(11479508058112L, 85529);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(11479642275840L, 85530);
    super.onDetachedFromWindow();
    w.d("MicroMsg.emoji.EmojiStoreV2HotBarView", "onAttachedToWindow");
    GMTrace.o(11479642275840L, 85530);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(11480313364480L, 85535);
    if (this.jBw != null)
    {
      this.jBw.setVisibility(paramInt);
      GMTrace.o(11480313364480L, 85535);
      return;
    }
    super.setVisibility(paramInt);
    GMTrace.o(11480313364480L, 85535);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2HotBarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */