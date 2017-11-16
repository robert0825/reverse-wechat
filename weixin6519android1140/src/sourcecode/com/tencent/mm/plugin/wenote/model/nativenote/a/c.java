package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.Html.TagHandler;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.q;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.XMLReader;

public final class c
  implements Html.TagHandler
{
  private static final Pattern sdE;
  private static final Pattern sdF;
  private static HashMap<String, Integer> sdG;
  private Stack<a> sdC;
  final HashMap<String, String> sdD;
  
  static
  {
    GMTrace.i(20620406423552L, 153634);
    sdE = Pattern.compile("\\d+");
    sdF = Pattern.compile("#[a-f0-9]+");
    HashMap localHashMap = new HashMap();
    sdG = localHashMap;
    localHashMap.put("aqua", Integer.valueOf(65535));
    sdG.put("black", Integer.valueOf(0));
    sdG.put("blue", Integer.valueOf(255));
    sdG.put("fuchsia", Integer.valueOf(16711935));
    sdG.put("green", Integer.valueOf(32768));
    sdG.put("grey", Integer.valueOf(8421504));
    sdG.put("lime", Integer.valueOf(65280));
    sdG.put("maroon", Integer.valueOf(8388608));
    sdG.put("navy", Integer.valueOf(128));
    sdG.put("olive", Integer.valueOf(8421376));
    sdG.put("purple", Integer.valueOf(8388736));
    sdG.put("red", Integer.valueOf(16711680));
    sdG.put("silver", Integer.valueOf(12632256));
    sdG.put("teal", Integer.valueOf(32896));
    sdG.put("white", Integer.valueOf(16777215));
    sdG.put("yellow", Integer.valueOf(16776960));
    GMTrace.o(20620406423552L, 153634);
  }
  
  public c()
  {
    GMTrace.i(20619332681728L, 153626);
    this.sdC = new Stack();
    this.sdD = new HashMap();
    GMTrace.o(20619332681728L, 153626);
  }
  
  @SuppressLint({"DefaultLocale"})
  private static int NG(String paramString)
  {
    int i = 1;
    GMTrace.i(20620272205824L, 153633);
    Integer localInteger = (Integer)sdG.get(paramString.toLowerCase());
    if (localInteger != null)
    {
      i = localInteger.intValue();
      GMTrace.o(20620272205824L, 153633);
      return i;
    }
    if (paramString == null) {}
    int k;
    try
    {
      GMTrace.o(20620272205824L, 153633);
      return -1;
    }
    catch (NumberFormatException paramString)
    {
      GMTrace.o(20620272205824L, 153633);
      return -1;
    }
    paramString = paramString.toString();
    int j = paramString.length();
    int m = 10;
    if ('-' == paramString.charAt(0))
    {
      k = -1;
      if ('0' == paramString.charAt(i))
      {
        if (i == j - 1)
        {
          GMTrace.o(20620272205824L, 153633);
          return 0;
        }
        j = paramString.charAt(i + 1);
        if (120 == j) {
          break label218;
        }
        if (88 == j) {
          break label218;
        }
      }
    }
    for (;;)
    {
      i = Integer.parseInt(paramString.substring(j), i);
      GMTrace.o(20620272205824L, 153633);
      return i * k;
      j = i + 1;
      i = 8;
      continue;
      j = paramString.charAt(i);
      if (35 == j)
      {
        j = i + 1;
        i = 16;
      }
      else
      {
        j = i;
        i = m;
        continue;
        k = 1;
        i = 0;
        break;
        label218:
        j = i + 2;
        i = 16;
      }
    }
  }
  
  private static Object a(Editable paramEditable, Class<? extends Object> paramClass)
  {
    GMTrace.i(20620003770368L, 153631);
    paramEditable = paramEditable.getSpans(0, paramEditable.length(), paramClass);
    if (paramEditable.length == 0)
    {
      GMTrace.o(20620003770368L, 153631);
      return null;
    }
    paramEditable = paramEditable[(paramEditable.length - 1)];
    GMTrace.o(20620003770368L, 153631);
    return paramEditable;
  }
  
  private static void a(Editable paramEditable, Object paramObject)
  {
    GMTrace.i(20620137988096L, 153632);
    int i = paramEditable.length();
    paramEditable.setSpan(paramObject, i, i, 17);
    GMTrace.o(20620137988096L, 153632);
  }
  
  private void a(boolean paramBoolean, q paramq)
  {
    GMTrace.i(20619735334912L, 153629);
    if (paramBoolean) {
      paramq = q.shl;
    }
    if (this.sdC.isEmpty()) {}
    for (a locala = null; locala == null; locala = (a)this.sdC.peek())
    {
      paramq = new a(paramq, 1, 1);
      this.sdC.push(paramq);
      GMTrace.o(20619735334912L, 153629);
      return;
    }
    if (locala.sgO == paramq)
    {
      locala.sgP += 1;
      locala.sgQ += 1;
      GMTrace.o(20619735334912L, 153629);
      return;
    }
    paramq = new a(paramq, locala.sgP + 1, 1);
    this.sdC.push(paramq);
    GMTrace.o(20619735334912L, 153629);
  }
  
  private static void d(Editable paramEditable)
  {
    GMTrace.i(20619601117184L, 153628);
    int i = paramEditable.length();
    if ((i > 0) && (paramEditable.charAt(i - 1) == '\n'))
    {
      GMTrace.o(20619601117184L, 153628);
      return;
    }
    if (i != 0) {
      paramEditable.append("\n");
    }
    GMTrace.o(20619601117184L, 153628);
  }
  
  private void jK(boolean paramBoolean)
  {
    GMTrace.i(20619869552640L, 153630);
    while (!this.sdC.isEmpty())
    {
      a locala = (a)this.sdC.peek();
      q localq = locala.sgO;
      if (((paramBoolean) && (localq.bIy())) || ((!paramBoolean) && (localq.bIx())) || ((!paramBoolean) && (localq.bIz())))
      {
        int i = locala.sgQ;
        if (i > 1)
        {
          locala.sgQ = (i - 1);
          locala.sgP -= 1;
          GMTrace.o(20619869552640L, 153630);
          return;
        }
        this.sdC.pop();
        GMTrace.o(20619869552640L, 153630);
        return;
      }
      this.sdC.pop();
    }
    GMTrace.o(20619869552640L, 153630);
  }
  
  public final void handleTag(boolean paramBoolean, String paramString, Editable paramEditable, XMLReader paramXMLReader)
  {
    GMTrace.i(20619466899456L, 153627);
    this.sdD.clear();
    Object localObject1;
    Object localObject2;
    int j;
    int i;
    try
    {
      localObject1 = paramXMLReader.getClass().getDeclaredField("theNewElement");
      ((Field)localObject1).setAccessible(true);
      paramXMLReader = ((Field)localObject1).get(paramXMLReader);
      localObject1 = paramXMLReader.getClass().getDeclaredField("theAtts");
      ((Field)localObject1).setAccessible(true);
      paramXMLReader = ((Field)localObject1).get(paramXMLReader);
      localObject1 = paramXMLReader.getClass().getDeclaredField("data");
      ((Field)localObject1).setAccessible(true);
      localObject1 = (String[])((Field)localObject1).get(paramXMLReader);
      localObject2 = paramXMLReader.getClass().getDeclaredField("length");
      ((Field)localObject2).setAccessible(true);
      j = ((Integer)((Field)localObject2).get(paramXMLReader)).intValue();
      i = 0;
      while (i < j)
      {
        this.sdD.put(localObject1[(i * 5 + 1)], localObject1[(i * 5 + 4)]);
        i += 1;
      }
      if (!paramBoolean) {
        break label984;
      }
    }
    catch (Exception paramXMLReader) {}
    if (paramString.equalsIgnoreCase("wx-ul")) {
      a(false, q.shk);
    }
    label385:
    label453:
    label496:
    label984:
    label1171:
    label1325:
    label1330:
    label1440:
    label1478:
    label1522:
    label1634:
    label1640:
    label1646:
    label1650:
    label1774:
    for (;;)
    {
      a.sdA = paramEditable;
      GMTrace.o(20619466899456L, 153627);
      return;
      if (paramString.equalsIgnoreCase("wx-ol"))
      {
        a(true, q.shl);
      }
      else
      {
        if (paramString.equalsIgnoreCase("wn-todo"))
        {
          paramString = new a(q.shm, 1, 1);
          this.sdC.push(paramString);
          paramString = (String)this.sdD.get("checked");
          if ((!bg.nm(paramString)) && (paramString.equals("1"))) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            a(paramEditable, new e(((a)this.sdC.peek()).sgP, paramBoolean));
            break;
          }
        }
        if (paramString.equalsIgnoreCase("wx-li"))
        {
          paramString = (String)this.sdD.get("done");
          if ((!bg.nm(paramString)) && (paramString.equals("true")))
          {
            paramBoolean = true;
            if (this.sdC.isEmpty()) {
              break label496;
            }
            paramString = (a)this.sdC.peek();
            paramXMLReader = paramString.sgO;
            i = paramString.sgP;
            if (!paramXMLReader.bIy()) {
              break label453;
            }
            paramString = new d(i);
          }
        }
        for (;;)
        {
          if (paramString == null) {
            break label1774;
          }
          a(paramEditable, paramString);
          break;
          paramBoolean = false;
          break label385;
          if (paramXMLReader.bIx())
          {
            paramString = new f(i);
          }
          else
          {
            int k;
            if (paramXMLReader.bIz())
            {
              paramString = new e(i, paramBoolean);
              continue;
              paramString = new f(0);
              continue;
              if ((paramString.equalsIgnoreCase("wx-font")) || (paramString.equalsIgnoreCase("span")))
              {
                i = Integer.MIN_VALUE;
                paramXMLReader = null;
                paramString = null;
                localObject1 = (String)this.sdD.get("style");
                if (localObject1 != null)
                {
                  String[] arrayOfString = ((String)localObject1).toLowerCase(Locale.ENGLISH).split(";");
                  int m = arrayOfString.length;
                  paramString = null;
                  paramXMLReader = null;
                  i = Integer.MIN_VALUE;
                  j = 0;
                  if (j < m)
                  {
                    String str2 = arrayOfString[j];
                    Matcher localMatcher;
                    int n;
                    if (str2.startsWith("font-size"))
                    {
                      localMatcher = sdE.matcher(str2);
                      localObject1 = paramString;
                      localObject2 = paramXMLReader;
                      k = i;
                      if (localMatcher.find(0))
                      {
                        k = localMatcher.start();
                        n = localMatcher.end();
                      }
                    }
                    for (;;)
                    {
                      try
                      {
                        k = Integer.parseInt(str2.substring(k, n));
                        localObject2 = paramXMLReader;
                        localObject1 = paramString;
                      }
                      catch (NumberFormatException localNumberFormatException)
                      {
                        String str1 = paramString;
                        localObject2 = paramXMLReader;
                        k = i;
                        continue;
                      }
                      j += 1;
                      paramString = (String)localObject1;
                      paramXMLReader = (XMLReader)localObject2;
                      i = k;
                      break;
                      if (str2.startsWith("color"))
                      {
                        localMatcher = sdF.matcher(str2);
                        localObject1 = paramString;
                        localObject2 = paramXMLReader;
                        k = i;
                        if (localMatcher.find(0))
                        {
                          localObject2 = str2.substring(localMatcher.start(), localMatcher.end());
                          localObject1 = paramString;
                          k = i;
                        }
                      }
                      else
                      {
                        localObject1 = paramString;
                        localObject2 = paramXMLReader;
                        k = i;
                        if (str2.startsWith("background-color"))
                        {
                          localMatcher = sdF.matcher(str2);
                          localObject1 = paramString;
                          localObject2 = paramXMLReader;
                          k = i;
                          if (localMatcher.find(0))
                          {
                            localObject1 = str2.substring(localMatcher.start(), localMatcher.end());
                            localObject2 = paramXMLReader;
                            k = i;
                          }
                        }
                      }
                    }
                  }
                }
                localObject1 = (String)this.sdD.get("face");
                j = paramEditable.length();
                localObject2 = new b();
                ((b)localObject2).mSize = i;
                ((b)localObject2).sdH = paramXMLReader;
                ((b)localObject2).sdI = paramString;
                ((b)localObject2).sdJ = ((String)localObject1);
                paramEditable.setSpan(localObject2, j, j, 17);
                break;
              }
              if (paramString.equalsIgnoreCase("wx-b"))
              {
                a(paramEditable, new a());
                break;
              }
              if (paramString.equalsIgnoreCase("wx-p"))
              {
                d(paramEditable);
                break;
              }
              if (!paramString.equalsIgnoreCase("wx-div")) {
                break;
              }
              d(paramEditable);
              break;
              if (paramString.equalsIgnoreCase("wx-ul")) {
                jK(false);
              }
              for (;;)
              {
                this.sdD.clear();
                break;
                if (paramString.equalsIgnoreCase("wx-ol"))
                {
                  jK(true);
                }
                else if (paramString.equalsIgnoreCase("wn-todo"))
                {
                  paramString = (c)a(paramEditable, c.class);
                  if (paramString != null)
                  {
                    if ((paramEditable.length() == 0) || (paramEditable.charAt(paramEditable.length() - 1) != '\n')) {
                      paramEditable.append('\n');
                    }
                    i = paramEditable.getSpanStart(paramString);
                    j = paramEditable.length();
                    boolean bool;
                    if (!paramString.sdL)
                    {
                      k = b.bHn();
                      bool = ((e)paramString).sdM;
                      if (i != j) {
                        break label1171;
                      }
                    }
                    for (paramBoolean = true;; paramBoolean = false)
                    {
                      paramEditable.setSpan(new k(bool, k, paramBoolean, false, false), i, j, 33);
                      paramEditable.removeSpan(paramString);
                      break;
                    }
                  }
                }
                else if (paramString.equalsIgnoreCase("wx-li"))
                {
                  paramXMLReader = (c)a(paramEditable, c.class);
                  if (paramXMLReader != null)
                  {
                    if ((paramEditable.length() == 0) || (paramEditable.charAt(paramEditable.length() - 1) != '\n')) {
                      paramEditable.append('\n');
                    }
                    i = paramEditable.getSpanStart(paramXMLReader);
                    j = paramEditable.length();
                    if (!paramXMLReader.sdL)
                    {
                      k = b.bHn();
                      if (!(paramXMLReader instanceof d)) {
                        break label1330;
                      }
                      if (i != j) {
                        break label1325;
                      }
                    }
                    for (paramBoolean = true;; paramBoolean = false)
                    {
                      paramString = new m(1, k, paramBoolean, false, false);
                      paramEditable.setSpan(paramString, i, j, 33);
                      paramEditable.removeSpan(paramXMLReader);
                      break;
                    }
                    if (i == j) {}
                    for (paramBoolean = true;; paramBoolean = false)
                    {
                      paramString = new d(k, paramBoolean, false, false);
                      break;
                    }
                  }
                }
                else if ((paramString.equalsIgnoreCase("wx-font")) || (paramString.equalsIgnoreCase("span")))
                {
                  j = paramEditable.length();
                  paramString = a(paramEditable, b.class);
                  if (paramString != null)
                  {
                    k = paramEditable.getSpanStart(paramString);
                    paramEditable.removeSpan(paramString);
                    if (k != j)
                    {
                      paramString = (b)paramString;
                      if (!TextUtils.isEmpty(paramString.sdJ))
                      {
                        i = 1;
                        if (i != 0) {
                          paramEditable.setSpan(new TypefaceSpan(paramString.sdJ), k, j, 33);
                        }
                        if (paramString.mSize <= 0) {
                          break label1634;
                        }
                        i = 1;
                        if (i != 0) {
                          paramEditable.setSpan(new AbsoluteSizeSpan(b.yB(paramString.mSize)), k, j, 33);
                        }
                        if (TextUtils.isEmpty(paramString.sdH)) {
                          break label1640;
                        }
                        i = 1;
                        if (i != 0)
                        {
                          i = NG(paramString.sdH);
                          if (i != -1) {
                            paramEditable.setSpan(new ForegroundColorSpan(i | 0xFF000000), k, j, 33);
                          }
                        }
                        if (TextUtils.isEmpty(paramString.sdI)) {
                          break label1646;
                        }
                      }
                      for (i = 1;; i = 0)
                      {
                        if (i == 0) {
                          break label1650;
                        }
                        i = NG(paramString.sdI);
                        if (i == -1) {
                          break;
                        }
                        paramEditable.setSpan(new BackgroundColorSpan(i | 0xFF000000), k, j, 33);
                        break;
                        i = 0;
                        break label1440;
                        i = 0;
                        break label1478;
                        i = 0;
                        break label1522;
                      }
                    }
                  }
                }
                else if (paramString.equalsIgnoreCase("wx-b"))
                {
                  paramString = new BoldSpan();
                  i = paramEditable.length();
                  paramXMLReader = a(paramEditable, a.class);
                  j = paramEditable.getSpanStart(paramXMLReader);
                  paramEditable.removeSpan(paramXMLReader);
                  if (j != i) {
                    paramEditable.setSpan(paramString, j, i, 33);
                  }
                }
                else if (paramString.equalsIgnoreCase("wx-p"))
                {
                  d(paramEditable);
                }
                else
                {
                  paramString.equalsIgnoreCase("wx-div");
                }
              }
            }
            paramString = null;
          }
        }
      }
    }
  }
  
  private static class a
  {
    public a()
    {
      GMTrace.i(20620674859008L, 153636);
      GMTrace.o(20620674859008L, 153636);
    }
  }
  
  private static class b
  {
    int mSize;
    String sdH;
    String sdI;
    String sdJ;
    
    public b()
    {
      GMTrace.i(20621882818560L, 153645);
      this.mSize = Integer.MIN_VALUE;
      GMTrace.o(20621882818560L, 153645);
    }
  }
  
  private static abstract class c
  {
    int sdK;
    boolean sdL;
    
    c(int paramInt, boolean paramBoolean)
    {
      GMTrace.i(20622017036288L, 153646);
      this.sdK = paramInt;
      this.sdL = false;
      GMTrace.o(20622017036288L, 153646);
    }
  }
  
  private static final class d
    extends c.c
  {
    d(int paramInt)
    {
      super(false);
      GMTrace.i(20620540641280L, 153635);
      GMTrace.o(20620540641280L, 153635);
    }
  }
  
  private static final class e
    extends c.c
  {
    boolean sdM;
    
    e(int paramInt, boolean paramBoolean)
    {
      super(false);
      GMTrace.i(20621480165376L, 153642);
      this.sdM = false;
      this.sdM = paramBoolean;
      GMTrace.o(20621480165376L, 153642);
    }
  }
  
  private static final class f
    extends c.c
  {
    f(int paramInt)
    {
      super(false);
      GMTrace.i(20621748600832L, 153644);
      GMTrace.o(20621748600832L, 153644);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */