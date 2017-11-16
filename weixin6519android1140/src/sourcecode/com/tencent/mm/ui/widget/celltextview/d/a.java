package com.tencent.mm.ui.widget.celltextview.d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.celltextview.b.a.b;
import com.tencent.mm.ui.widget.celltextview.c.d;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ui.widget.celltextview.b.a.a
{
  private int JE;
  private int dA;
  private int dB;
  private TextPaint iOt;
  private int ia;
  private Context mContext;
  private float mej;
  private int tAm;
  private int whY;
  private int xj;
  private a.b xtI;
  private com.tencent.mm.ui.widget.celltextview.f.a xtJ;
  private int xtK;
  private int xtL;
  private int xtM;
  private float xtN;
  private boolean xtO;
  private CharSequence xtP;
  private int xtQ;
  private int xtR;
  private int xtS;
  private int xtT;
  private int xtU;
  private boolean xtV;
  private Drawable xtW;
  private int xtX;
  private LinkedList<a> xtY;
  private LinkedList<a> xtZ;
  private ArrayList<e> xth;
  private LinkedList<com.tencent.mm.ui.widget.celltextview.c.b> xti;
  private ArrayList<d> xtn;
  private float xto;
  private com.tencent.mm.ui.widget.celltextview.c.b xua;
  private int xub;
  int yvV;
  
  public a(Context paramContext, TextPaint paramTextPaint)
  {
    GMTrace.i(18745250545664L, 139663);
    this.xj = -16777216;
    this.xtK = Integer.MAX_VALUE;
    this.xtO = true;
    this.xtU = -16776961;
    this.xtV = true;
    this.yvV = 0;
    this.mContext = paramContext;
    this.xtn = new ArrayList();
    this.xtJ = new com.tencent.mm.ui.widget.celltextview.f.b();
    this.mej = com.tencent.mm.ui.widget.celltextview.g.b.f(paramContext, 14.0F);
    this.xtT = ((int)com.tencent.mm.ui.widget.celltextview.g.b.f(paramContext, 6.0F));
    this.iOt = paramTextPaint;
    this.iOt.setColor(this.xj);
    this.iOt.setTextSize(this.mej);
    GMTrace.o(18745250545664L, 139663);
  }
  
  private void Ev(int paramInt)
  {
    GMTrace.i(18749142859776L, 139692);
    if ((this.xth == null) || (this.xth.size() == 0))
    {
      GMTrace.o(18749142859776L, 139692);
      return;
    }
    this.xtn.clear();
    d locald = cjG();
    int i = 0;
    e locale;
    Object localObject2;
    if (i < this.xth.size())
    {
      locale = (e)this.xth.get(i);
      locale.cjE();
      localObject2 = locale;
      label85:
      if ((localObject2 != null) && (!TextUtils.isEmpty(((e)localObject2).getText()))) {
        if ((this.xtK <= 0) || (this.xtK >= this.xtn.size())) {}
      }
    }
    for (i = 1;; i = 0)
    {
      if (i != 0) {
        Ew(paramInt);
      }
      GMTrace.o(18749142859776L, 139692);
      return;
      int j = paramInt - this.xub;
      Object localObject1 = this.xtJ;
      TextPaint localTextPaint = this.iOt;
      boolean bool;
      label181:
      float f1;
      int k;
      float f2;
      if (i < this.xth.size() - 1)
      {
        bool = true;
        localObject1 = ((com.tencent.mm.ui.widget.celltextview.f.a)localObject1).a((e)localObject2, localTextPaint, j, paramInt, bool);
        f1 = this.xtJ.b(this.iOt);
        k = ((com.tencent.mm.ui.widget.celltextview.c.a)localObject1).xtt;
        f2 = ((com.tencent.mm.ui.widget.celltextview.c.a)localObject1).width;
        if (k <= 0) {
          break label484;
        }
        if ((((e)localObject2).cjB()) || (f2 <= j) || (f2 - j <= f1)) {
          break label337;
        }
        localObject1 = localObject2;
      }
      label337:
      label484:
      do
      {
        for (;;)
        {
          this.yvV = k;
          if ((localObject1 != null) || ((df(locale.getText(), locale.getText().length() - 1) != '\n') && ((i + 1 >= this.xth.size()) || (paramInt - this.xub > 0)))) {
            break label512;
          }
          locald = cjG();
          localObject2 = localObject1;
          break;
          bool = false;
          break label181;
          localObject1 = ((e)localObject2).cjC();
          ((e)localObject1).x(0, k, null);
          f1 = 0.0F;
          j = 0;
          while (j < this.xtn.size() - 1)
          {
            f1 += ((d)this.xtn.get(j)).xtA;
            j += 1;
          }
          locald.a((e)localObject1, new RectF(this.xub, f1, this.xub + f2, ((e)localObject1).Eq(this.xtT) + f1));
          this.xub = ((int)(this.xub + f2));
          if (k >= ((e)localObject2).getLength())
          {
            localObject1 = null;
          }
          else
          {
            localObject1 = ((e)localObject2).cjC();
            ((e)localObject1).x(k, -1, null);
          }
        }
        localObject1 = localObject2;
      } while (this.yvV != 0);
      w.e("CellLayout", "lastBreakAt == 0 and nowBreakAt == 0");
      throw new Exception("lastBreakAt == 0 and nowBreakAt == 0");
      label512:
      localObject2 = localObject1;
      if (localObject1 == null) {
        break label85;
      }
      locald = cjG();
      localObject2 = localObject1;
      break label85;
      i += 1;
      break;
      cjH();
    }
  }
  
  private void Ew(int paramInt)
  {
    GMTrace.i(18749411295232L, 139694);
    if (this.xtn.size() < 2) {
      cjG();
    }
    d locald = (d)this.xtn.get(this.xtn.size() - 2);
    float f1 = this.iOt.measureText("...", 0, 3);
    this.xub = 0;
    int k = locald.getSize();
    int i = 0;
    Object localObject1;
    Object localObject2;
    if (i < k)
    {
      localObject1 = locald.Er(i);
      int m = (int)(paramInt - f1 - this.xub);
      if (m <= 0)
      {
        GMTrace.o(18749411295232L, 139694);
        return;
      }
      localObject2 = this.xtJ;
      TextPaint localTextPaint = this.iOt;
      if (i < k - 1) {}
      int j;
      for (boolean bool = true;; bool = false)
      {
        localObject2 = ((com.tencent.mm.ui.widget.celltextview.f.a)localObject2).a((e)localObject1, localTextPaint, m, paramInt, bool);
        j = ((com.tencent.mm.ui.widget.celltextview.c.a)localObject2).xtt;
        float f2 = locald.Es(i).width();
        if (f2 > m) {
          break label210;
        }
        this.xub = ((int)(this.xub + f2));
        i += 1;
        break;
      }
      label210:
      if (((e)localObject1).cjB())
      {
        paramInt = j;
        if (df(((e)localObject1).getText(), j - 1) == '\n') {
          paramInt = j - 1;
        }
        ((e)localObject1).x(0, paramInt, "...");
        locald.Et(i + 1);
        this.xub = ((int)(this.xub + ((com.tencent.mm.ui.widget.celltextview.c.a)localObject2).width));
        paramInt = 1;
      }
    }
    for (;;)
    {
      this.xub += (int)f1;
      i = paramInt;
      if (this.xtn.size() == 2)
      {
        i = paramInt;
        if (paramInt == 0)
        {
          i = paramInt;
          if (((d)this.xtn.get(1)).Er(0) == null)
          {
            localObject1 = locald.Er(locald.getSize() - 1);
            i = paramInt;
            if (localObject1 != null)
            {
              i = paramInt;
              if (((e)localObject1).cjB())
              {
                ((e)localObject1).x(0, -1, "...");
                i = 1;
              }
            }
          }
        }
      }
      if (this.xub > this.xto) {}
      for (f1 = this.xub;; f1 = this.xto)
      {
        this.xto = f1;
        if (i == 0) {
          break label435;
        }
        GMTrace.o(18749411295232L, 139694);
        return;
        locald.Et(i);
        paramInt = 0;
        break;
      }
      label435:
      localObject1 = new RectF(locald.Es(locald.getSize() - 1));
      localObject2 = locald.Er(locald.getSize() - 1);
      if ((((e)localObject2).cjB()) && (((e)localObject2).getText().endsWith("\n"))) {
        ((e)localObject2).x(0, ((e)localObject2).getText().length() - 1, null);
      }
      ((RectF)localObject1).left = ((RectF)localObject1).right;
      ((RectF)localObject1).right = this.xub;
      locald.a(new e(this.iOt, 0, "...", this.mej), (RectF)localObject1);
      GMTrace.o(18749411295232L, 139694);
      return;
      paramInt = 0;
    }
  }
  
  private int aC(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(18749948166144L, 139698);
    if ((paramLinkedList == null) || (paramLinkedList.isEmpty()))
    {
      GMTrace.o(18749948166144L, 139698);
      return 0;
    }
    paramLinkedList = paramLinkedList.iterator();
    for (int i = 0; paramLinkedList.hasNext(); i = ((a)paramLinkedList.next()).xud.width() + this.whY + i) {}
    GMTrace.o(18749948166144L, 139698);
    return i;
  }
  
  private int cjF()
  {
    GMTrace.i(20302444625920L, 151265);
    Iterator localIterator = this.xtn.iterator();
    d locald;
    float f;
    for (int i = 0; localIterator.hasNext(); i = (int)(locald.xtA + f))
    {
      locald = (d)localIterator.next();
      f = i;
    }
    GMTrace.o(20302444625920L, 151265);
    return i;
  }
  
  private d cjG()
  {
    GMTrace.i(18749545512960L, 139695);
    cjH();
    this.xub = 0;
    d locald = new d();
    locald.xtA = 0.0F;
    this.xtn.add(locald);
    GMTrace.o(18749545512960L, 139695);
    return locald;
  }
  
  private void cjH()
  {
    GMTrace.i(18749679730688L, 139696);
    int k = this.xtn.size() - 1;
    if (k < 0)
    {
      GMTrace.o(18749679730688L, 139696);
      return;
    }
    d locald = (d)this.xtn.get(k);
    int j = 0;
    int i = 0;
    while (j < locald.getSize())
    {
      i += locald.Er(j).getLength();
      j += 1;
    }
    if (k == 0)
    {
      locald.eL(0, i);
      GMTrace.o(18749679730688L, 139696);
      return;
    }
    j = ((d)this.xtn.get(k - 1)).xtC;
    locald.eL(j, j + i);
    GMTrace.o(18749679730688L, 139696);
  }
  
  private void cjI()
  {
    GMTrace.i(20302578843648L, 151266);
    if (this.xti == null)
    {
      GMTrace.o(20302578843648L, 151266);
      return;
    }
    Iterator localIterator = this.xti.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.ui.widget.celltextview.c.b localb = (com.tencent.mm.ui.widget.celltextview.c.b)localIterator.next();
      int k = localb.Vw;
      int m = localb.vt;
      Object localObject1 = new LinkedList();
      LinkedList localLinkedList = new LinkedList();
      Object localObject2 = this.xtn.iterator();
      d locald;
      if (((Iterator)localObject2).hasNext())
      {
        locald = (d)((Iterator)localObject2).next();
        if ((locald.xtB > k) || (k > locald.xtC)) {
          break label412;
        }
        if ((locald.xtB <= m) && (m <= locald.xtC)) {
          ((LinkedList)localObject1).add(locald);
        }
      }
      else
      {
        label168:
        localObject1 = ((LinkedList)localObject1).iterator();
      }
      label412:
      label619:
      for (;;)
      {
        if (!((Iterator)localObject1).hasNext()) {
          break label621;
        }
        localObject2 = (d)((Iterator)localObject1).next();
        w.i("CellLayout", "[getLineIndex] line:[%s:%s]", new Object[] { Integer.valueOf(((d)localObject2).xtB), Integer.valueOf(((d)localObject2).xtC) });
        int j = ((d)localObject2).xtB;
        float f2 = -1.0F;
        float f1 = -1.0F;
        int i = 0;
        float f3;
        for (;;)
        {
          if (i < ((d)localObject2).getSize())
          {
            int n = ((d)localObject2).Er(i).getLength();
            f3 = f2;
            if (j <= k)
            {
              f3 = f2;
              if (k <= j + n) {
                f3 = (int)(((d)localObject2).Es(i).left + ((d)localObject2).Er(i).m(k - j, ((d)localObject2).xtD));
              }
            }
            f2 = f1;
            if (j <= m)
            {
              f2 = f1;
              if (m < j + n) {
                f2 = (int)(((d)localObject2).Es(i).left + ((d)localObject2).Er(i).m(m - j, ((d)localObject2).xtD));
              }
            }
            j += n;
            i += 1;
            f1 = f2;
            f2 = f3;
            continue;
            ((LinkedList)localObject1).add(locald);
            break;
            if ((locald.xtB <= m) && (m <= locald.xtC))
            {
              ((LinkedList)localObject1).add(locald);
              break label168;
            }
            if (((LinkedList)localObject1).size() <= 0) {
              break;
            }
            ((LinkedList)localObject1).add(locald);
            break;
          }
        }
        float f4;
        if ((f2 >= 0.0F) && (f1 < 0.0F))
        {
          f3 = ((d)localObject2).xtz;
          f4 = f2;
        }
        for (;;)
        {
          if ((f4 < 0.0F) || (f3 < 0.0F) || (f4 >= f3)) {
            break label619;
          }
          w.i("CellLayout", "[getLineIndex] rect:[%s:%s]", new Object[] { Float.valueOf(f4), Float.valueOf(f3) });
          localLinkedList.add(new RectF(f4, ((d)localObject2).Es(0).top, f3, ((d)localObject2).Es(0).bottom));
          break;
          if ((f2 < 0.0F) && (f1 >= 0.0F))
          {
            f4 = 0.0F;
            f3 = f1;
          }
          else
          {
            f3 = f1;
            f4 = f2;
            if (f2 < 0.0F)
            {
              f3 = f1;
              f4 = f2;
              if (f1 < 0.0F)
              {
                f4 = 0.0F;
                f3 = ((d)localObject2).xtz;
              }
            }
          }
        }
      }
      label621:
      localb.xtv = localLinkedList;
    }
    GMTrace.o(20302578843648L, 151266);
  }
  
  private static char df(String paramString, int paramInt)
  {
    GMTrace.i(18749813948416L, 139697);
    if ((paramInt >= 0) && (paramString != null) && (paramInt < paramString.length()))
    {
      char c = paramString.charAt(paramInt);
      GMTrace.o(18749813948416L, 139697);
      return c;
    }
    GMTrace.o(18749813948416L, 139697);
    return '\000';
  }
  
  public final void Em(int paramInt)
  {
    GMTrace.i(18745921634304L, 139668);
    this.xtK = paramInt;
    GMTrace.o(18745921634304L, 139668);
  }
  
  public final void En(int paramInt)
  {
    GMTrace.i(18747263811584L, 139678);
    this.xtS = paramInt;
    GMTrace.o(18747263811584L, 139678);
  }
  
  public final void Eo(int paramInt)
  {
    GMTrace.i(18747398029312L, 139679);
    this.xtT = paramInt;
    GMTrace.o(18747398029312L, 139679);
  }
  
  public final void Ep(int paramInt)
  {
    GMTrace.i(18747666464768L, 139681);
    this.xtU = paramInt;
    GMTrace.o(18747666464768L, 139681);
  }
  
  public final void a(com.tencent.mm.ui.widget.celltextview.c.b paramb)
  {
    GMTrace.i(18746726940672L, 139674);
    this.xua = paramb;
    GMTrace.o(18746726940672L, 139674);
  }
  
  public final void a(ArrayList<e> paramArrayList, CharSequence paramCharSequence)
  {
    GMTrace.i(18746458505216L, 139672);
    this.xth = paramArrayList;
    this.xtP = paramCharSequence;
    GMTrace.o(18746458505216L, 139672);
  }
  
  public final void aB(LinkedList<com.tencent.mm.ui.widget.celltextview.c.b> paramLinkedList)
  {
    GMTrace.i(19011001647104L, 141643);
    this.xti = paramLinkedList;
    GMTrace.o(19011001647104L, 141643);
  }
  
  public final String cjA()
  {
    GMTrace.i(18917049237504L, 140943);
    if (this.xth == null)
    {
      GMTrace.o(18917049237504L, 140943);
      return "";
    }
    Object localObject = new StringBuilder();
    Iterator localIterator = this.xth.iterator();
    while (localIterator.hasNext())
    {
      String str = ((e)localIterator.next()).getText();
      if (str != null) {
        ((StringBuilder)localObject).append(str);
      }
    }
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(18917049237504L, 140943);
    return (String)localObject;
  }
  
  public final List<com.tencent.mm.ui.widget.celltextview.c.b> cjz()
  {
    GMTrace.i(18746861158400L, 139675);
    LinkedList localLinkedList = this.xti;
    GMTrace.o(18746861158400L, 139675);
    return localLinkedList;
  }
  
  public final int getMaxLines()
  {
    GMTrace.i(18748069117952L, 139684);
    int i = this.xtK;
    GMTrace.o(18748069117952L, 139684);
    return i;
  }
  
  public final int getMeasuredHeight()
  {
    GMTrace.i(18748471771136L, 139687);
    int i = (int)this.xtN;
    GMTrace.o(18748471771136L, 139687);
    return i;
  }
  
  public final int getMeasuredWidth()
  {
    GMTrace.i(18748337553408L, 139686);
    int i = (int)this.xto;
    GMTrace.o(18748337553408L, 139686);
    return i;
  }
  
  public final int getPaddingBottom()
  {
    GMTrace.i(18749008642048L, 139691);
    int i = this.dB;
    GMTrace.o(18749008642048L, 139691);
    return i;
  }
  
  public final int getPaddingLeft()
  {
    GMTrace.i(18748605988864L, 139688);
    int i = this.xtQ;
    GMTrace.o(18748605988864L, 139688);
    return i;
  }
  
  public final int getPaddingRight()
  {
    GMTrace.i(18748740206592L, 139689);
    int i = this.xtR;
    GMTrace.o(18748740206592L, 139689);
    return i;
  }
  
  public final int getPaddingTop()
  {
    GMTrace.i(18748874424320L, 139690);
    int i = this.dA;
    GMTrace.o(18748874424320L, 139690);
    return i;
  }
  
  public final String getText()
  {
    GMTrace.i(18747934900224L, 139683);
    if (this.xtP == null)
    {
      GMTrace.o(18747934900224L, 139683);
      return "";
    }
    String str = this.xtP.toString();
    GMTrace.o(18747934900224L, 139683);
    return str;
  }
  
  public final float getTextSize()
  {
    GMTrace.i(18748203335680L, 139685);
    float f = this.mej;
    GMTrace.o(18748203335680L, 139685);
    return f;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(18745518981120L, 139665);
    paramCanvas.save();
    float f = cjF();
    if (this.xtS == 80) {
      paramCanvas.translate(aC(this.xtY), this.xtN - f);
    }
    Object localObject;
    while (this.xua != null)
    {
      localObject = this.xua;
      Iterator localIterator = ((com.tencent.mm.ui.widget.celltextview.c.b)localObject).xtv.iterator();
      while (localIterator.hasNext())
      {
        RectF localRectF = (RectF)localIterator.next();
        paramCanvas.save();
        paramCanvas.clipRect(localRectF);
        paramCanvas.drawColor(((com.tencent.mm.ui.widget.celltextview.c.b)localObject).iCQ);
        paramCanvas.restore();
      }
      if (this.xtS == 3) {
        paramCanvas.translate(this.xtQ + aC(this.xtY), (this.xtN - f) / 2.0F);
      } else if (this.xtS == 16) {
        paramCanvas.translate(this.xtQ + aC(this.xtY), (this.xtN - f) / 2.0F);
      }
    }
    int k = this.xtn.size();
    int i = 0;
    while (i < k)
    {
      localObject = (d)this.xtn.get(i);
      int m = ((d)localObject).getSize();
      paramCanvas.save();
      if ((this.xtS == 1) || (this.xtS == 17))
      {
        f = ((d)localObject).xtz;
        f = (this.xto - f) / 2.0F;
        ((d)localObject).xtE = f;
        paramCanvas.translate(f, 0.0F);
      }
      int j = 0;
      while (j < m)
      {
        ((d)localObject).Er(j).a(paramCanvas, ((d)localObject).Es(j), ((d)localObject).xtD, this.xtJ.b(this.iOt));
        j += 1;
      }
      paramCanvas.restore();
      i += 1;
    }
    paramCanvas.restore();
    GMTrace.o(18745518981120L, 139665);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(20302176190464L, 151263);
    int m;
    int n;
    int j;
    int i;
    if (this.xtO)
    {
      this.xtO = false;
      m = View.MeasureSpec.getMode(paramInt1);
      n = View.MeasureSpec.getMode(paramInt2);
      j = View.MeasureSpec.getSize(paramInt1);
      i = View.MeasureSpec.getSize(paramInt2);
      paramInt1 = j;
      if (j <= 0) {
        paramInt1 = com.tencent.mm.ui.widget.celltextview.g.b.getScreenWidth(this.mContext);
      }
      paramInt2 = paramInt1;
      if (this.ia > 0)
      {
        paramInt2 = paramInt1;
        if (this.ia < paramInt1) {
          paramInt2 = this.ia;
        }
      }
      if ((this.JE <= 0) || (this.JE <= paramInt2)) {
        break label1109;
      }
      paramInt2 = this.JE;
    }
    label441:
    label502:
    label579:
    label778:
    label782:
    label1063:
    label1091:
    label1109:
    for (;;)
    {
      if ((this.tAm > 0) && (this.tAm < i)) {}
      for (paramInt1 = this.tAm;; paramInt1 = i)
      {
        if ((this.xtL > 0) && (this.xtL > paramInt1)) {}
        for (i = this.xtL;; i = paramInt1)
        {
          int i1 = aC(this.xtY) + aC(this.xtZ);
          int i2 = paramInt2 - i1 - this.xtQ - this.xtR;
          Object localObject2;
          Object localObject3;
          Object localObject1;
          float f1;
          float f2;
          float f3;
          float f4;
          int k;
          int i3;
          Object localObject4;
          if (this.xtV)
          {
            localObject2 = com.tencent.mm.ui.widget.celltextview.a.b.cjy();
            localObject3 = this.xth;
            localObject1 = this.xtP;
            f1 = this.mej;
            f2 = i2;
            if (localObject1 == null) {}
            for (localObject1 = "";; localObject1 = ((CharSequence)localObject1).toString())
            {
              localObject1 = new com.tencent.mm.ui.widget.celltextview.a.a((String)localObject1, f1, f2);
              ((com.tencent.mm.ui.widget.celltextview.a.a)localObject1).am((ArrayList)localObject3);
              localObject1 = (com.tencent.mm.ui.widget.celltextview.a.a)((com.tencent.mm.ui.widget.celltextview.a.b)localObject2).xtr.get(localObject1);
              if (localObject1 == null) {
                break;
              }
              localObject2 = this.xth;
              if ((((com.tencent.mm.ui.widget.celltextview.a.a)localObject1).xth != null) && (localObject2 != null))
              {
                ((ArrayList)localObject2).clear();
                ((ArrayList)localObject2).addAll(((com.tencent.mm.ui.widget.celltextview.a.a)localObject1).xth);
              }
              localObject2 = this.xtn;
              if ((((com.tencent.mm.ui.widget.celltextview.a.a)localObject1).xtn != null) && (localObject2 != null))
              {
                ((ArrayList)localObject2).clear();
                ((ArrayList)localObject2).addAll(((com.tencent.mm.ui.widget.celltextview.a.a)localObject1).xtn);
              }
              paramInt1 = 1;
              cjI();
              this.xtM = this.xtn.size();
              if (paramInt1 != 0) {
                break label782;
              }
              f3 = i2;
              f4 = this.xtJ.b(this.iOt);
              localObject1 = this.xtn.iterator();
              paramInt1 = -1;
              do
              {
                do
                {
                  if (!((Iterator)localObject1).hasNext()) {
                    break label778;
                  }
                  localObject2 = (d)((Iterator)localObject1).next();
                  k = paramInt1 + 1;
                  i3 = ((d)localObject2).getSize();
                  localObject3 = ((d)localObject2).Es(i3 - 1);
                  if (localObject3 != null) {
                    break;
                  }
                  f1 = 0.0F;
                  f1 = f3 - f1;
                  paramInt1 = k;
                } while (f1 == 0.0F);
                paramInt1 = k;
              } while (Math.abs(f1) > f4);
              paramInt1 = -1;
              j = 0;
              for (;;)
              {
                if (j >= i3) {
                  break label579;
                }
                localObject4 = ((d)localObject2).Er(j);
                if (((e)localObject4).getType() != 2) {
                  break;
                }
                paramInt1 += 1;
                j += 1;
              }
            }
          }
          for (;;)
          {
            paramInt1 = 0;
            Ev(i2);
            com.tencent.mm.ui.widget.celltextview.a.b.cjy().a(this.xtP, this.mej, i2, this.xtn, this.xth);
            break;
            f1 = ((RectF)localObject3).right;
            break label441;
            paramInt1 += ((e)localObject4).getLength();
            break label502;
            if (paramInt1 == 0) {}
            for (f1 = 0.0F;; f1 /= paramInt1)
            {
              paramInt1 = 0;
              float f5;
              for (f2 = 0.0F; paramInt1 < i3; f2 = f5 + f2)
              {
                localObject4 = ((d)localObject2).Es(paramInt1);
                e locale = ((d)localObject2).Er(paramInt1);
                j = locale.getLength();
                if (locale.getType() == 2) {
                  j = 1;
                }
                f5 = ((RectF)localObject4).width();
                ((RectF)localObject4).left = f2;
                ((RectF)localObject4).right = (j * f1 + (f5 + f2));
                f5 = ((RectF)localObject4).width();
                paramInt1 += 1;
              }
            }
            ((d)localObject2).xtz = f2;
            ((d)localObject2).xtD = f1;
            if (localObject3 == null) {}
            for (f2 = 0.0F;; f2 = ((RectF)localObject3).right)
            {
              w.i("CellLayout", "[adaptLetterSpacing] line:%s size:%s letterSpacing:%s textSize:%s lineRight:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i3), Float.valueOf(f1), Float.valueOf(f4), Float.valueOf(f2) });
              paramInt1 = k;
              break;
            }
            cjI();
            f2 = i2;
            f3 = cjF();
            localObject1 = this.xtn.iterator();
            f1 = 0.0F;
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (d)((Iterator)localObject1).next();
              if (((d)localObject2).xtz <= f1) {
                break label1091;
              }
              w.i("CellLayout", "[getEdgeWidth] MeasuredLine:%s", new Object[] { Float.valueOf(((d)localObject2).xtz) });
              f1 = ((d)localObject2).xtz;
            }
            for (;;)
            {
              break;
              if (m == 1073741824)
              {
                this.xto = paramInt2;
                f1 = f2;
                if (n != 1073741824) {
                  break label1063;
                }
              }
              for (this.xtN = i;; this.xtN = Math.max(this.xtX, this.dA + this.dB + f3))
              {
                this.xto = Math.max(this.xto, this.JE);
                this.xtN = Math.max(this.xtN, this.xtL);
                if (this.ia > 0) {
                  this.xto = Math.min(this.xto, this.ia);
                }
                if (this.tAm > 0) {
                  this.xtN = Math.min(this.xtN, this.tAm);
                }
                w.i("CellLayout", String.format("[measureImpl] adaptWidth:%s mMeasuredWidth:%s mMeasuredHeight:%s", new Object[] { Float.valueOf(f1), Float.valueOf(this.xto), Float.valueOf(this.xtN) }));
                GMTrace.o(20302176190464L, 151263);
                return;
                f1 = Math.min(i2, f1);
                this.xto = (this.xtQ + f1 + this.xtR + i1);
                break;
              }
            }
          }
        }
      }
    }
  }
  
  public final void requestLayout()
  {
    GMTrace.i(18745653198848L, 139666);
    this.xtO = true;
    GMTrace.o(18745653198848L, 139666);
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    GMTrace.i(18747800682496L, 139682);
    this.xtW = paramDrawable;
    GMTrace.o(18747800682496L, 139682);
  }
  
  public final void setMaxHeight(int paramInt)
  {
    GMTrace.i(20302310408192L, 151264);
    this.tAm = paramInt;
    GMTrace.o(20302310408192L, 151264);
  }
  
  public final void setMaxWidth(int paramInt)
  {
    GMTrace.i(18746190069760L, 139670);
    this.ia = paramInt;
    GMTrace.o(18746190069760L, 139670);
  }
  
  public final void setMinHeight(int paramInt)
  {
    GMTrace.i(18747532247040L, 139680);
    this.xtL = paramInt;
    GMTrace.o(18747532247040L, 139680);
  }
  
  public final void setMinWidth(int paramInt)
  {
    GMTrace.i(18746324287488L, 139671);
    this.JE = paramInt;
    GMTrace.o(18746324287488L, 139671);
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18747129593856L, 139677);
    this.xtQ = paramInt1;
    this.dA = paramInt2;
    this.dB = paramInt4;
    this.xtR = paramInt3;
    if (this.xtW != null)
    {
      Rect localRect = new Rect();
      this.xtW.getPadding(localRect);
      w.i("CellLayout", "[setPadding] drawableRect:%s", new Object[] { localRect });
      this.xtQ = localRect.left;
      this.xtR = localRect.right;
      this.dA = localRect.top;
      this.dB = localRect.bottom;
      this.JE = this.xtW.getMinimumWidth();
      this.xtL = this.xtW.getMinimumHeight();
    }
    GMTrace.o(18747129593856L, 139677);
  }
  
  public final void setTextColor(int paramInt)
  {
    GMTrace.i(18745787416576L, 139667);
    this.xj = paramInt;
    this.iOt.setColor(paramInt);
    GMTrace.o(18745787416576L, 139667);
  }
  
  public final void setTextSize(float paramFloat)
  {
    GMTrace.i(18746055852032L, 139669);
    this.mej = paramFloat;
    this.iOt.setTextSize(paramFloat);
    GMTrace.o(18746055852032L, 139669);
  }
  
  private final class a
  {
    int xuc;
    Rect xud;
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(18745116327936L, 139662);
      if (this == paramObject)
      {
        GMTrace.o(18745116327936L, 139662);
        return true;
      }
      if ((paramObject == null) || (!(paramObject instanceof a)))
      {
        GMTrace.o(18745116327936L, 139662);
        return false;
      }
      if (this.xuc == ((a)paramObject).xuc)
      {
        GMTrace.o(18745116327936L, 139662);
        return true;
      }
      GMTrace.o(18745116327936L, 139662);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */