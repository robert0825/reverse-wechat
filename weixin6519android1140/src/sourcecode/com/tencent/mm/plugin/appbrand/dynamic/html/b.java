package com.tencent.mm.plugin.appbrand.dynamic.html;

import android.text.Editable;
import android.text.Html.TagHandler;
import com.tencent.gmtrace.GMTrace;
import org.xml.sax.XMLReader;

public final class b
  implements Html.TagHandler
{
  public b()
  {
    GMTrace.i(18342597361664L, 136663);
    GMTrace.o(18342597361664L, 136663);
  }
  
  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    GMTrace.i(18342731579392L, 136664);
    int i;
    int j;
    if ("a".equalsIgnoreCase(paramString))
    {
      if (paramBoolean)
      {
        i = paramEditable.length();
        paramEditable.setSpan(new CustomURLSpan(""), i, i, 17);
        GMTrace.o(18342731579392L, 136664);
        return;
      }
      j = paramEditable.length();
      paramString = paramEditable.getSpans(0, paramEditable.length(), CustomURLSpan.class);
      if (paramString.length == 0) {
        break label205;
      }
      i = paramString.length;
      if (i <= 0) {
        break label205;
      }
      if (paramEditable.getSpanFlags(paramString[(i - 1)]) != 17) {
        break label196;
      }
    }
    label196:
    label205:
    for (paramString = paramString[(i - 1)];; paramString = null)
    {
      paramString = (CustomURLSpan)paramString;
      i = paramEditable.getSpanStart(paramString);
      paramXMLReader = paramEditable.subSequence(i, j).toString();
      paramEditable.removeSpan(paramString);
      if (i != j) {
        paramEditable.setSpan(new CustomURLSpan(paramXMLReader), i, j, 33);
      }
      GMTrace.o(18342731579392L, 136664);
      return;
      i -= 1;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\html\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */