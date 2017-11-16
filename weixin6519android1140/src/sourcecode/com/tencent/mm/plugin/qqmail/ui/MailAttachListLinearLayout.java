package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class MailAttachListLinearLayout
  extends LinearLayout
{
  Context context;
  List<String> nXe;
  
  public MailAttachListLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5551379447808L, 41361);
    this.nXe = new ArrayList();
    this.context = paramContext;
    GMTrace.o(5551379447808L, 41361);
  }
  
  static String dn(String paramString1, String paramString2)
  {
    GMTrace.i(5551513665536L, 41362);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      GMTrace.o(5551513665536L, 41362);
      return null;
    }
    int k = paramString1.indexOf(paramString2);
    if (k == -1)
    {
      GMTrace.o(5551513665536L, 41362);
      return null;
    }
    int j = paramString1.indexOf("&", k);
    int i = j;
    if (j == -1) {
      i = paramString1.length();
    }
    paramString1 = paramString1.substring(k + paramString2.length() + 1, i);
    GMTrace.o(5551513665536L, 41362);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailAttachListLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */