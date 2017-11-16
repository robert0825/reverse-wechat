package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.d.b.a.a;
import com.tencent.mm.plugin.fts.d.b.a.b;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f
{
  private static b a(SpannableString paramSpannableString, a.a parama, com.tencent.mm.plugin.fts.d.b.a parama1)
  {
    GMTrace.i(18560164298752L, 138284);
    if ((parama1.lAC > 0.0F) && (parama1.gbA != null))
    {
      paramSpannableString = c(paramSpannableString, parama, parama1);
      GMTrace.o(18560164298752L, 138284);
      return paramSpannableString;
    }
    paramSpannableString = b(paramSpannableString, parama, parama1);
    GMTrace.o(18560164298752L, 138284);
    return paramSpannableString;
  }
  
  public static final b a(String paramString1, String paramString2, com.tencent.mm.plugin.fts.d.b.a parama)
  {
    GMTrace.i(18559761645568L, 138281);
    parama = b(parama);
    parama.lAJ = TextUtils.concat(new CharSequence[] { paramString1, parama.lAJ, paramString2 });
    GMTrace.o(18559761645568L, 138281);
    return parama;
  }
  
  public static final List<a.a> a(com.tencent.mm.plugin.fts.d.b.a parama)
  {
    GMTrace.i(18559895863296L, 138282);
    ArrayList localArrayList = new ArrayList();
    if (!parama.isAvailable())
    {
      GMTrace.o(18559895863296L, 138282);
      return localArrayList;
    }
    String str = SpellMap.nj(parama.lAw.toString().toLowerCase());
    Object localObject1 = new ArrayList();
    if (parama.lwN) {
      localObject1 = ae(str, parama.lAy);
    }
    for (;;)
    {
      Object localObject2;
      if (!bg.nm(parama.lAx))
      {
        localObject2 = new a.a();
        if (parama.lwN) {
          a((List)localObject1, parama.lAx, (a.a)localObject2);
        }
        while (((a.a)localObject2).isAvailable())
        {
          localArrayList.add(localObject2);
          GMTrace.o(18559895863296L, 138282);
          return localArrayList;
          a(str, parama.lAx, (a.a)localObject2);
        }
      }
      if (parama.lAz.size() > 0)
      {
        localObject2 = parama.lAz.iterator();
        label251:
        label263:
        while (((Iterator)localObject2).hasNext())
        {
          a.a locala = (a.a)((Iterator)localObject2).next();
          if ((!locala.isAvailable()) && (!bg.nm(locala.lAx)))
          {
            if (!parama.lwN) {
              break label251;
            }
            a((List)localObject1, locala.lAx, locala);
          }
          for (;;)
          {
            if (!locala.isAvailable()) {
              break label263;
            }
            localArrayList.add(locala);
            break;
            a(str, locala.lAx, locala);
          }
        }
      }
      GMTrace.o(18559895863296L, 138282);
      return localArrayList;
    }
  }
  
  private static void a(String paramString1, String paramString2, a.a parama)
  {
    GMTrace.i(18560432734208L, 138286);
    parama.lAx = SpellMap.nj(paramString2.toLowerCase());
    int i = paramString1.indexOf(parama.lAx);
    if (i >= 0)
    {
      parama.lAD = i;
      parama.lAE = (i + parama.lAx.length());
    }
    GMTrace.o(18560432734208L, 138286);
  }
  
  private static void a(List<String> paramList, String paramString, a.a parama)
  {
    GMTrace.i(18560566951936L, 138287);
    parama.lAx = SpellMap.nj(paramString.toLowerCase());
    int i = 0;
    if (i < paramList.size())
    {
      paramString = (String)paramList.get(i);
      int j;
      if (!bg.nm(paramString))
      {
        if (paramString.startsWith(parama.lAx))
        {
          if (parama.lAD < 0) {
            parama.lAD = i;
          }
          parama.lAE = (i + 1);
          GMTrace.o(18560566951936L, 138287);
          return;
        }
        if (parama.lAx.startsWith(paramString)) {
          j = i + 1;
        }
      }
      for (;;)
      {
        if ((j < paramList.size()) && (!bg.nm((String)paramList.get(j))))
        {
          paramString = paramString + (String)paramList.get(j);
          if ((parama.lAx.length() > paramString.length()) && (parama.lAx.startsWith(paramString))) {
            break label231;
          }
          if ((parama.lAx.length() <= paramString.length()) && (paramString.startsWith(parama.lAx)))
          {
            parama.lAD = i;
            parama.lAE = (j + 1);
          }
        }
        i += 1;
        break;
        label231:
        j += 1;
      }
    }
    GMTrace.o(18560566951936L, 138287);
  }
  
  private static List<String> ae(String paramString, boolean paramBoolean)
  {
    GMTrace.i(18560298516480L, 138285);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      String str;
      if (d.h(c))
      {
        str = SpellMap.f(c);
        if ((str != null) && (str.length() > 1)) {
          if (paramBoolean) {
            localArrayList.add(str.substring(0, 1).toLowerCase());
          }
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(str);
        continue;
        localArrayList.add("");
        continue;
        localArrayList.add("");
      }
    }
    GMTrace.o(18560298516480L, 138285);
    return localArrayList;
  }
  
  private static b b(SpannableString paramSpannableString, a.a parama, com.tencent.mm.plugin.fts.d.b.a parama1)
  {
    GMTrace.i(18560701169664L, 138288);
    b localb = new b();
    if (parama1.lAA == a.b.lAG) {
      parama1 = new BackgroundColorSpan(parama1.lAB);
    }
    try
    {
      for (;;)
      {
        paramSpannableString.setSpan(parama1, parama.lAD, parama.lAE, 33);
        localb.lAJ = paramSpannableString;
        localb.aGY = 0;
        GMTrace.o(18560701169664L, 138288);
        return localb;
        parama1 = new ForegroundColorSpan(parama1.lAB);
      }
    }
    catch (Exception parama1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSUIHighlightLogic", parama1, "setSpan %s", new Object[] { parama.toString() });
        localb.lAJ = paramSpannableString;
        localb.aGY = -1;
      }
    }
  }
  
  public static final b b(com.tencent.mm.plugin.fts.d.b.a parama)
  {
    GMTrace.i(18560030081024L, 138283);
    Object localObject4 = parama;
    parama = new b();
    if (!((com.tencent.mm.plugin.fts.d.b.a)localObject4).isAvailable())
    {
      parama.lAJ = bg.aq(((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAw.toString(), "");
      parama.aGY = -1;
      GMTrace.o(18560030081024L, 138283);
      return parama;
    }
    Object localObject1;
    Object localObject7;
    Object localObject5;
    if ((((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAw instanceof SpannableString))
    {
      localObject1 = (SpannableString)((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAw;
      localObject7 = SpellMap.nj(((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAw.toString().toLowerCase());
      localObject5 = new ArrayList();
      if (!((com.tencent.mm.plugin.fts.d.b.a)localObject4).lwN) {
        break label1097;
      }
      localObject5 = ae((String)localObject7, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAy);
    }
    label252:
    label291:
    label352:
    label1091:
    label1094:
    label1097:
    for (;;)
    {
      if (!bg.nm(((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAx))
      {
        Object localObject2 = new a.a();
        if (((com.tencent.mm.plugin.fts.d.b.a)localObject4).lwN) {
          a((List)localObject5, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAx, (a.a)localObject2);
        }
        for (;;)
        {
          if (!((a.a)localObject2).isAvailable()) {
            break label252;
          }
          try
          {
            localObject2 = a((SpannableString)localObject1, (a.a)localObject2, (com.tencent.mm.plugin.fts.d.b.a)localObject4);
            parama = (com.tencent.mm.plugin.fts.d.b.a)localObject2;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              parama.lAJ = ((CharSequence)localObject1);
              parama.aGY = 0;
            }
          }
          GMTrace.o(18560030081024L, 138283);
          return parama;
          localObject1 = new SpannableString(((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAw);
          break;
          a((String)localObject7, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAx, (a.a)localObject2);
        }
      }
      parama.aGY = -1;
      parama.lAJ = ((CharSequence)localObject1);
      Object localObject3;
      Object localObject6;
      if (((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAz.size() > 0)
      {
        localObject3 = null;
        Iterator localIterator = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAz.iterator();
        if (localIterator.hasNext())
        {
          localObject6 = (a.a)localIterator.next();
          if ((!((a.a)localObject6).isAvailable()) && (!bg.nm(((a.a)localObject6).lAx)))
          {
            if (((com.tencent.mm.plugin.fts.d.b.a)localObject4).lwN) {
              a((List)localObject5, ((a.a)localObject6).lAx, (a.a)localObject6);
            }
          }
          else
          {
            if ((!((a.a)localObject6).isAvailable()) || (localObject3 != null)) {
              break label1094;
            }
            localObject3 = localObject6;
          }
        }
      }
      for (;;)
      {
        break label291;
        a((String)localObject7, ((a.a)localObject6).lAx, (a.a)localObject6);
        break label352;
        if (localObject3 == null)
        {
          GMTrace.o(18560030081024L, 138283);
          return parama;
        }
        if ((((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAC > 0.0F) && (((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA != null))
        {
          localObject5 = new com.tencent.mm.plugin.fts.d.b.a();
          for (;;)
          {
            try
            {
              f1 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAC - ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA.getTextSize() * 2.0F;
              f2 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA.measureText("…");
              f3 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA.measureText((CharSequence)localObject1, 0, ((a.a)localObject3).lAD);
              f4 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA.measureText((CharSequence)localObject1, ((a.a)localObject3).lAD, ((a.a)localObject3).lAE);
              f5 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA.measureText((CharSequence)localObject1, ((a.a)localObject3).lAE, ((SpannableString)localObject1).length());
              if (f3 + f4 + f5 >= f1) {
                continue;
              }
              parama = (com.tencent.mm.plugin.fts.d.b.a)localObject1;
            }
            catch (Exception parama)
            {
              float f2;
              float f3;
              float f4;
              float f5;
              ((com.tencent.mm.plugin.fts.d.b.a)localObject5).lAw = ((CharSequence)localObject1);
              continue;
              if (f2 + f4 + f5 >= f1) {
                continue;
              }
              localObject6 = new SpannableStringBuilder();
              ((SpannableStringBuilder)localObject6).append(TextUtils.ellipsize(((SpannableString)localObject1).subSequence(0, ((a.a)localObject3).lAD), ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA, f1 - f4 - f5, TextUtils.TruncateAt.START));
              ((SpannableStringBuilder)localObject6).append(parama);
              ((SpannableStringBuilder)localObject6).append((CharSequence)localObject1, ((a.a)localObject3).lAE, ((SpannableString)localObject1).length());
              parama = new SpannableString((CharSequence)localObject6);
              continue;
              if (f2 + (f2 + f4) < f1) {
                continue;
              }
              localObject3 = new SpannableStringBuilder();
              ((SpannableStringBuilder)localObject3).append(TextUtils.ellipsize(parama, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA, f1, TextUtils.TruncateAt.END));
              parama = new SpannableString((CharSequence)localObject3);
              continue;
              localObject6 = new SpannableStringBuilder();
              float f1 = (f1 - f4) / 2.0F;
              localObject7 = ((SpannableString)localObject1).subSequence(0, ((a.a)localObject3).lAD);
              localObject3 = ((SpannableString)localObject1).subSequence(((a.a)localObject3).lAE, ((SpannableString)localObject1).length());
              ((SpannableStringBuilder)localObject6).append(TextUtils.ellipsize((CharSequence)localObject7, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA, f1, TextUtils.TruncateAt.START));
              ((SpannableStringBuilder)localObject6).append(parama);
              ((SpannableStringBuilder)localObject6).append(TextUtils.ellipsize((CharSequence)localObject3, ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA, f1, TextUtils.TruncateAt.END));
              parama = new SpannableString((CharSequence)localObject6);
              continue;
              localObject4 = localObject5;
            }
            ((com.tencent.mm.plugin.fts.d.b.a)localObject5).lAw = parama;
            ((com.tencent.mm.plugin.fts.d.b.a)localObject5).lwN = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lwN;
            ((com.tencent.mm.plugin.fts.d.b.a)localObject5).lAy = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAy;
            parama = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAz.iterator();
            if (!parama.hasNext()) {
              continue;
            }
            localObject1 = (a.a)parama.next();
            localObject3 = new a.a();
            ((a.a)localObject3).lAx = ((a.a)localObject1).lAx;
            ((com.tencent.mm.plugin.fts.d.b.a)localObject5).lAz.add(localObject3);
            continue;
            parama = new SpannableString(((SpannableString)localObject1).subSequence(((a.a)localObject3).lAD, ((a.a)localObject3).lAE));
            if (f3 + f4 + f2 >= f1) {
              continue;
            }
            localObject6 = new SpannableStringBuilder((CharSequence)localObject1, 0, ((a.a)localObject3).lAD);
            ((SpannableStringBuilder)localObject6).append(parama);
            ((SpannableStringBuilder)localObject6).append(TextUtils.ellipsize(((SpannableString)localObject1).subSequence(((a.a)localObject3).lAE, ((SpannableString)localObject1).length()), ((com.tencent.mm.plugin.fts.d.b.a)localObject4).gbA, f1 - f3 - f4, TextUtils.TruncateAt.END));
            parama = new SpannableString((CharSequence)localObject6);
          }
          break;
        }
        localObject5 = ((com.tencent.mm.plugin.fts.d.b.a)localObject4).lAz.iterator();
        localObject3 = parama;
        if (((Iterator)localObject5).hasNext())
        {
          localObject3 = (a.a)((Iterator)localObject5).next();
          if (!((a.a)localObject3).isAvailable()) {
            break label1091;
          }
          localObject3 = a((SpannableString)localObject1, (a.a)localObject3, (com.tencent.mm.plugin.fts.d.b.a)localObject4);
          if (((b)localObject3).aGY != 0) {
            break label1091;
          }
          parama = (com.tencent.mm.plugin.fts.d.b.a)localObject3;
        }
        for (;;)
        {
          break;
          localObject3 = parama;
          GMTrace.o(18560030081024L, 138283);
          return (b)localObject3;
        }
      }
    }
  }
  
  private static b c(SpannableString paramSpannableString, a.a parama, com.tencent.mm.plugin.fts.d.b.a parama1)
  {
    GMTrace.i(18560835387392L, 138289);
    b localb = new b();
    float f1 = parama1.lAC - parama1.gbA.getTextSize() * 2.0F;
    float f2 = parama1.gbA.measureText("…");
    float f3 = parama1.gbA.measureText(paramSpannableString, 0, parama.lAD);
    float f4 = parama1.gbA.measureText(paramSpannableString, parama.lAD, parama.lAE);
    float f5 = parama1.gbA.measureText(paramSpannableString, parama.lAE, paramSpannableString.length());
    if (f3 + f4 + f5 < f1)
    {
      paramSpannableString = b(paramSpannableString, parama, parama1);
      GMTrace.o(18560835387392L, 138289);
      return paramSpannableString;
    }
    Object localObject;
    SpannableString localSpannableString;
    if (parama1.lAA == a.b.lAG)
    {
      localObject = new BackgroundColorSpan(parama1.lAB);
      localSpannableString = new SpannableString(paramSpannableString.subSequence(parama.lAD, parama.lAE));
    }
    for (;;)
    {
      try
      {
        localSpannableString.setSpan(localObject, 0, localSpannableString.length(), 33);
        if (f3 + f4 + f2 >= f1) {
          break label342;
        }
        localObject = new SpannableStringBuilder(paramSpannableString, 0, parama.lAD);
        ((SpannableStringBuilder)localObject).append(localSpannableString);
        ((SpannableStringBuilder)localObject).append(TextUtils.ellipsize(paramSpannableString.subSequence(parama.lAE, paramSpannableString.length()), parama1.gbA, f1 - f3 - f4, TextUtils.TruncateAt.END));
        localb.lAJ = ((CharSequence)localObject);
        localb.aGY = 0;
        GMTrace.o(18560835387392L, 138289);
        return localb;
      }
      catch (Exception parama1)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTSUIHighlightLogic", parama1, "setSpan %s", new Object[] { parama.toString() });
        localb.aGY = -1;
        localb.lAJ = paramSpannableString;
        GMTrace.o(18560835387392L, 138289);
        return localb;
      }
      localObject = new ForegroundColorSpan(parama1.lAB);
      break;
      label342:
      if (f2 + f4 + f5 < f1)
      {
        localObject = new SpannableStringBuilder();
        ((SpannableStringBuilder)localObject).append(TextUtils.ellipsize(paramSpannableString.subSequence(0, parama.lAD), parama1.gbA, f1 - f4 - f5, TextUtils.TruncateAt.START));
        ((SpannableStringBuilder)localObject).append(localSpannableString);
        ((SpannableStringBuilder)localObject).append(paramSpannableString, parama.lAE, paramSpannableString.length());
        localb.lAJ = ((CharSequence)localObject);
      }
      else if (f2 + f4 + f2 >= f1)
      {
        paramSpannableString = new SpannableStringBuilder();
        paramSpannableString.append(TextUtils.ellipsize(localSpannableString, parama1.gbA, f1, TextUtils.TruncateAt.END));
        localb.lAJ = paramSpannableString;
      }
      else
      {
        localObject = new SpannableStringBuilder();
        f1 = (f1 - f4) / 2.0F;
        CharSequence localCharSequence = paramSpannableString.subSequence(0, parama.lAD);
        paramSpannableString = paramSpannableString.subSequence(parama.lAE, paramSpannableString.length());
        ((SpannableStringBuilder)localObject).append(TextUtils.ellipsize(localCharSequence, parama1.gbA, f1, TextUtils.TruncateAt.START));
        ((SpannableStringBuilder)localObject).append(localSpannableString);
        ((SpannableStringBuilder)localObject).append(TextUtils.ellipsize(paramSpannableString, parama1.gbA, f1, TextUtils.TruncateAt.END));
        localb.lAJ = ((CharSequence)localObject);
      }
    }
  }
  
  public static final class a
  {
    public static int lzA;
    
    static
    {
      GMTrace.i(18561909129216L, 138297);
      lzA = 0;
      Context localContext = ab.getContext();
      lzA = com.tencent.mm.br.a.ef(localContext) - com.tencent.mm.br.a.V(localContext, j.b.lzK) * 2 - com.tencent.mm.br.a.V(localContext, j.b.aQy) - com.tencent.mm.br.a.V(localContext, j.b.lzK);
      GMTrace.o(18561909129216L, 138297);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */