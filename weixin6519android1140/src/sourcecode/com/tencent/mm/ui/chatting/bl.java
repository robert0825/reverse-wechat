package com.tencent.mm.ui.chatting;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class bl
{
  private static final LinearLayout.LayoutParams wxd;
  
  static
  {
    GMTrace.i(2290828181504L, 17068);
    wxd = new LinearLayout.LayoutParams(-1, -2);
    GMTrace.o(2290828181504L, 17068);
  }
  
  private static String VX(String paramString)
  {
    GMTrace.i(2290022875136L, 17062);
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    while (localStringBuilder.length() < 80) {
      localStringBuilder.append(paramString);
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(2290022875136L, 17062);
    return paramString;
  }
  
  public static int VY(String paramString)
  {
    GMTrace.i(16016067264512L, 119329);
    if (paramString.contains("m"))
    {
      GMTrace.o(16016067264512L, 119329);
      return 18;
    }
    if (paramString.contains("l"))
    {
      GMTrace.o(16016067264512L, 119329);
      return 21;
    }
    GMTrace.o(16016067264512L, 119329);
    return 14;
  }
  
  public static boolean VZ(String paramString)
  {
    GMTrace.i(16016201482240L, 119330);
    boolean bool = paramString.contains("b");
    GMTrace.o(16016201482240L, 119330);
    return bool;
  }
  
  public static boolean Wa(String paramString)
  {
    GMTrace.i(16016335699968L, 119331);
    boolean bool = paramString.contains("u");
    GMTrace.o(16016335699968L, 119331);
    return bool;
  }
  
  public static int Wb(String paramString)
  {
    GMTrace.i(16016469917696L, 119332);
    if (bg.nm(paramString))
    {
      GMTrace.o(16016469917696L, 119332);
      return -16777216;
    }
    try
    {
      int i = Color.parseColor(paramString);
      GMTrace.o(16016469917696L, 119332);
      return i;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom, ex = " + paramString.getMessage());
      GMTrace.o(16016469917696L, 119332);
    }
    return -16777216;
  }
  
  private static boolean a(LinearLayout paramLinearLayout, SpannableString paramSpannableString, List<a> paramList)
  {
    GMTrace.i(2289888657408L, 17061);
    w.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "addLines, nodeList size = " + paramList.size());
    int j = paramSpannableString.length();
    paramList = paramList.iterator();
    a locala;
    for (int i = 0; paramList.hasNext(); i = locala.offset)
    {
      locala = (a)paramList.next();
      if (locala.offset > i)
      {
        localTextView = new TextView(paramLinearLayout.getContext());
        localTextView.setText(paramSpannableString.subSequence(i, Math.min(locala.offset, j)));
        localTextView.setLineSpacing(3.0F, 1.0F);
        paramLinearLayout.addView(localTextView, wxd);
      }
      TextView localTextView = new TextView(paramLinearLayout.getContext());
      localTextView.setText(VX(locala.wxg));
      localTextView.setSingleLine(true);
      if (locala.wxe != 14) {
        localTextView.setTextSize(locala.wxe);
      }
      if (locala.eUy) {
        localTextView.setTypeface(null, 1);
      }
      if (locala.wxf) {
        localTextView.setPaintFlags(localTextView.getPaintFlags() | 0x8);
      }
      localTextView.setTextColor(locala.color);
      paramLinearLayout.addView(localTextView, wxd);
    }
    if (i >= j)
    {
      w.i("MicroMsg.ChattingItemDyeingTemplateDecorator", "addLines, lastOffset >= maxLength, lastOffset = " + i + ", maxLength = " + j);
      GMTrace.o(2289888657408L, 17061);
      return true;
    }
    paramList = new TextView(paramLinearLayout.getContext());
    paramList.setTextSize(0, a.V(paramList.getContext(), R.f.aQo));
    paramList.setText(paramSpannableString.subSequence(i, j));
    paramList.setLineSpacing(2.0F, 1.0F);
    paramLinearLayout.addView(paramList, wxd);
    GMTrace.o(2289888657408L, 17061);
    return true;
  }
  
  public static boolean a(LinearLayout paramLinearLayout, Map<String, String> paramMap)
  {
    GMTrace.i(2289754439680L, 17060);
    if (paramLinearLayout == null)
    {
      w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle fail, digestLl is null");
      GMTrace.o(2289754439680L, 17060);
      return false;
    }
    String str1 = (String)paramMap.get(".msg.appmsg.mmreader.category.item.digest");
    if (bg.nm(str1))
    {
      w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle, digest is null");
      GMTrace.o(2289754439680L, 17060);
      return false;
    }
    SpannableString localSpannableString = new SpannableString(str1);
    int i;
    Object localObject2;
    Object localObject3;
    label205:
    Object localObject1;
    try
    {
      localSpannableString.setSpan(new ForegroundColorSpan(-16777216), 0, localSpannableString.length(), 17);
      i = 0;
      localObject2 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.style");
      if (i == 0)
      {
        str1 = "";
        localObject2 = str1;
        if (paramMap.containsKey(localObject2)) {
          break label313;
        }
        w.i("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle end, total style count = " + i);
        i = 0;
        localObject2 = new ArrayList();
        localObject3 = new StringBuilder(".msg.appmsg.mmreader.category.item.styles.line");
        if (i != 0) {
          break label985;
        }
        str1 = "";
        str1 = str1;
        if (paramMap.containsKey(str1)) {
          break label994;
        }
        w.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle end, total line count = " + i);
        Collections.sort((List)localObject2);
        paramLinearLayout.removeAllViews();
        a(paramLinearLayout, localSpannableString, (List)localObject2);
        GMTrace.o(2289754439680L, 17060);
        return true;
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
    {
      for (;;)
      {
        w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "decorateStyle setSpan error: %s", new Object[] { localIndexOutOfBoundsException1.getMessage() });
        continue;
        localObject1 = String.valueOf(i);
      }
      label313:
      localObject1 = b.s(paramMap, (String)localObject2);
      if (localObject1 != null) {
        break label356;
      }
    }
    w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom fail, skip to next, styleKey = " + (String)localObject2);
    for (;;)
    {
      i += 1;
      break;
      label356:
      if (((b)localObject1).wxh < ((b)localObject1).wxi) {
        break label412;
      }
      w.w("MicroMsg.ChattingItemDyeingTemplateDecorator", "addStyle, no need to add, rangeFrom = " + ((b)localObject1).wxh + ", rangeTo = " + ((b)localObject1).wxi);
    }
    label412:
    int m = ((b)localObject1).wxh;
    int k = ((b)localObject1).wxi;
    int n = ((b)localObject1).wxe;
    boolean bool1 = ((b)localObject1).eUy;
    boolean bool2 = ((b)localObject1).wxf;
    w.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, rangeFrom = " + m + ", rangeTo = " + k + ", fontSize = " + n + ", isBlack = " + bool1 + ", isUnderLine = " + bool2);
    int j = m;
    if (m < 0)
    {
      w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(m), Integer.valueOf(k) });
      j = 0;
    }
    if (k > localSpannableString.length())
    {
      w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(j), Integer.valueOf(k) });
      k = localSpannableString.length();
    }
    for (;;)
    {
      if (bool1) {}
      try
      {
        localSpannableString.setSpan(new StyleSpan(1), j, k, 17);
        if (!bool2) {}
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
      {
        try
        {
          localSpannableString.setSpan(new UnderlineSpan(), j, k, 17);
          if (n == 14) {}
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException4)
        {
          try
          {
            for (;;)
            {
              localSpannableString.setSpan(new AbsoluteSizeSpan(n), j, k, 17);
              k = ((b)localObject1).wxh;
              m = ((b)localObject1).wxi;
              n = ((b)localObject1).color;
              w.d("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, rangeFrom = " + k + ", rangeTo = " + m + ", color = " + n);
              j = k;
              if (k < 0)
              {
                w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(k), Integer.valueOf(m) });
                j = 0;
              }
              k = m;
              if (m > localSpannableString.length())
              {
                w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setColor, params error. length:%d, from:%d, to:%d", new Object[] { Integer.valueOf(localSpannableString.length()), Integer.valueOf(j), Integer.valueOf(m) });
                k = localSpannableString.length();
              }
              try
              {
                localSpannableString.setSpan(new ForegroundColorSpan(n), j, k, 17);
              }
              catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
              {
                w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException2.getMessage() });
              }
              break;
              localIndexOutOfBoundsException3 = localIndexOutOfBoundsException3;
              w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException3.getMessage() });
            }
            localIndexOutOfBoundsException4 = localIndexOutOfBoundsException4;
            w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException4.getMessage() });
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException5)
          {
            for (;;)
            {
              w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "setFont setSpan error: %s", new Object[] { localIndexOutOfBoundsException5.getMessage() });
            }
          }
        }
      }
      label985:
      String str2 = String.valueOf(i);
      break label205;
      label994:
      localObject3 = a.r(paramMap, str2);
      if (localObject3 == null) {
        w.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom fail, skip to next, lineKey = " + str2);
      }
      for (;;)
      {
        i += 1;
        break;
        localIndexOutOfBoundsException5.add(localObject3);
      }
    }
  }
  
  private static final class a
    implements Comparable<a>
  {
    public int color;
    public boolean eUy;
    public int offset;
    public int wxe;
    public boolean wxf;
    public String wxg;
    
    private a()
    {
      GMTrace.i(2176206241792L, 16214);
      GMTrace.o(2176206241792L, 16214);
    }
    
    public static a r(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(2176340459520L, 16215);
      a locala = new a();
      for (;;)
      {
        try
        {
          locala.offset = bg.getInt((String)paramMap.get(paramString + ".offset"), 0);
          str = (String)paramMap.get(paramString + ".font");
          if (bg.nm(str))
          {
            w.d("MicroMsg.LineNode", "parseFrom, font is null, use default value");
            str = "m";
            locala.eUy = bl.VZ(str);
            locala.wxf = bl.Wa(str);
            locala.wxe = bl.VY(str);
            locala.color = bl.Wb((String)paramMap.get(paramString + ".color"));
            locala.wxg = ((String)paramMap.get(paramString + ".chars"));
            if (!bg.nm(locala.wxg)) {
              break;
            }
            w.e("MicroMsg.LineNode", "parseFrom fail, chars is null");
            GMTrace.o(2176340459520L, 16215);
            return null;
          }
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.LineNode", "parseFrom fail, ex = " + paramMap.getMessage());
          GMTrace.o(2176340459520L, 16215);
          return null;
        }
        String str = str.toLowerCase();
      }
      GMTrace.o(2176340459520L, 16215);
      return locala;
    }
  }
  
  private static final class b
  {
    public int color;
    public boolean eUy;
    public int wxe;
    public boolean wxf;
    public int wxh;
    public int wxi;
    
    private b()
    {
      GMTrace.i(2179964338176L, 16242);
      GMTrace.o(2179964338176L, 16242);
    }
    
    public static b s(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(2180098555904L, 16243);
      Object localObject = (String)paramMap.get(paramString + ".range");
      if (bg.nm((String)localObject))
      {
        w.e("MicroMsg.StyleNode", "parseFrom fail, range is null");
        GMTrace.o(2180098555904L, 16243);
        return null;
      }
      if ((((String)localObject).length() < 5) || (((String)localObject).charAt(0) != '{') || (((String)localObject).charAt(((String)localObject).length() - 1) != '}') || (!((String)localObject).contains(",")))
      {
        w.e("MicroMsg.StyleNode", "parseFrom fail, range wrong format, range = " + (String)localObject);
        GMTrace.o(2180098555904L, 16243);
        return null;
      }
      w.d("MicroMsg.StyleNode", "parseFrom, range = " + (String)localObject);
      localObject = ((String)localObject).substring(1, ((String)localObject).length() - 1).split(",");
      if ((localObject == null) || (localObject.length != 2))
      {
        w.e("MicroMsg.StyleNode", "parseFrom fail, range wrong format, strs array length = " + localObject.length);
        GMTrace.o(2180098555904L, 16243);
        return null;
      }
      b localb = new b();
      for (;;)
      {
        try
        {
          localb.wxh = Integer.parseInt(localObject[0]);
          int i = localb.wxh;
          localb.wxi = (Integer.parseInt(localObject[1]) + i);
          localObject = (String)paramMap.get(paramString + ".font");
          if (bg.nm((String)localObject))
          {
            w.d("MicroMsg.StyleNode", "parseFrom, font is null, use default value");
            localObject = "m";
            localb.eUy = bl.VZ((String)localObject);
            localb.wxf = bl.Wa((String)localObject);
            localb.wxe = bl.VY((String)localObject);
            localb.color = bl.Wb((String)paramMap.get(paramString + ".color"));
            GMTrace.o(2180098555904L, 16243);
            return localb;
          }
        }
        catch (Exception paramMap)
        {
          w.e("MicroMsg.StyleNode", "parseFrom fail, ex = " + paramMap.getMessage());
          GMTrace.o(2180098555904L, 16243);
          return null;
        }
        localObject = ((String)localObject).toLowerCase();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */