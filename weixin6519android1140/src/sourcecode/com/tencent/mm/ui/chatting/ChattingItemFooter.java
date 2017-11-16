package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.j;
import com.tencent.mm.af.q;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.List;

public class ChattingItemFooter
  extends LinearLayout
  implements View.OnClickListener
{
  private static final int[] wxj;
  private static final int[] wxk;
  private LayoutInflater CJ;
  private String iAx;
  private Context mContext;
  
  static
  {
    GMTrace.i(2505173893120L, 18665);
    wxj = new int[] { R.g.aVw, R.g.aVw, R.g.aVy, R.g.aVx };
    wxk = new int[] { R.g.aZl, R.g.aZm, R.g.aZo, R.g.aZn };
    GMTrace.o(2505173893120L, 18665);
  }
  
  public ChattingItemFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2504502804480L, 18660);
    this.mContext = paramContext;
    this.CJ = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    GMTrace.o(2504502804480L, 18660);
  }
  
  private TextView a(int paramInt1, int paramInt2, LinearLayout.LayoutParams paramLayoutParams)
  {
    GMTrace.i(2504771239936L, 18662);
    if (paramInt1 < paramInt2)
    {
      paramLayoutParams = (TextView)getChildAt(paramInt1);
      GMTrace.o(2504771239936L, 18662);
      return paramLayoutParams;
    }
    TextView localTextView = (TextView)this.CJ.inflate(R.i.cse, null);
    localTextView.setLongClickable(false);
    localTextView.setOnClickListener(this);
    localTextView.setLayoutParams(paramLayoutParams);
    addView(localTextView);
    GMTrace.o(2504771239936L, 18662);
    return localTextView;
  }
  
  private void d(j paramj)
  {
    GMTrace.i(17898470899712L, 133354);
    paramj = new q(this.iAx, 1, paramj.getInfo(), null);
    at.wS().a(paramj, 0);
    GMTrace.o(17898470899712L, 133354);
  }
  
  public final boolean b(List<j> paramList, String paramString, boolean paramBoolean)
  {
    GMTrace.i(2504637022208L, 18661);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.d("ChattingItemFooter", "no menulist!");
      setVisibility(8);
      GMTrace.o(2504637022208L, 18661);
      return false;
    }
    this.iAx = paramString;
    int i = getChildCount();
    Object localObject;
    int j;
    if (paramBoolean)
    {
      paramString = wxk;
      localObject = new LinearLayout.LayoutParams(0, -1);
      ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
      j = paramList.size();
      switch (j)
      {
      }
    }
    for (;;)
    {
      if ((i > j) && (i - 1 > 0)) {
        removeViews(j, i - 1);
      }
      setLongClickable(true);
      setVisibility(0);
      GMTrace.o(2504637022208L, 18661);
      return true;
      paramString = wxj;
      break;
      paramList = (j)paramList.get(0);
      localObject = a(0, i, (LinearLayout.LayoutParams)localObject);
      ((TextView)localObject).setText(paramList.name);
      ((TextView)localObject).setTag(paramList);
      ((TextView)localObject).setBackgroundResource(paramString[3]);
      continue;
      j localj = (j)paramList.get(1);
      TextView localTextView = a(1, i, (LinearLayout.LayoutParams)localObject);
      localTextView.setText(localj.name);
      localTextView.setTag(localj);
      localTextView.setBackgroundResource(paramString[1]);
      localj = (j)paramList.get(0);
      localTextView = a(0, i, (LinearLayout.LayoutParams)localObject);
      localTextView.setText(localj.name);
      localTextView.setTag(localj);
      localTextView.setBackgroundResource(paramString[0]);
      paramList = (j)paramList.get(j - 1);
      localObject = a(j - 1, i, (LinearLayout.LayoutParams)localObject);
      ((TextView)localObject).setText(paramList.name);
      ((TextView)localObject).setTag(paramList);
      ((TextView)localObject).setBackgroundResource(paramString[2]);
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(2505039675392L, 18664);
    paramView = paramView.getTag();
    if (!(paramView instanceof j))
    {
      GMTrace.o(2505039675392L, 18664);
      return;
    }
    paramView = (j)paramView;
    switch (paramView.type)
    {
    }
    for (;;)
    {
      GMTrace.o(2505039675392L, 18664);
      return;
      w.d("ChattingItemFooter", "get latest message");
      paramView.state = j.gxb;
      d(paramView);
      GMTrace.o(2505039675392L, 18664);
      return;
      w.d("ChattingItemFooter", "start webview url");
      paramView.state = j.gxb;
      d(paramView);
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramView.value);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("geta8key_username", this.iAx);
      d.b(this.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ChattingItemFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */