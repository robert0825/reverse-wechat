package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public class AuthorizationInfoLayout
  extends LinearLayout
{
  private ArrayList<String> lTo;
  private Context mContext;
  
  public AuthorizationInfoLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12739946741760L, 94920);
    this.mContext = paramContext;
    GMTrace.o(12739946741760L, 94920);
  }
  
  public final void F(ArrayList<String> paramArrayList)
  {
    GMTrace.i(12740080959488L, 94921);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.i("MicroMsg.AuthorizationInfoLayout", "authinfo is null or nill");
      GMTrace.o(12740080959488L, 94921);
      return;
    }
    this.lTo = paramArrayList;
    paramArrayList = this.lTo.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      addView(new a(this.mContext, str));
    }
    GMTrace.o(12740080959488L, 94921);
  }
  
  private static final class a
    extends LinearLayout
  {
    private String hYt;
    private Context mContext;
    
    public a(Context paramContext, String paramString)
    {
      super();
      GMTrace.i(12743436402688L, 94946);
      this.mContext = paramContext;
      this.hYt = paramString;
      setGravity(16);
      setOrientation(0);
      setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      paramContext = new TextView(this.mContext);
      paramContext.setText(this.hYt);
      paramContext.setTextSize(1, 16.0F * a.dZ(this.mContext));
      paramContext.setTextColor(Color.parseColor("#737373"));
      paramContext.setGravity(16);
      paramContext.setCompoundDrawablesWithIntrinsicBounds(R.g.aYL, 0, 0, 0);
      paramContext.setCompoundDrawablePadding(20);
      paramString = new LinearLayout.LayoutParams(-2, -2);
      paramString.leftMargin = 10;
      paramContext.setLayoutParams(paramString);
      addView(paramContext);
      GMTrace.o(12743436402688L, 94946);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\AuthorizationInfoLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */