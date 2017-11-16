package com.tencent.mm.plugin.wenote.model.nativenote.a;

import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.ParagraphStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.j;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.BoldSpan;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.a;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.d;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.k;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.m;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.q;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.r;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public final class b
{
  private static int a(Stack<a> paramStack, StringBuilder paramStringBuilder)
  {
    int i = 0;
    GMTrace.i(20621211729920L, 153640);
    if (!paramStack.isEmpty())
    {
      paramStack = (a)paramStack.pop();
      String str = paramStack.sgO.sho;
      int j = paramStack.sgQ;
      while (i < j)
      {
        paramStringBuilder.append(str);
        i += 1;
      }
      i = paramStack.sgQ;
      GMTrace.o(20621211729920L, 153640);
      return i;
    }
    GMTrace.o(20621211729920L, 153640);
    return 0;
  }
  
  public static String a(Spanned paramSpanned)
  {
    GMTrace.i(17215973752832L, 128269);
    if ((paramSpanned == null) || (bg.nm(paramSpanned.toString())))
    {
      GMTrace.o(17215973752832L, 128269);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramSpanned, localStringBuilder);
    paramSpanned = localStringBuilder.toString();
    GMTrace.o(17215973752832L, 128269);
    return paramSpanned;
  }
  
  private static Set<r> a(Spanned paramSpanned, e parame)
  {
    GMTrace.i(20620943294464L, 153638);
    HashSet localHashSet = new HashSet();
    paramSpanned = (ParagraphStyle[])paramSpanned.getSpans(parame.Vw, parame.vt, ParagraphStyle.class);
    int j = paramSpanned.length;
    int i = 0;
    while (i < j)
    {
      parame = paramSpanned[i];
      q localq = q.a(parame);
      if (localq != null) {
        localHashSet.add(new r(localq, parame));
      }
      i += 1;
    }
    GMTrace.o(20620943294464L, 153638);
    return localHashSet;
  }
  
  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder)
  {
    GMTrace.i(17216107970560L, 128270);
    ArrayList localArrayList = new j(paramSpanned).sfq;
    Stack localStack = new Stack();
    int m = localArrayList.size();
    int i = 0;
    if (i < m)
    {
      n localn = (n)localArrayList.get(i);
      Object localObject2 = a(paramSpanned, localn);
      q localq = null;
      Object localObject3 = ((Set)localObject2).iterator();
      do
      {
        localObject1 = localq;
        if (!((Iterator)localObject3).hasNext()) {
          break;
        }
        localObject1 = (r)((Iterator)localObject3).next();
      } while (!((r)localObject1).sgO.shp);
      Object localObject1 = ((r)localObject1).sgO;
      localq = q.shj;
      localObject2 = ((Set)localObject2).iterator();
      int j = 0;
      int k;
      label194:
      Object localObject4;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (r)((Iterator)localObject2).next();
        boolean bool;
        if ((((r)localObject3).sgO.bIx()) || (((r)localObject3).sgO.bIy()) || (((r)localObject3).sgO.bIz()))
        {
          k = 1;
          j += k;
          localObject4 = ((r)localObject3).sgO;
          if (!((r)localObject3).sgO.bIx()) {
            break label249;
          }
          bool = ((d)((r)localObject3).shv).sgU;
          label230:
          if (!bool) {
            break label309;
          }
          localq = q.shj;
        }
        for (;;)
        {
          break;
          k = 0;
          break label194;
          label249:
          if (((r)localObject3).sgO.bIy())
          {
            bool = ((m)((r)localObject3).shv).sgU;
            break label230;
          }
          if (((r)localObject3).sgO.bIz())
          {
            bool = ((k)((r)localObject3).shv).sgU;
            break label230;
          }
          bool = true;
          break label230;
          label309:
          if (((q)localObject4).bIx()) {
            localq = q.shk;
          } else if (((q)localObject4).bIy()) {
            localq = q.shl;
          } else if (((q)localObject4).bIz()) {
            localq = q.shm;
          }
        }
      }
      a(localStack, paramStringBuilder, new a(localq, j, 0));
      if (localq.bIz())
      {
        localObject2 = (k[])paramSpanned.getSpans(localn.Vw, localn.vt, k.class);
        if (localObject2.length > 0)
        {
          localq.sht = localObject2[0].sha;
          j = localq.shq.indexOf("\"") + 1;
          k = localq.shq.lastIndexOf("\"");
          if (j < k)
          {
            localObject3 = localq.shq.substring(j, k);
            if (!bg.nm((String)localObject3))
            {
              localObject4 = ((String)localObject3).trim();
              if (!localq.sht) {
                break label671;
              }
              localObject2 = "1";
              label497:
              if (!((String)localObject4).equals(localObject2))
              {
                localObject4 = localq.shq;
                if (!localq.sht) {
                  break label679;
                }
              }
            }
          }
        }
      }
      label671:
      label679:
      for (localObject2 = "1";; localObject2 = "0")
      {
        localq.shq = ((String)localObject4).replaceAll((String)localObject3, (String)localObject2);
        paramStringBuilder.append(localq.shq);
        if (localObject1 != null) {
          paramStringBuilder.append(((q)localObject1).shn);
        }
        j = localn.Vw;
        k = localn.vt;
        localObject2 = new TreeSet(new Comparator() {});
        ((SortedSet)localObject2).addAll(Arrays.asList(paramSpanned.getSpans(j, k, CharacterStyle.class)));
        a(paramSpanned, paramStringBuilder, j, k, (SortedSet)localObject2);
        if (localObject1 != null)
        {
          a(paramStringBuilder, (q)localObject1);
          paramStringBuilder.append(((q)localObject1).sho);
        }
        a(paramStringBuilder, localq);
        paramStringBuilder.append(localq.shr);
        i += 1;
        break;
        localObject2 = "0";
        break label497;
      }
    }
    while (!localStack.isEmpty()) {
      a(localStack, paramStringBuilder);
    }
    GMTrace.o(17216107970560L, 128270);
  }
  
  private static void a(Spanned paramSpanned, StringBuilder paramStringBuilder, int paramInt1, int paramInt2, SortedSet<CharacterStyle> paramSortedSet)
  {
    GMTrace.i(17216242188288L, 128271);
    while (paramInt1 < paramInt2)
    {
      CharacterStyle localCharacterStyle;
      int i;
      label37:
      int j;
      label47:
      label61:
      char c;
      if (paramSortedSet.isEmpty())
      {
        localCharacterStyle = null;
        if (localCharacterStyle != null) {
          break label113;
        }
        i = Integer.MAX_VALUE;
        if (localCharacterStyle != null) {
          break label126;
        }
        j = Integer.MAX_VALUE;
        if (paramInt1 >= i) {
          break label302;
        }
        j = Math.min(paramInt2, i);
        if (paramInt1 >= j) {
          break label296;
        }
        c = paramSpanned.charAt(paramInt1);
        if (c != '\n') {
          break label139;
        }
        paramStringBuilder.append("<br/>");
      }
      for (;;)
      {
        paramInt1 += 1;
        break label61;
        localCharacterStyle = (CharacterStyle)paramSortedSet.first();
        break;
        label113:
        i = paramSpanned.getSpanStart(localCharacterStyle);
        break label37;
        label126:
        j = paramSpanned.getSpanEnd(localCharacterStyle);
        break label47;
        label139:
        if (c == '<')
        {
          paramStringBuilder.append("&lt;");
        }
        else if (c == '>')
        {
          paramStringBuilder.append("&gt;");
        }
        else if (c == '&')
        {
          paramStringBuilder.append("&amp;");
        }
        else if (c == ' ')
        {
          while ((paramInt1 + 1 < j) && (paramSpanned.charAt(paramInt1 + 1) == ' '))
          {
            paramStringBuilder.append("&nbsp;");
            paramInt1 += 1;
          }
          paramStringBuilder.append(' ');
        }
        else if (c < ' ')
        {
          paramStringBuilder.append("&#" + c + ";");
        }
        else
        {
          paramStringBuilder.append(c);
        }
      }
      label296:
      paramInt1 = i;
      continue;
      label302:
      paramSortedSet.remove(localCharacterStyle);
      a(localCharacterStyle, paramStringBuilder);
      a(paramSpanned, paramStringBuilder, Math.max(i, paramInt1), Math.min(j, paramInt2), paramSortedSet);
      if ((localCharacterStyle instanceof ForegroundColorSpan)) {
        paramStringBuilder.append("</wx-font>");
      }
      for (;;)
      {
        paramInt1 = j;
        break;
        if ((localCharacterStyle instanceof BackgroundColorSpan)) {
          paramStringBuilder.append("</wx-font>");
        } else if ((localCharacterStyle instanceof AbsoluteSizeSpan)) {
          paramStringBuilder.append("</wx-font>");
        } else if ((localCharacterStyle instanceof UnderlineSpan)) {
          paramStringBuilder.append("</u>");
        } else if ((localCharacterStyle instanceof BoldSpan)) {
          paramStringBuilder.append("</wx-b>");
        } else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 2)) {
          paramStringBuilder.append("</i>");
        } else if (((localCharacterStyle instanceof StyleSpan)) && (((StyleSpan)localCharacterStyle).getStyle() == 1)) {
          paramStringBuilder.append("</wx-b>");
        } else if ((localCharacterStyle instanceof RelativeSizeSpan)) {
          paramStringBuilder.append("</wx-font>");
        }
      }
    }
    GMTrace.o(17216242188288L, 128271);
  }
  
  private static void a(StringBuilder paramStringBuilder, q paramq)
  {
    GMTrace.i(20620809076736L, 153637);
    if ((paramq.shs) && (paramStringBuilder.length() >= 5))
    {
      int i = paramStringBuilder.length() - 5;
      int j = paramStringBuilder.length();
      if (paramStringBuilder.subSequence(i, j).equals("<br/>")) {
        paramStringBuilder.delete(i, j);
      }
    }
    GMTrace.o(20620809076736L, 153637);
  }
  
  private static void a(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    GMTrace.i(20621077512192L, 153639);
    Object localObject;
    for (;;)
    {
      int i = 0;
      localObject = q.shj;
      if (!paramStack.isEmpty())
      {
        localObject = (a)paramStack.peek();
        i = ((a)localObject).sgP;
        localObject = ((a)localObject).sgO;
      }
      if (parama.sgP > i)
      {
        parama.sgQ = (parama.sgP - i);
        b(paramStack, paramStringBuilder, parama);
        GMTrace.o(20621077512192L, 153639);
        return;
      }
      if (parama.sgP >= i) {
        break;
      }
      a(paramStack, paramStringBuilder);
    }
    if (parama.sgO != localObject)
    {
      parama.sgQ = a(paramStack, paramStringBuilder);
      b(paramStack, paramStringBuilder, parama);
    }
    GMTrace.o(20621077512192L, 153639);
  }
  
  private static boolean a(CharacterStyle paramCharacterStyle, StringBuilder paramStringBuilder)
  {
    GMTrace.i(17216376406016L, 128272);
    if ((paramCharacterStyle instanceof BoldSpan)) {
      paramStringBuilder.append("<wx-b>");
    }
    for (;;)
    {
      GMTrace.o(17216376406016L, 128272);
      return true;
      if (((paramCharacterStyle instanceof StyleSpan)) && (((StyleSpan)paramCharacterStyle).getStyle() == 1))
      {
        paramStringBuilder.append("<wx-b>");
      }
      else if (((paramCharacterStyle instanceof StyleSpan)) && (((StyleSpan)paramCharacterStyle).getStyle() == 2))
      {
        paramStringBuilder.append("<i>");
      }
      else if ((paramCharacterStyle instanceof UnderlineSpan))
      {
        paramStringBuilder.append("<u>");
      }
      else if ((paramCharacterStyle instanceof RelativeSizeSpan))
      {
        paramStringBuilder.append("<wx-font style=\"font-size:");
        paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.yC((int)(((RelativeSizeSpan)paramCharacterStyle).getSizeChange() * com.tencent.mm.plugin.wenote.model.nativenote.manager.b.getTextSize())));
        paramStringBuilder.append("px\">");
      }
      else if ((paramCharacterStyle instanceof AbsoluteSizeSpan))
      {
        paramStringBuilder.append("<wx-font style=\"font-size:");
        paramStringBuilder.append(com.tencent.mm.plugin.wenote.model.nativenote.manager.b.yC(((AbsoluteSizeSpan)paramCharacterStyle).getSize()));
        paramStringBuilder.append("px\">");
      }
      else if ((paramCharacterStyle instanceof ForegroundColorSpan))
      {
        paramStringBuilder.append("<wx-font style=\"color:#");
        for (paramCharacterStyle = Integer.toHexString(((ForegroundColorSpan)paramCharacterStyle).getForegroundColor() + 16777216); paramCharacterStyle.length() < 6; paramCharacterStyle = "0" + paramCharacterStyle) {}
        paramStringBuilder.append(paramCharacterStyle);
        paramStringBuilder.append("\">");
      }
      else if ((paramCharacterStyle instanceof BackgroundColorSpan))
      {
        paramStringBuilder.append("<wx-font style=\"background-color:#");
        for (paramCharacterStyle = Integer.toHexString(((BackgroundColorSpan)paramCharacterStyle).getBackgroundColor() + 16777216); paramCharacterStyle.length() < 6; paramCharacterStyle = "0" + paramCharacterStyle) {}
        paramStringBuilder.append(paramCharacterStyle);
        paramStringBuilder.append("\">");
      }
    }
  }
  
  private static void b(Stack<a> paramStack, StringBuilder paramStringBuilder, a parama)
  {
    GMTrace.i(20621345947648L, 153641);
    String str = parama.sgO.shn;
    int j = parama.sgQ;
    int i = 0;
    while (i < j)
    {
      paramStringBuilder.append(str);
      i += 1;
    }
    paramStack.push(parama);
    GMTrace.o(20621345947648L, 153641);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */