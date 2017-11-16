package com.tencent.mm.plugin.brandservice.a;

import android.content.Context;
import android.os.Looper;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.d;
import com.tencent.mm.az.e;
import com.tencent.mm.protocal.c.op;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

public final class a
{
  public static ae gie;
  
  static
  {
    GMTrace.i(10841034326016L, 80772);
    gie = new ae(Looper.getMainLooper());
    GMTrace.o(10841034326016L, 80772);
  }
  
  public static d a(d paramd, op paramop)
  {
    GMTrace.i(10840631672832L, 80769);
    if (paramop != null)
    {
      paramd.field_brandFlag = paramop.gCL;
      paramd.field_brandIconURL = paramop.gCO;
      paramd.field_brandInfo = paramop.gCN;
      paramd.field_extInfo = paramop.gCM;
    }
    GMTrace.o(10840631672832L, 80769);
    return paramd;
  }
  
  public static Spanned b(Context paramContext, String paramString, List<String> paramList)
  {
    GMTrace.i(10840765890560L, 80770);
    if (bg.nm(paramString))
    {
      GMTrace.o(10840765890560L, 80770);
      return null;
    }
    if ((paramContext == null) || (paramList == null))
    {
      paramContext = new SpannableString(paramString);
      GMTrace.o(10840765890560L, 80770);
      return paramContext;
    }
    paramContext = e.a(paramString, paramList);
    GMTrace.o(10840765890560L, 80770);
    return paramContext;
  }
  
  public static boolean b(TextView paramTextView, CharSequence paramCharSequence)
  {
    GMTrace.i(10840900108288L, 80771);
    if (paramTextView == null)
    {
      GMTrace.o(10840900108288L, 80771);
      return false;
    }
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      paramTextView.setVisibility(8);
      GMTrace.o(10840900108288L, 80771);
      return false;
    }
    paramTextView.setVisibility(0);
    paramTextView.setText(paramCharSequence);
    GMTrace.o(10840900108288L, 80771);
    return true;
  }
  
  public static class a
  {
    public ImageView hqG;
    public String iconUrl;
    public String username;
    
    public a()
    {
      GMTrace.i(10841168543744L, 80773);
      GMTrace.o(10841168543744L, 80773);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */