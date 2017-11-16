package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t
{
  String iJz;
  List<b> xjQ;
  WeakReference<EditText> xjR;
  ArrayList<String> xjS;
  boolean xjT;
  
  public t(EditText paramEditText)
  {
    GMTrace.i(1923474259968L, 14331);
    this.xjR = new WeakReference(paramEditText);
    GMTrace.o(1923474259968L, 14331);
  }
  
  static boolean a(EditText paramEditText, ArrayList<String> paramArrayList)
  {
    GMTrace.i(1923742695424L, 14333);
    String str = paramEditText.getText().toString();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    Object localObject1 = j(str, paramArrayList);
    if ((localObject1 != null) && (((List)localObject1).size() > 0))
    {
      int i = paramEditText.getSelectionStart();
      int j = paramEditText.getSelectionEnd();
      paramArrayList = paramEditText.getContext();
      TextPaint localTextPaint = paramEditText.getPaint();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (b)((Iterator)localObject1).next();
        int k = ((b)localObject2).start;
        int m = ((b)localObject2).length;
        if ((k < 0) || (m <= 0) || (k + m > str.length()))
        {
          w.i("MicroMsg.WordsChecker", "start : %d, length : %d.", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
        }
        else if (((b)localObject2).xjW)
        {
          localObject2 = str.substring(k, k + m);
          SpannableString localSpannableString = new SpannableString((CharSequence)localObject2);
          localSpannableString.setSpan(new ImageSpan(new a(paramArrayList, (String)localObject2, localTextPaint), 0), 0, ((String)localObject2).length(), 33);
          localSpannableStringBuilder.append(localSpannableString);
        }
        else
        {
          localSpannableStringBuilder.append(str.substring(k, k + m));
        }
      }
      if (localSpannableStringBuilder.length() > 0)
      {
        paramEditText.setText(localSpannableStringBuilder);
        paramEditText.setTextKeepState(localSpannableStringBuilder);
        if ((i == j) && (i >= 0)) {
          paramEditText.setSelection(i);
        }
      }
      GMTrace.o(1923742695424L, 14333);
      return true;
    }
    GMTrace.o(1923742695424L, 14333);
    return false;
  }
  
  static List<b> j(String paramString, ArrayList<String> paramArrayList)
  {
    GMTrace.i(1923876913152L, 14334);
    if ((bg.nm(paramString)) || (paramArrayList == null) || (paramArrayList.size() == 0))
    {
      GMTrace.o(1923876913152L, 14334);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int n = paramString.length();
    int k = 0;
    int i;
    label74:
    int m;
    if (k <= n)
    {
      Iterator localIterator = paramArrayList.iterator();
      j = 0;
      i = n;
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!bg.nm(str))
        {
          m = paramString.indexOf(str, k);
          if ((m < 0) || ((m >= i) && ((m != i) || (str.length() <= j)))) {
            break label260;
          }
          i = str.length();
        }
      }
    }
    for (int j = m;; j = m)
    {
      m = j;
      j = i;
      i = m;
      break label74;
      if (i < n)
      {
        if (i > k) {
          localArrayList.add(new b(k, i - k, false));
        }
        localArrayList.add(new b(i, j, true));
        k = i + j;
        break;
      }
      if (i > k) {
        localArrayList.add(new b(k, i - k, false));
      }
      GMTrace.o(1923876913152L, 14334);
      return localArrayList;
      label260:
      m = i;
      i = j;
    }
  }
  
  final b DY(int paramInt)
  {
    GMTrace.i(1923608477696L, 14332);
    if (this.xjQ != null)
    {
      Iterator localIterator = this.xjQ.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((paramInt <= localb.start + localb.length) && (paramInt > localb.start))
        {
          GMTrace.o(1923608477696L, 14332);
          return localb;
        }
      }
    }
    GMTrace.o(1923608477696L, 14332);
    return null;
  }
  
  public static final class a
    extends Drawable
  {
    private static int xfp;
    private RectF eJ;
    private Paint fWk;
    private String iJz;
    private Paint xfo;
    private float xfq;
    private float xfr;
    private float xjU;
    private float xjV;
    
    public a(Context paramContext, String paramString, Paint paramPaint)
    {
      GMTrace.i(1928440315904L, 14368);
      this.fWk = new Paint(1);
      this.fWk.setColor(-7829368);
      this.xfo = paramPaint;
      xfp = BackwardSupportUtil.b.a(paramContext, 2.0F);
      this.xjU = xfp;
      this.xjV = xfp;
      this.iJz = paramString;
      this.xfq = this.xfo.measureText(this.iJz);
      paramContext = this.xfo.getFontMetrics();
      this.xfr = ((float)Math.ceil(paramContext.bottom - paramContext.top));
      setBounds(0, 0, (int)(this.xfq + xfp * 2 + xfp * 2), (int)this.xfr);
      w.i("MicroMsg.TextDrawable", "setText(%s).", new Object[] { paramString });
      GMTrace.o(1928440315904L, 14368);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(1928574533632L, 14369);
      paramCanvas.drawRoundRect(this.eJ, this.xjU, this.xjV, this.fWk);
      Rect localRect = getBounds();
      int i = (int)((localRect.right - localRect.left - (this.eJ.right - this.eJ.left) + xfp * 2) / 2.0F);
      Paint.FontMetricsInt localFontMetricsInt = this.xfo.getFontMetricsInt();
      int j = localRect.top;
      int k = (localRect.bottom - localRect.top - localFontMetricsInt.bottom + localFontMetricsInt.top) / 2;
      int m = localFontMetricsInt.top;
      paramCanvas.drawText(this.iJz, i, k + j - m, this.xfo);
      GMTrace.o(1928574533632L, 14369);
    }
    
    public final int getOpacity()
    {
      GMTrace.i(1928977186816L, 14372);
      if (this.fWk.getAlpha() < 255)
      {
        GMTrace.o(1928977186816L, 14372);
        return -3;
      }
      GMTrace.o(1928977186816L, 14372);
      return -1;
    }
    
    public final void setAlpha(int paramInt)
    {
      GMTrace.i(1928708751360L, 14370);
      if (paramInt != this.fWk.getAlpha())
      {
        this.fWk.setAlpha(paramInt);
        invalidateSelf();
      }
      GMTrace.o(1928708751360L, 14370);
    }
    
    public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(1929111404544L, 14373);
      super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      Paint.FontMetrics localFontMetrics = this.xfo.getFontMetrics();
      float f1 = xfp + paramInt1;
      float f2 = paramInt2;
      this.eJ = new RectF(f1, localFontMetrics.ascent - localFontMetrics.top + f2, paramInt3 - xfp, paramInt4);
      invalidateSelf();
      GMTrace.o(1929111404544L, 14373);
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      GMTrace.i(1928842969088L, 14371);
      this.fWk.setColorFilter(paramColorFilter);
      invalidateSelf();
      GMTrace.o(1928842969088L, 14371);
    }
  }
  
  private static final class b
  {
    int length;
    int start;
    boolean xjW;
    
    b(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(1931795759104L, 14393);
      this.start = paramInt1;
      this.length = paramInt2;
      this.xjW = paramBoolean;
      GMTrace.o(1931795759104L, 14393);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\tools\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */