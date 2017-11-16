package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;

public class TranslateCommentTextView
  extends LinearLayout
{
  public SnsTranslateResultView pZW;
  public MaskTextView qkt;
  
  public TranslateCommentTextView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8481352450048L, 63191);
    init();
    GMTrace.o(8481352450048L, 63191);
  }
  
  public TranslateCommentTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8481486667776L, 63192);
    init();
    GMTrace.o(8481486667776L, 63192);
  }
  
  private void init()
  {
    GMTrace.i(8481620885504L, 63193);
    LayoutInflater.from(getContext()).inflate(i.g.pgI, this);
    this.qkt = ((MaskTextView)findViewById(i.f.pah));
    this.pZW = ((SnsTranslateResultView)findViewById(i.f.peg));
    this.pZW.setVisibility(8);
    GMTrace.o(8481620885504L, 63193);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\TranslateCommentTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */