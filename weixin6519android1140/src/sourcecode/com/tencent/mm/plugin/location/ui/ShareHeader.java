package com.tencent.mm.plugin.location.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.MMImageButton;

public class ShareHeader
  extends LinearLayout
{
  private TextView hqi;
  private Context mContext;
  public ViewGroup mzK;
  public MMImageButton mzL;
  public MMImageButton mzM;
  
  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9717900378112L, 72404);
    this.mContext = paramContext;
    init();
    GMTrace.o(9717900378112L, 72404);
  }
  
  @TargetApi(11)
  public ShareHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9717766160384L, 72403);
    this.mContext = paramContext;
    init();
    GMTrace.o(9717766160384L, 72403);
  }
  
  private void init()
  {
    GMTrace.i(9718034595840L, 72405);
    View localView = View.inflate(this.mContext, R.i.ceq, this);
    this.mzK = ((ViewGroup)localView.findViewById(R.h.bFT));
    this.mzL = ((MMImageButton)localView.findViewById(R.h.chO));
    this.mzM = ((MMImageButton)localView.findViewById(R.h.chQ));
    this.hqi = ((TextView)localView.findViewById(R.h.title));
    GMTrace.o(9718034595840L, 72405);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\ShareHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */