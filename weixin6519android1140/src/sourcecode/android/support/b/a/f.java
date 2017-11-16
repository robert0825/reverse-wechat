package android.support.b.a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
public final class f
  extends e
{
  static final PorterDuff.Mode lv = PorterDuff.Mode.SRC_IN;
  boolean lA = true;
  private Drawable.ConstantState lB;
  private final float[] lC = new float[9];
  private final Matrix lD = new Matrix();
  private final Rect lE = new Rect();
  f lw;
  private PorterDuffColorFilter lx;
  private ColorFilter ly;
  private boolean lz;
  
  private f()
  {
    this.lw = new f();
  }
  
  private f(f paramf)
  {
    this.lw = paramf;
    this.lx = a(paramf.mv, paramf.mw);
  }
  
  private PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public static f a(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject = new f();
      if (Build.VERSION.SDK_INT >= 21) {}
      for (paramResources = paramResources.getDrawable(paramInt, paramTheme);; paramResources = paramResources.getDrawable(paramInt))
      {
        ((f)localObject).lu = paramResources;
        ((f)localObject).lB = new g(((f)localObject).lu.getConstantState());
        return (f)localObject;
      }
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt != 2) {
        throw new XmlPullParserException("No start tag found");
      }
      paramResources = a(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      return paramResources;
    }
    catch (IOException paramResources) {}catch (XmlPullParserException paramResources) {}
    return null;
  }
  
  public static f a(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = new f();
    localf.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localf;
  }
  
  private void b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    f localf = this.lw;
    e locale = localf.mu;
    int i = 1;
    Stack localStack = new Stack();
    localStack.push(locale.mm);
    int j = paramXmlPullParser.getEventType();
    if (j != 1)
    {
      Object localObject;
      c localc;
      TypedArray localTypedArray;
      if (j == 2)
      {
        localObject = paramXmlPullParser.getName();
        localc = (c)localStack.peek();
        if ("path".equals(localObject))
        {
          localObject = new b();
          localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.ld);
          ((b)localObject).a(localTypedArray, paramXmlPullParser);
          localTypedArray.recycle();
          localc.lT.add(localObject);
          if (((d)localObject).me != null) {
            locale.mt.put(((d)localObject).me, localObject);
          }
          i = 0;
          j = localf.ll;
          localf.ll = (((b)localObject).ll | j);
        }
      }
      for (;;)
      {
        j = paramXmlPullParser.next();
        break;
        if ("clip-path".equals(localObject))
        {
          localObject = new a();
          if (d.a(paramXmlPullParser, "pathData"))
          {
            localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.le);
            ((a)localObject).a(localTypedArray);
            localTypedArray.recycle();
          }
          localc.lT.add(localObject);
          if (((d)localObject).me != null) {
            locale.mt.put(((d)localObject).me, localObject);
          }
          localf.ll |= ((a)localObject).ll;
        }
        else
        {
          if ("group".equals(localObject))
          {
            localObject = new c();
            localTypedArray = e.a(paramResources, paramTheme, paramAttributeSet, a.lc);
            ((c)localObject).lF = null;
            ((c)localObject).lU = d.a(localTypedArray, paramXmlPullParser, "rotation", 5, ((c)localObject).lU);
            ((c)localObject).lV = localTypedArray.getFloat(1, ((c)localObject).lV);
            ((c)localObject).lW = localTypedArray.getFloat(2, ((c)localObject).lW);
            ((c)localObject).lX = d.a(localTypedArray, paramXmlPullParser, "scaleX", 3, ((c)localObject).lX);
            ((c)localObject).lY = d.a(localTypedArray, paramXmlPullParser, "scaleY", 4, ((c)localObject).lY);
            ((c)localObject).lZ = d.a(localTypedArray, paramXmlPullParser, "translateX", 6, ((c)localObject).lZ);
            ((c)localObject).ma = d.a(localTypedArray, paramXmlPullParser, "translateY", 7, ((c)localObject).ma);
            String str = localTypedArray.getString(0);
            if (str != null) {
              ((c)localObject).mc = str;
            }
            ((c)localObject).mb.reset();
            ((c)localObject).mb.postTranslate(-((c)localObject).lV, -((c)localObject).lW);
            ((c)localObject).mb.postScale(((c)localObject).lX, ((c)localObject).lY);
            ((c)localObject).mb.postRotate(((c)localObject).lU, 0.0F, 0.0F);
            ((c)localObject).mb.postTranslate(((c)localObject).lZ + ((c)localObject).lV, ((c)localObject).ma + ((c)localObject).lW);
            localTypedArray.recycle();
            localc.lT.add(localObject);
            localStack.push(localObject);
            if (((c)localObject).mc != null) {
              locale.mt.put(((c)localObject).mc, localObject);
            }
            localf.ll |= ((c)localObject).ll;
          }
          continue;
          if ((j == 3) && ("group".equals(paramXmlPullParser.getName()))) {
            localStack.pop();
          }
        }
      }
    }
    if (i != 0)
    {
      paramResources = new StringBuffer();
      if (paramResources.length() > 0) {
        paramResources.append(" or ");
      }
      paramResources.append("path");
      throw new XmlPullParserException("no " + paramResources + " defined");
    }
  }
  
  public final boolean canApplyTheme()
  {
    if (this.lu != null) {
      android.support.v4.b.a.a.e(this.lu);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    float f2 = 1.0F;
    if (this.lu != null) {
      this.lu.draw(paramCanvas);
    }
    do
    {
      return;
      copyBounds(this.lE);
    } while ((this.lE.width() <= 0) || (this.lE.height() <= 0));
    Object localObject;
    float f3;
    float f1;
    if (this.ly == null)
    {
      localObject = this.lx;
      paramCanvas.getMatrix(this.lD);
      this.lD.getValues(this.lC);
      f3 = Math.abs(this.lC[0]);
      f1 = Math.abs(this.lC[4]);
      float f4 = Math.abs(this.lC[1]);
      float f5 = Math.abs(this.lC[3]);
      if ((f4 == 0.0F) && (f5 == 0.0F)) {
        break label617;
      }
      f1 = 1.0F;
    }
    for (;;)
    {
      int j = (int)(f2 * this.lE.width());
      int i = (int)(f1 * this.lE.height());
      int k = Math.min(2048, j);
      int m = Math.min(2048, i);
      if ((k <= 0) || (m <= 0)) {
        break;
      }
      j = paramCanvas.save();
      paramCanvas.translate(this.lE.left, this.lE.top);
      this.lE.offsetTo(0, 0);
      f localf = this.lw;
      if (localf.my != null)
      {
        if ((k != localf.my.getWidth()) || (m != localf.my.getHeight())) {
          break label387;
        }
        i = 1;
        label271:
        if (i != 0) {}
      }
      else
      {
        localf.my = Bitmap.createBitmap(k, m, Bitmap.Config.ARGB_8888);
        localf.mD = true;
      }
      label315:
      Rect localRect;
      if (!this.lA)
      {
        this.lw.f(k, m);
        localf = this.lw;
        localRect = this.lE;
        if (localf.mu.mr >= 255) {
          break label545;
        }
        i = 1;
        label344:
        if ((i != 0) || (localObject != null)) {
          break label551;
        }
      }
      for (localObject = null;; localObject = localf.mE)
      {
        paramCanvas.drawBitmap(localf.my, null, localRect, (Paint)localObject);
        paramCanvas.restoreToCount(j);
        return;
        localObject = this.ly;
        break;
        label387:
        i = 0;
        break label271;
        localf = this.lw;
        if ((!localf.mD) && (localf.mz == localf.mv) && (localf.mA == localf.mw) && (localf.mC == localf.mx) && (localf.mB == localf.mu.mr)) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label543;
          }
          this.lw.f(k, m);
          localf = this.lw;
          localf.mz = localf.mv;
          localf.mA = localf.mw;
          localf.mB = localf.mu.mr;
          localf.mC = localf.mx;
          localf.mD = false;
          break;
        }
        label543:
        break label315;
        label545:
        i = 0;
        break label344;
        label551:
        if (localf.mE == null)
        {
          localf.mE = new Paint();
          localf.mE.setFilterBitmap(true);
        }
        localf.mE.setAlpha(localf.mu.mr);
        localf.mE.setColorFilter((ColorFilter)localObject);
      }
      label617:
      f2 = f3;
    }
  }
  
  public final int getAlpha()
  {
    if (this.lu != null) {
      return android.support.v4.b.a.a.d(this.lu);
    }
    return this.lw.mu.mr;
  }
  
  public final int getChangingConfigurations()
  {
    if (this.lu != null) {
      return this.lu.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | this.lw.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if (this.lu != null) {
      return new g(this.lu.getConstantState());
    }
    this.lw.ll = getChangingConfigurations();
    return this.lw;
  }
  
  public final int getIntrinsicHeight()
  {
    if (this.lu != null) {
      return this.lu.getIntrinsicHeight();
    }
    return (int)this.lw.mu.mo;
  }
  
  public final int getIntrinsicWidth()
  {
    if (this.lu != null) {
      return this.lu.getIntrinsicWidth();
    }
    return (int)this.lw.mu.mn;
  }
  
  public final int getOpacity()
  {
    if (this.lu != null) {
      return this.lu.getOpacity();
    }
    return -3;
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    if (this.lu != null)
    {
      this.lu.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    f localf1 = this.lw;
    localf1.mu = new e();
    TypedArray localTypedArray = a(paramResources, paramTheme, paramAttributeSet, a.lb);
    f localf2 = this.lw;
    e locale = localf2.mu;
    int i = d.a(localTypedArray, paramXmlPullParser, "tintMode", 6);
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    Object localObject = localMode;
    boolean bool;
    switch (i)
    {
    default: 
      localObject = localMode;
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
      localf2.mw = ((PorterDuff.Mode)localObject);
      localObject = localTypedArray.getColorStateList(1);
      if (localObject != null) {
        localf2.mv = ((ColorStateList)localObject);
      }
      bool = localf2.mx;
      if (d.a(paramXmlPullParser, "autoMirrored")) {
        break;
      }
    }
    for (;;)
    {
      localf2.mx = bool;
      locale.mp = d.a(localTypedArray, paramXmlPullParser, "viewportWidth", 7, locale.mp);
      locale.mq = d.a(localTypedArray, paramXmlPullParser, "viewportHeight", 8, locale.mq);
      if (locale.mp > 0.0F) {
        break label356;
      }
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
      localObject = PorterDuff.Mode.SRC_OVER;
      break;
      localObject = PorterDuff.Mode.SRC_IN;
      break;
      localObject = PorterDuff.Mode.SRC_ATOP;
      break;
      localObject = PorterDuff.Mode.MULTIPLY;
      break;
      localObject = PorterDuff.Mode.SCREEN;
      break;
      localObject = PorterDuff.Mode.ADD;
      break;
      bool = localTypedArray.getBoolean(5, bool);
    }
    label356:
    if (locale.mq <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }
    locale.mn = localTypedArray.getDimension(3, locale.mn);
    locale.mo = localTypedArray.getDimension(2, locale.mo);
    if (locale.mn <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires width > 0");
    }
    if (locale.mo <= 0.0F) {
      throw new XmlPullParserException(localTypedArray.getPositionDescription() + "<vector> tag requires height > 0");
    }
    locale.mr = ((int)(d.a(localTypedArray, paramXmlPullParser, "alpha", 4, locale.mr / 255.0F) * 255.0F));
    localObject = localTypedArray.getString(0);
    if (localObject != null)
    {
      locale.ms = ((String)localObject);
      locale.mt.put(localObject, locale);
    }
    localTypedArray.recycle();
    localf1.ll = getChangingConfigurations();
    localf1.mD = true;
    b(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    this.lx = a(localf1.mv, localf1.mw);
  }
  
  public final void invalidateSelf()
  {
    if (this.lu != null)
    {
      this.lu.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public final boolean isStateful()
  {
    if (this.lu != null) {
      return this.lu.isStateful();
    }
    return (super.isStateful()) || ((this.lw != null) && (this.lw.mv != null) && (this.lw.mv.isStateful()));
  }
  
  public final Drawable mutate()
  {
    if (this.lu != null) {
      this.lu.mutate();
    }
    while ((this.lz) || (super.mutate() != this)) {
      return this;
    }
    this.lw = new f(this.lw);
    this.lz = true;
    return this;
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    if (this.lu != null) {
      this.lu.setBounds(paramRect);
    }
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if (this.lu != null) {
      return this.lu.setState(paramArrayOfInt);
    }
    paramArrayOfInt = this.lw;
    if ((paramArrayOfInt.mv != null) && (paramArrayOfInt.mw != null))
    {
      this.lx = a(paramArrayOfInt.mv, paramArrayOfInt.mw);
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    if (this.lu != null)
    {
      this.lu.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    if (this.lu != null) {
      this.lu.setAlpha(paramInt);
    }
    while (this.lw.mu.mr == paramInt) {
      return;
    }
    this.lw.mu.mr = paramInt;
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    if (this.lu != null)
    {
      this.lu.setColorFilter(paramColorFilter);
      return;
    }
    this.ly = paramColorFilter;
    invalidateSelf();
  }
  
  public final void setTint(int paramInt)
  {
    if (this.lu != null)
    {
      android.support.v4.b.a.a.a(this.lu, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    if (this.lu != null) {
      android.support.v4.b.a.a.a(this.lu, paramColorStateList);
    }
    f localf;
    do
    {
      return;
      localf = this.lw;
    } while (localf.mv == paramColorStateList);
    localf.mv = paramColorStateList;
    this.lx = a(paramColorStateList, localf.mw);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    if (this.lu != null) {
      android.support.v4.b.a.a.a(this.lu, paramMode);
    }
    f localf;
    do
    {
      return;
      localf = this.lw;
    } while (localf.mw == paramMode);
    localf.mw = paramMode;
    this.lx = a(localf.mv, paramMode);
    invalidateSelf();
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.lu != null) {
      return this.lu.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    if (this.lu != null)
    {
      this.lu.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  private static final class a
    extends f.d
  {
    public a() {}
    
    public a(a parama)
    {
      super();
    }
    
    final void a(TypedArray paramTypedArray)
    {
      String str = paramTypedArray.getString(0);
      if (str != null) {
        this.me = str;
      }
      paramTypedArray = paramTypedArray.getString(1);
      if (paramTypedArray != null) {
        this.md = c.g(paramTypedArray);
      }
    }
    
    public final boolean aA()
    {
      return true;
    }
  }
  
  private static final class b
    extends f.d
  {
    private int[] lF;
    int lG = 0;
    float lH = 0.0F;
    int lI = 0;
    float lJ = 1.0F;
    int lK;
    float lL = 1.0F;
    float lM = 0.0F;
    float lN = 1.0F;
    float lO = 0.0F;
    Paint.Cap lP = Paint.Cap.BUTT;
    Paint.Join lQ = Paint.Join.MITER;
    float lR = 4.0F;
    
    public b() {}
    
    public b(b paramb)
    {
      super();
      this.lF = paramb.lF;
      this.lG = paramb.lG;
      this.lH = paramb.lH;
      this.lJ = paramb.lJ;
      this.lI = paramb.lI;
      this.lK = paramb.lK;
      this.lL = paramb.lL;
      this.lM = paramb.lM;
      this.lN = paramb.lN;
      this.lO = paramb.lO;
      this.lP = paramb.lP;
      this.lQ = paramb.lQ;
      this.lR = paramb.lR;
    }
    
    final void a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      this.lF = null;
      if (!d.a(paramXmlPullParser, "pathData")) {
        return;
      }
      Object localObject = paramTypedArray.getString(0);
      if (localObject != null) {
        this.me = ((String)localObject);
      }
      localObject = paramTypedArray.getString(2);
      if (localObject != null) {
        this.md = c.g((String)localObject);
      }
      this.lI = d.a(paramTypedArray, paramXmlPullParser, "fillColor", 1, this.lI);
      this.lL = d.a(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, this.lL);
      int i = d.a(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8);
      localObject = this.lP;
      switch (i)
      {
      default: 
        this.lP = ((Paint.Cap)localObject);
        i = d.a(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9);
        localObject = this.lQ;
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        this.lQ = ((Paint.Join)localObject);
        this.lR = d.a(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, this.lR);
        this.lG = d.a(paramTypedArray, paramXmlPullParser, "strokeColor", 3, this.lG);
        this.lJ = d.a(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, this.lJ);
        this.lH = d.a(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, this.lH);
        this.lN = d.a(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, this.lN);
        this.lO = d.a(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, this.lO);
        this.lM = d.a(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, this.lM);
        return;
        localObject = Paint.Cap.BUTT;
        break;
        localObject = Paint.Cap.ROUND;
        break;
        localObject = Paint.Cap.SQUARE;
        break;
        localObject = Paint.Join.MITER;
        continue;
        localObject = Paint.Join.ROUND;
        continue;
        localObject = Paint.Join.BEVEL;
      }
    }
  }
  
  private static final class c
  {
    int[] lF;
    public final Matrix lS = new Matrix();
    final ArrayList<Object> lT = new ArrayList();
    public float lU = 0.0F;
    float lV = 0.0F;
    float lW = 0.0F;
    float lX = 1.0F;
    float lY = 1.0F;
    float lZ = 0.0F;
    public int ll;
    float ma = 0.0F;
    public final Matrix mb = new Matrix();
    String mc = null;
    
    public c() {}
    
    public c(c paramc, android.support.v4.e.a<String, Object> parama)
    {
      this.lU = paramc.lU;
      this.lV = paramc.lV;
      this.lW = paramc.lW;
      this.lX = paramc.lX;
      this.lY = paramc.lY;
      this.lZ = paramc.lZ;
      this.ma = paramc.ma;
      this.lF = paramc.lF;
      this.mc = paramc.mc;
      this.ll = paramc.ll;
      if (this.mc != null) {
        parama.put(this.mc, this);
      }
      this.mb.set(paramc.mb);
      ArrayList localArrayList = paramc.lT;
      int i = 0;
      while (i < localArrayList.size())
      {
        paramc = localArrayList.get(i);
        if ((paramc instanceof c))
        {
          paramc = (c)paramc;
          this.lT.add(new c(paramc, parama));
          i += 1;
        }
        else
        {
          if ((paramc instanceof f.b)) {}
          for (paramc = new f.b((f.b)paramc);; paramc = new f.a((f.a)paramc))
          {
            this.lT.add(paramc);
            if (paramc.me == null) {
              break;
            }
            parama.put(paramc.me, paramc);
            break;
            if (!(paramc instanceof f.a)) {
              break label315;
            }
          }
          label315:
          throw new IllegalStateException("Unknown object in the tree!");
        }
      }
    }
  }
  
  private static class d
  {
    int ll;
    protected c.b[] md = null;
    String me;
    
    public d() {}
    
    public d(d paramd)
    {
      this.me = paramd.me;
      this.ll = paramd.ll;
      this.md = c.a(paramd.md);
    }
    
    public final void a(Path paramPath)
    {
      paramPath.reset();
      c.b[] arrayOfb;
      float[] arrayOfFloat1;
      int k;
      int j;
      float[] arrayOfFloat2;
      float f4;
      float f3;
      float f6;
      float f1;
      float f2;
      int m;
      float f7;
      float f8;
      label290:
      label482:
      float f9;
      if (this.md != null)
      {
        arrayOfb = this.md;
        arrayOfFloat1 = new float[6];
        k = 0;
        j = 109;
        if (k < arrayOfb.length)
        {
          int n = arrayOfb[k].ls;
          arrayOfFloat2 = arrayOfb[k].lt;
          f4 = arrayOfFloat1[0];
          f3 = arrayOfFloat1[1];
          f6 = arrayOfFloat1[2];
          f5 = arrayOfFloat1[3];
          f1 = arrayOfFloat1[4];
          f2 = arrayOfFloat1[5];
          int i;
          switch (n)
          {
          default: 
            i = 2;
            m = 0;
            f7 = f3;
            f3 = f4;
            f4 = f7;
            f7 = f6;
            f8 = f5;
            if (m < arrayOfFloat2.length) {
              switch (n)
              {
              default: 
                f5 = f2;
                f2 = f4;
                f4 = f3;
                f3 = f2;
                f2 = f1;
                f6 = f7;
                f1 = f5;
                f5 = f8;
              }
            }
            break;
          case 90: 
          case 122: 
          case 76: 
          case 77: 
          case 84: 
          case 108: 
          case 109: 
          case 116: 
          case 72: 
          case 86: 
          case 104: 
          case 118: 
          case 67: 
          case 99: 
          case 81: 
          case 83: 
          case 113: 
          case 115: 
          case 65: 
          case 97: 
            for (;;)
            {
              m += i;
              f9 = f2;
              float f10 = f4;
              j = n;
              f8 = f5;
              f7 = f6;
              f2 = f1;
              f1 = f9;
              f4 = f3;
              f3 = f10;
              break label290;
              paramPath.close();
              paramPath.moveTo(f1, f2);
              f5 = f2;
              f6 = f1;
              f3 = f2;
              f4 = f1;
              i = 2;
              break;
              i = 2;
              break;
              i = 1;
              break;
              i = 6;
              break;
              i = 4;
              break;
              i = 7;
              break;
              f3 += arrayOfFloat2[(m + 0)];
              f4 += arrayOfFloat2[(m + 1)];
              if (m > 0)
              {
                paramPath.rLineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                f9 = f3;
                f3 = f2;
                f2 = f1;
                f5 = f8;
                f1 = f3;
                f6 = f7;
                f3 = f4;
                f4 = f9;
              }
              else
              {
                paramPath.rMoveTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                f10 = f4;
                f9 = f3;
                f5 = f8;
                f1 = f4;
                f6 = f7;
                f2 = f3;
                f3 = f10;
                f4 = f9;
                continue;
                f3 = arrayOfFloat2[(m + 0)];
                f4 = arrayOfFloat2[(m + 1)];
                if (m > 0)
                {
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f9 = f3;
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f4;
                  f4 = f9;
                }
                else
                {
                  paramPath.moveTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f10 = f4;
                  f9 = f3;
                  f5 = f8;
                  f1 = f4;
                  f6 = f7;
                  f2 = f3;
                  f3 = f10;
                  f4 = f9;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f5 = arrayOfFloat2[(m + 0)];
                  f4 += arrayOfFloat2[(m + 1)];
                  f9 = f3 + f5;
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f4;
                  f4 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
                  f4 = arrayOfFloat2[(m + 0)];
                  f9 = arrayOfFloat2[(m + 1)];
                  f3 = f2;
                  f2 = f1;
                  f5 = f8;
                  f1 = f3;
                  f6 = f7;
                  f3 = f9;
                  continue;
                  paramPath.rLineTo(arrayOfFloat2[(m + 0)], 0.0F);
                  f5 = arrayOfFloat2[(m + 0)];
                  f9 = f3 + f5;
                  f3 = f1;
                  f5 = f8;
                  f1 = f2;
                  f6 = f7;
                  f2 = f3;
                  f3 = f4;
                  f4 = f9;
                  continue;
                  paramPath.lineTo(arrayOfFloat2[(m + 0)], f4);
                  f5 = arrayOfFloat2[(m + 0)];
                  f3 = f4;
                  f4 = f5;
                  f9 = f1;
                  f5 = f8;
                  f1 = f2;
                  f6 = f7;
                  f2 = f9;
                  continue;
                  paramPath.rLineTo(0.0F, arrayOfFloat2[(m + 0)]);
                  f5 = arrayOfFloat2[(m + 0)];
                  f9 = f1;
                  f10 = f4 + f5;
                  f4 = f3;
                  f1 = f2;
                  f5 = f8;
                  f6 = f7;
                  f2 = f9;
                  f3 = f10;
                  continue;
                  paramPath.lineTo(f3, arrayOfFloat2[(m + 0)]);
                  f9 = arrayOfFloat2[(m + 0)];
                  f4 = f1;
                  f10 = f3;
                  f1 = f2;
                  f5 = f8;
                  f6 = f7;
                  f2 = f4;
                  f3 = f9;
                  f4 = f10;
                  continue;
                  paramPath.rCubicTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)], arrayOfFloat2[(m + 4)], arrayOfFloat2[(m + 5)]);
                  f6 = f3 + arrayOfFloat2[(m + 2)];
                  f5 = f4 + arrayOfFloat2[(m + 3)];
                  f7 = arrayOfFloat2[(m + 4)];
                  f4 += arrayOfFloat2[(m + 5)];
                  f7 = f3 + f7;
                  f3 = f2;
                  f2 = f1;
                  f1 = f3;
                  f3 = f4;
                  f4 = f7;
                  continue;
                  paramPath.cubicTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)], arrayOfFloat2[(m + 4)], arrayOfFloat2[(m + 5)]);
                  f4 = arrayOfFloat2[(m + 4)];
                  f3 = arrayOfFloat2[(m + 5)];
                  f7 = arrayOfFloat2[(m + 2)];
                  f5 = arrayOfFloat2[(m + 3)];
                  f6 = f2;
                  f2 = f1;
                  f1 = f6;
                  f6 = f7;
                }
              }
            }
            f6 = 0.0F;
            if ((j == 99) || (j == 115) || (j == 67) || (j == 83)) {
              f6 = f4 - f8;
            }
            break;
          }
        }
      }
      for (float f5 = f3 - f7;; f5 = 0.0F)
      {
        paramPath.rCubicTo(f5, f6, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
        f6 = f3 + arrayOfFloat2[(m + 0)];
        f5 = f4 + arrayOfFloat2[(m + 1)];
        f7 = arrayOfFloat2[(m + 2)];
        f4 += arrayOfFloat2[(m + 3)];
        f7 = f3 + f7;
        f3 = f2;
        f2 = f1;
        f1 = f3;
        f3 = f4;
        f4 = f7;
        break label482;
        if ((j == 99) || (j == 115) || (j == 67) || (j == 83))
        {
          f4 = 2.0F * f4 - f8;
          f3 = 2.0F * f3 - f7;
        }
        for (;;)
        {
          paramPath.cubicTo(f3, f4, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
          f6 = arrayOfFloat2[(m + 0)];
          f5 = arrayOfFloat2[(m + 1)];
          f4 = arrayOfFloat2[(m + 2)];
          f7 = arrayOfFloat2[(m + 3)];
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f7;
          break label482;
          paramPath.rQuadTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
          f6 = f3 + arrayOfFloat2[(m + 0)];
          f5 = f4 + arrayOfFloat2[(m + 1)];
          f7 = arrayOfFloat2[(m + 2)];
          f4 += arrayOfFloat2[(m + 3)];
          f7 = f3 + f7;
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f4;
          f4 = f7;
          break label482;
          paramPath.quadTo(arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)], arrayOfFloat2[(m + 2)], arrayOfFloat2[(m + 3)]);
          f6 = arrayOfFloat2[(m + 0)];
          f5 = arrayOfFloat2[(m + 1)];
          f4 = arrayOfFloat2[(m + 2)];
          f7 = arrayOfFloat2[(m + 3)];
          f3 = f2;
          f2 = f1;
          f1 = f3;
          f3 = f7;
          break label482;
          if ((j == 113) || (j == 116) || (j == 81) || (j == 84)) {
            f5 = f4 - f8;
          }
          for (f6 = f3 - f7;; f6 = 0.0F)
          {
            paramPath.rQuadTo(f6, f5, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
            f6 = f3 + f6;
            f5 = f4 + f5;
            f7 = arrayOfFloat2[(m + 0)];
            f4 += arrayOfFloat2[(m + 1)];
            f7 = f3 + f7;
            f3 = f2;
            f2 = f1;
            f1 = f3;
            f3 = f4;
            f4 = f7;
            break label482;
            if ((j != 113) && (j != 116) && (j != 81))
            {
              f6 = f4;
              f5 = f3;
              if (j != 84) {}
            }
            else
            {
              f5 = 2.0F * f3 - f7;
              f6 = 2.0F * f4 - f8;
            }
            paramPath.quadTo(f5, f6, arrayOfFloat2[(m + 0)], arrayOfFloat2[(m + 1)]);
            f4 = arrayOfFloat2[(m + 0)];
            f3 = arrayOfFloat2[(m + 1)];
            f7 = f6;
            f6 = f5;
            f8 = f2;
            f2 = f1;
            f5 = f7;
            f1 = f8;
            break label482;
            f5 = arrayOfFloat2[(m + 5)];
            f6 = arrayOfFloat2[(m + 6)];
            f7 = arrayOfFloat2[(m + 0)];
            f8 = arrayOfFloat2[(m + 1)];
            f9 = arrayOfFloat2[(m + 2)];
            boolean bool1;
            if (arrayOfFloat2[(m + 3)] != 0.0F)
            {
              bool1 = true;
              label2168:
              if (arrayOfFloat2[(m + 4)] == 0.0F) {
                break label2261;
              }
            }
            label2261:
            for (boolean bool2 = true;; bool2 = false)
            {
              c.b.a(paramPath, f3, f4, f5 + f3, f6 + f4, f7, f8, f9, bool1, bool2);
              f6 = f3 + arrayOfFloat2[(m + 5)];
              f5 = f4 + arrayOfFloat2[(m + 6)];
              f7 = f2;
              f2 = f1;
              f3 = f5;
              f4 = f6;
              f1 = f7;
              break;
              bool1 = false;
              break label2168;
            }
            f5 = arrayOfFloat2[(m + 5)];
            f6 = arrayOfFloat2[(m + 6)];
            f7 = arrayOfFloat2[(m + 0)];
            f8 = arrayOfFloat2[(m + 1)];
            f9 = arrayOfFloat2[(m + 2)];
            if (arrayOfFloat2[(m + 3)] != 0.0F)
            {
              bool1 = true;
              label2328:
              if (arrayOfFloat2[(m + 4)] == 0.0F) {
                break label2409;
              }
            }
            label2409:
            for (bool2 = true;; bool2 = false)
            {
              c.b.a(paramPath, f3, f4, f5, f6, f7, f8, f9, bool1, bool2);
              f6 = arrayOfFloat2[(m + 5)];
              f5 = arrayOfFloat2[(m + 6)];
              f7 = f2;
              f2 = f1;
              f3 = f5;
              f4 = f6;
              f1 = f7;
              break;
              bool1 = false;
              break label2328;
            }
            arrayOfFloat1[0] = f3;
            arrayOfFloat1[1] = f4;
            arrayOfFloat1[2] = f7;
            arrayOfFloat1[3] = f8;
            arrayOfFloat1[4] = f1;
            arrayOfFloat1[5] = f2;
            j = arrayOfb[k].ls;
            k += 1;
            break;
            return;
            f5 = 0.0F;
          }
        }
      }
    }
    
    public boolean aA()
    {
      return false;
    }
  }
  
  private static final class e
  {
    private static final Matrix mh = new Matrix();
    private int ll;
    private final Path mf;
    private final Path mg;
    private final Matrix mi = new Matrix();
    public Paint mj;
    public Paint mk;
    private PathMeasure ml;
    public final f.c mm;
    float mn = 0.0F;
    float mo = 0.0F;
    float mp = 0.0F;
    float mq = 0.0F;
    int mr = 255;
    String ms = null;
    final android.support.v4.e.a<String, Object> mt = new android.support.v4.e.a();
    
    public e()
    {
      this.mm = new f.c();
      this.mf = new Path();
      this.mg = new Path();
    }
    
    public e(e parame)
    {
      this.mm = new f.c(parame.mm, this.mt);
      this.mf = new Path(parame.mf);
      this.mg = new Path(parame.mg);
      this.mn = parame.mn;
      this.mo = parame.mo;
      this.mp = parame.mp;
      this.mq = parame.mq;
      this.ll = parame.ll;
      this.mr = parame.mr;
      this.ms = parame.ms;
      if (parame.ms != null) {
        this.mt.put(parame.ms, this);
      }
    }
    
    private void a(f.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      paramc.lS.set(paramMatrix);
      paramc.lS.preConcat(paramc.mb);
      int i = 0;
      if (i < paramc.lT.size())
      {
        paramMatrix = paramc.lT.get(i);
        if ((paramMatrix instanceof f.c)) {
          a((f.c)paramMatrix, paramc.lS, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
        float f1;
        float f3;
        float f2;
        Object localObject;
        float f7;
        float f4;
        float f5;
        float f6;
        for (;;)
        {
          i += 1;
          break;
          if ((paramMatrix instanceof f.d))
          {
            paramMatrix = (f.d)paramMatrix;
            f1 = paramInt1 / this.mp;
            f3 = paramInt2 / this.mq;
            f2 = Math.min(f1, f3);
            localObject = paramc.lS;
            this.mi.set((Matrix)localObject);
            this.mi.postScale(f1, f3);
            float[] arrayOfFloat = new float[4];
            float[] tmp155_153 = arrayOfFloat;
            tmp155_153[0] = 0.0F;
            float[] tmp159_155 = tmp155_153;
            tmp159_155[1] = 1.0F;
            float[] tmp163_159 = tmp159_155;
            tmp163_159[2] = 1.0F;
            float[] tmp167_163 = tmp163_159;
            tmp167_163[3] = 0.0F;
            tmp167_163;
            ((Matrix)localObject).mapVectors(arrayOfFloat);
            f1 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
            f7 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
            f3 = arrayOfFloat[0];
            f4 = arrayOfFloat[1];
            f5 = arrayOfFloat[2];
            f6 = arrayOfFloat[3];
            f7 = Math.max(f1, f7);
            f1 = 0.0F;
            if (f7 > 0.0F) {
              f1 = Math.abs(f6 * f3 - f4 * f5) / f7;
            }
            if (f1 != 0.0F)
            {
              paramMatrix.a(this.mf);
              localObject = this.mf;
              this.mg.reset();
              if (!paramMatrix.aA()) {
                break label336;
              }
              this.mg.addPath((Path)localObject, this.mi);
              paramCanvas.clipPath(this.mg, Region.Op.REPLACE);
            }
          }
        }
        label336:
        paramMatrix = (f.b)paramMatrix;
        if ((paramMatrix.lM != 0.0F) || (paramMatrix.lN != 1.0F))
        {
          f6 = paramMatrix.lM;
          f7 = paramMatrix.lO;
          f4 = paramMatrix.lN;
          f5 = paramMatrix.lO;
          if (this.ml == null) {
            this.ml = new PathMeasure();
          }
          this.ml.setPath(this.mf, false);
          f3 = this.ml.getLength();
          f6 = (f6 + f7) % 1.0F * f3;
          f4 = (f4 + f5) % 1.0F * f3;
          ((Path)localObject).reset();
          if (f6 <= f4) {
            break label733;
          }
          this.ml.getSegment(f6, f3, (Path)localObject, true);
          this.ml.getSegment(0.0F, f4, (Path)localObject, true);
        }
        for (;;)
        {
          ((Path)localObject).rLineTo(0.0F, 0.0F);
          this.mg.addPath((Path)localObject, this.mi);
          if (paramMatrix.lI != 0)
          {
            if (this.mk == null)
            {
              this.mk = new Paint();
              this.mk.setStyle(Paint.Style.FILL);
              this.mk.setAntiAlias(true);
            }
            localObject = this.mk;
            ((Paint)localObject).setColor(f.b(paramMatrix.lI, paramMatrix.lL));
            ((Paint)localObject).setColorFilter(paramColorFilter);
            paramCanvas.drawPath(this.mg, (Paint)localObject);
          }
          if (paramMatrix.lG == 0) {
            break;
          }
          if (this.mj == null)
          {
            this.mj = new Paint();
            this.mj.setStyle(Paint.Style.STROKE);
            this.mj.setAntiAlias(true);
          }
          localObject = this.mj;
          if (paramMatrix.lQ != null) {
            ((Paint)localObject).setStrokeJoin(paramMatrix.lQ);
          }
          if (paramMatrix.lP != null) {
            ((Paint)localObject).setStrokeCap(paramMatrix.lP);
          }
          ((Paint)localObject).setStrokeMiter(paramMatrix.lR);
          ((Paint)localObject).setColor(f.b(paramMatrix.lG, paramMatrix.lJ));
          ((Paint)localObject).setColorFilter(paramColorFilter);
          ((Paint)localObject).setStrokeWidth(f1 * f2 * paramMatrix.lH);
          paramCanvas.drawPath(this.mg, (Paint)localObject);
          break;
          label733:
          this.ml.getSegment(f6, f4, (Path)localObject, true);
        }
      }
    }
    
    public final void a(Canvas paramCanvas, int paramInt1, int paramInt2)
    {
      a(this.mm, mh, paramCanvas, paramInt1, paramInt2, null);
    }
  }
  
  private static final class f
    extends Drawable.ConstantState
  {
    int ll;
    PorterDuff.Mode mA;
    int mB;
    boolean mC;
    boolean mD;
    Paint mE;
    f.e mu;
    ColorStateList mv = null;
    PorterDuff.Mode mw = f.lv;
    boolean mx;
    Bitmap my;
    ColorStateList mz;
    
    public f()
    {
      this.mu = new f.e();
    }
    
    public f(f paramf)
    {
      if (paramf != null)
      {
        this.ll = paramf.ll;
        this.mu = new f.e(paramf.mu);
        if (paramf.mu.mk != null) {
          this.mu.mk = new Paint(paramf.mu.mk);
        }
        if (paramf.mu.mj != null) {
          this.mu.mj = new Paint(paramf.mu.mj);
        }
        this.mv = paramf.mv;
        this.mw = paramf.mw;
        this.mx = paramf.mx;
      }
    }
    
    public final void f(int paramInt1, int paramInt2)
    {
      this.my.eraseColor(0);
      Canvas localCanvas = new Canvas(this.my);
      this.mu.a(localCanvas, paramInt1, paramInt2);
    }
    
    public final int getChangingConfigurations()
    {
      return this.ll;
    }
    
    public final Drawable newDrawable()
    {
      return new f(this, (byte)0);
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new f(this, (byte)0);
    }
  }
  
  private static final class g
    extends Drawable.ConstantState
  {
    private final Drawable.ConstantState lp;
    
    public g(Drawable.ConstantState paramConstantState)
    {
      this.lp = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return this.lp.canApplyTheme();
    }
    
    public final int getChangingConfigurations()
    {
      return this.lp.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      f localf = new f((byte)0);
      localf.lu = ((VectorDrawable)this.lp.newDrawable());
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      f localf = new f((byte)0);
      localf.lu = ((VectorDrawable)this.lp.newDrawable(paramResources));
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      f localf = new f((byte)0);
      localf.lu = ((VectorDrawable)this.lp.newDrawable(paramResources, paramTheme));
      return localf;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */