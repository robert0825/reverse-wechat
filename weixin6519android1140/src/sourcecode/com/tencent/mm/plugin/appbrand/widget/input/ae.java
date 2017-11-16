package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.e;
import com.tencent.mm.plugin.appbrand.o.b;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.sdk.platformtools.ab;

final class ae
  extends c
{
  public static final int iOr;
  private e iOq;
  
  static
  {
    GMTrace.i(19867310751744L, 148023);
    iOr = ab.getContext().getResources().getDimensionPixelSize(o.d.aQF);
    GMTrace.o(19867310751744L, 148023);
  }
  
  ae()
  {
    GMTrace.i(19867042316288L, 148021);
    this.iOq = null;
    GMTrace.o(19867042316288L, 148021);
  }
  
  protected final e adm()
  {
    GMTrace.i(19867176534016L, 148022);
    if (this.iOq == null) {
      this.iOq = new a();
    }
    e locale = this.iOq;
    GMTrace.o(19867176534016L, 148022);
    return locale;
  }
  
  private static final class a
    extends e
  {
    private String[] iOs;
    
    a()
    {
      super();
      GMTrace.i(19869995106304L, 148043);
      this.iOs = null;
      this.iOs = ab.getContext().getResources().getStringArray(o.b.hAa);
      GMTrace.o(19869995106304L, 148043);
    }
    
    public final void adn()
    {
      GMTrace.i(19870129324032L, 148044);
      GMTrace.o(19870129324032L, 148044);
    }
    
    public final int ado()
    {
      GMTrace.i(19870263541760L, 148045);
      if (this.iOs != null)
      {
        int i = this.iOs.length;
        GMTrace.o(19870263541760L, 148045);
        return i;
      }
      GMTrace.o(19870263541760L, 148045);
      return 0;
    }
    
    public final String getText(int paramInt)
    {
      GMTrace.i(19870666194944L, 148048);
      String str = kh(paramInt);
      GMTrace.o(19870666194944L, 148048);
      return str;
    }
    
    public final Drawable kg(int paramInt)
    {
      GMTrace.i(19870397759488L, 148046);
      ae.b localb = new ae.b(kh(paramInt), ae.iOr, (byte)0);
      GMTrace.o(19870397759488L, 148046);
      return localb;
    }
    
    public final String kh(int paramInt)
    {
      GMTrace.i(19870531977216L, 148047);
      if ((this.iOs == null) || (paramInt < 0) || (paramInt > this.iOs.length - 1))
      {
        GMTrace.o(19870531977216L, 148047);
        return "";
      }
      Object localObject2 = this.iOs[paramInt].split(" ");
      Object localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      localObject2 = Character.toChars(Integer.decode(localObject2[1]).intValue());
      localObject1 = (char[])localObject1 + (char[])localObject2;
      GMTrace.o(19870531977216L, 148047);
      return (String)localObject1;
    }
    
    public final String ki(int paramInt)
    {
      GMTrace.i(19870800412672L, 148049);
      String str = kh(paramInt);
      GMTrace.o(19870800412672L, 148049);
      return str;
    }
  }
  
  private static final class b
    extends Drawable
  {
    private final String iJz;
    private final TextPaint iOt;
    private Rect iOu;
    private final int mSize;
    
    private b(String paramString, int paramInt)
    {
      GMTrace.i(19863552655360L, 147995);
      this.iJz = paramString;
      this.mSize = paramInt;
      this.iOt = new TextPaint();
      this.iOt.setAntiAlias(true);
      this.iOt.setTextAlign(Paint.Align.CENTER);
      this.iOt.setTextSize(this.mSize);
      this.iOu = new Rect();
      this.iOt.getTextBounds(this.iJz, 0, this.iJz.length(), this.iOu);
      GMTrace.o(19863552655360L, 147995);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(19863955308544L, 147998);
      paramCanvas.drawText(this.iJz, getBounds().width() / 2, getBounds().height() / 2 - (this.iOt.descent() + this.iOt.ascent()) / 2.0F, this.iOt);
      GMTrace.o(19863955308544L, 147998);
    }
    
    public final int getIntrinsicHeight()
    {
      GMTrace.i(19863821090816L, 147997);
      int i = this.iOu.height();
      GMTrace.o(19863821090816L, 147997);
      return i;
    }
    
    public final int getIntrinsicWidth()
    {
      GMTrace.i(19863686873088L, 147996);
      int i = this.iOu.width();
      GMTrace.o(19863686873088L, 147996);
      return i;
    }
    
    public final int getOpacity()
    {
      GMTrace.i(19864357961728L, 148001);
      GMTrace.o(19864357961728L, 148001);
      return -3;
    }
    
    public final void setAlpha(int paramInt)
    {
      GMTrace.i(19864089526272L, 147999);
      this.iOt.setAlpha(paramInt);
      GMTrace.o(19864089526272L, 147999);
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      GMTrace.i(19864223744000L, 148000);
      this.iOt.setColorFilter(paramColorFilter);
      GMTrace.o(19864223744000L, 148000);
    }
  }
  
  private static final class c
    extends ContextWrapper
  {
    private Resources mResources;
    
    public c(Context paramContext)
    {
      super();
      GMTrace.i(19881672048640L, 148130);
      GMTrace.o(19881672048640L, 148130);
    }
    
    public final Resources getResources()
    {
      GMTrace.i(19881806266368L, 148131);
      if ((this.mResources != null) && ((this.mResources instanceof ae.d)))
      {
        localResources = this.mResources;
        GMTrace.o(19881806266368L, 148131);
        return localResources;
      }
      Resources localResources = super.getResources();
      this.mResources = new ae.d(localResources.getAssets(), localResources.getDisplayMetrics(), localResources.getConfiguration());
      localResources = this.mResources;
      GMTrace.o(19881806266368L, 148131);
      return localResources;
    }
  }
  
  private static final class d
    extends Resources
  {
    d(AssetManager paramAssetManager, DisplayMetrics paramDisplayMetrics, Configuration paramConfiguration)
    {
      super(paramDisplayMetrics, paramConfiguration);
      GMTrace.i(19865029050368L, 148006);
      GMTrace.o(19865029050368L, 148006);
    }
    
    public final String[] getStringArray(int paramInt)
    {
      GMTrace.i(19865163268096L, 148007);
      if (o.b.aMr == paramInt)
      {
        GMTrace.o(19865163268096L, 148007);
        return new String[0];
      }
      if (o.b.aMs == paramInt)
      {
        GMTrace.o(19865163268096L, 148007);
        return new String[0];
      }
      String[] arrayOfString = super.getStringArray(paramInt);
      GMTrace.o(19865163268096L, 148007);
      return arrayOfString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */