package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.e.e;
import android.support.v7.a.a.a;
import android.support.v7.a.a.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class h
{
  private static final PorterDuff.Mode Op = PorterDuff.Mode.SRC_IN;
  private static h Oq;
  private static final b Or = new b();
  private static final int[] Os = { a.e.abc_textfield_search_default_mtrl_alpha, a.e.abc_textfield_default_mtrl_alpha, a.e.abc_ab_share_pack_mtrl_alpha };
  private static final int[] Ot = { a.e.abc_ic_ab_back_mtrl_am_alpha, a.e.abc_ic_go_search_api_mtrl_alpha, a.e.abc_ic_search_api_mtrl_alpha, a.e.abc_ic_commit_search_api_mtrl_alpha, a.e.abc_ic_clear_mtrl_alpha, a.e.abc_ic_menu_share_mtrl_alpha, a.e.abc_ic_menu_copy_mtrl_am_alpha, a.e.abc_ic_menu_cut_mtrl_alpha, a.e.abc_ic_menu_selectall_mtrl_alpha, a.e.abc_ic_menu_paste_mtrl_am_alpha, a.e.abc_ic_menu_moreoverflow_mtrl_alpha, a.e.abc_ic_voice_search_api_mtrl_alpha };
  private static final int[] Ou = { a.e.abc_textfield_activated_mtrl_alpha, a.e.abc_textfield_search_activated_mtrl_alpha, a.e.abc_cab_background_top_mtrl_alpha, a.e.abc_text_cursor_material };
  private static final int[] Ov = { a.e.abc_popup_background_mtrl_mult, a.e.abc_cab_background_internal_bg, a.e.abc_menu_hardkey_panel_mtrl_mult };
  private static final int[] Ow = { a.e.abc_edit_text_material, a.e.abc_tab_indicator_material, a.e.abc_textfield_search_material, a.e.abc_spinner_mtrl_am_alpha, a.e.abc_spinner_textfield_background_material, a.e.abc_ratingbar_full_material, a.e.abc_switch_track_mtrl_alpha, a.e.abc_switch_thumb_material, a.e.abc_btn_default_mtrl_shape, a.e.abc_btn_borderless_material };
  private static final int[] Ox = { a.e.abc_btn_check_material, a.e.abc_btn_radio_material };
  private SparseArray<String> OA;
  private final Object OB = new Object();
  private final WeakHashMap<Context, e<WeakReference<Drawable.ConstantState>>> OC = new WeakHashMap(0);
  private TypedValue OD;
  private WeakHashMap<Context, SparseArray<ColorStateList>> Oy;
  private android.support.v4.e.a<String, c> Oz;
  
  private static long a(TypedValue paramTypedValue)
  {
    return paramTypedValue.assetCookie << 32 | paramTypedValue.data;
  }
  
  public static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter2 = (PorterDuffColorFilter)Or.get(Integer.valueOf(b.b(paramInt, paramMode)));
    PorterDuffColorFilter localPorterDuffColorFilter1 = localPorterDuffColorFilter2;
    if (localPorterDuffColorFilter2 == null)
    {
      localPorterDuffColorFilter1 = new PorterDuffColorFilter(paramInt, paramMode);
      Or.put(Integer.valueOf(b.b(paramInt, paramMode)), localPorterDuffColorFilter1);
    }
    return localPorterDuffColorFilter1;
  }
  
  private Drawable a(Context paramContext, long paramLong)
  {
    e locale;
    synchronized (this.OB)
    {
      locale = (e)this.OC.get(paramContext);
      if (locale == null) {
        return null;
      }
      Object localObject2 = (WeakReference)locale.get(paramLong);
      if (localObject2 == null) {
        break label136;
      }
      localObject2 = (Drawable.ConstantState)((WeakReference)localObject2).get();
      if (localObject2 != null)
      {
        paramContext = ((Drawable.ConstantState)localObject2).newDrawable(paramContext.getResources());
        return paramContext;
      }
    }
    int i = android.support.v4.e.b.a(locale.vl, locale.mSize, paramLong);
    if ((i >= 0) && (locale.vm[i] != e.vj))
    {
      locale.vm[i] = e.vj;
      locale.vk = true;
    }
    label136:
    return null;
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable;
    if (w.o(paramDrawable)) {
      localDrawable = paramDrawable.mutate();
    }
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = Op;
    }
    localDrawable.setColorFilter(a(paramInt, paramDrawable));
  }
  
  public static void a(Drawable paramDrawable, an paraman, int[] paramArrayOfInt)
  {
    Object localObject2 = null;
    if ((w.o(paramDrawable)) && (paramDrawable.mutate() != paramDrawable)) {}
    label57:
    label73:
    label97:
    label104:
    label124:
    for (;;)
    {
      return;
      ColorStateList localColorStateList;
      Object localObject1;
      if ((paraman.Ys) || (paraman.Yr)) {
        if (paraman.Ys)
        {
          localColorStateList = paraman.Yq;
          if (!paraman.Yr) {
            break label97;
          }
          paraman = paraman.mw;
          localObject1 = localObject2;
          if (localColorStateList != null)
          {
            if (paraman != null) {
              break label104;
            }
            localObject1 = localObject2;
          }
          paramDrawable.setColorFilter((ColorFilter)localObject1);
        }
      }
      for (;;)
      {
        if (Build.VERSION.SDK_INT > 23) {
          break label124;
        }
        paramDrawable.invalidateSelf();
        return;
        localColorStateList = null;
        break;
        paraman = Op;
        break label57;
        localObject1 = a(localColorStateList.getColorForState(paramArrayOfInt, 0), paraman);
        break label73;
        paramDrawable.clearColorFilter();
      }
    }
  }
  
  private void a(String paramString, c paramc)
  {
    if (this.Oz == null) {
      this.Oz = new android.support.v4.e.a();
    }
    this.Oz.put(paramString, paramc);
  }
  
  static boolean a(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    PorterDuff.Mode localMode = Op;
    int i;
    int j;
    if (a(Os, paramInt))
    {
      i = a.a.colorControlNormal;
      j = 1;
      paramInt = -1;
    }
    for (;;)
    {
      if (j != 0)
      {
        Drawable localDrawable = paramDrawable;
        if (w.o(paramDrawable)) {
          localDrawable = paramDrawable.mutate();
        }
        localDrawable.setColorFilter(a(al.i(paramContext, i), localMode));
        if (paramInt != -1) {
          localDrawable.setAlpha(paramInt);
        }
        return true;
        if (a(Ou, paramInt))
        {
          i = a.a.colorControlActivated;
          j = 1;
          paramInt = -1;
          continue;
        }
        if (a(Ov, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          j = 1;
          i = 16842801;
          paramInt = -1;
          continue;
        }
        if (paramInt == a.e.abc_list_divider_mtrl_alpha)
        {
          i = 16842800;
          paramInt = Math.round(40.8F);
          j = 1;
        }
      }
      else
      {
        return false;
      }
      paramInt = -1;
      i = 0;
      j = 0;
    }
  }
  
  private boolean a(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null) {
      synchronized (this.OB)
      {
        e locale = (e)this.OC.get(paramContext);
        paramDrawable = locale;
        if (locale == null)
        {
          paramDrawable = new e();
          this.OC.put(paramContext, paramDrawable);
        }
        paramDrawable.put(paramLong, new WeakReference(localConstantState));
        return true;
      }
    }
    return false;
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int j = paramArrayOfInt.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfInt[i] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static h ex()
  {
    if (Oq == null)
    {
      h localh = new h();
      Oq = localh;
      int i = Build.VERSION.SDK_INT;
      if (i < 23)
      {
        localh.a("vector", new d());
        if (i >= 11) {
          localh.a("animated-vector", new a());
        }
      }
    }
    return Oq;
  }
  
  private static ColorStateList g(Context paramContext, int paramInt)
  {
    int k = al.i(paramContext, a.a.colorControlHighlight);
    int[] arrayOfInt1 = al.hW;
    int i = al.k(paramContext, a.a.colorButtonNormal);
    paramContext = al.PRESSED_STATE_SET;
    int j = android.support.v4.b.b.h(k, paramInt);
    int[] arrayOfInt2 = al.FOCUSED_STATE_SET;
    k = android.support.v4.b.b.h(k, paramInt);
    return new ColorStateList(new int[][] { arrayOfInt1, paramContext, arrayOfInt2, al.EMPTY_STATE_SET }, new int[] { i, j, k, paramInt });
  }
  
  public final Drawable a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    Object localObject2 = e(paramContext, paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      if (this.OD == null) {
        this.OD = new TypedValue();
      }
      TypedValue localTypedValue = this.OD;
      paramContext.getResources().getValue(paramInt, localTypedValue, true);
      long l = a(localTypedValue);
      localObject2 = a(paramContext, l);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        if (paramInt == a.e.abc_cab_background_top_material) {
          localObject2 = new LayerDrawable(new Drawable[] { a(paramContext, a.e.abc_cab_background_internal_bg, false), a(paramContext, a.e.abc_cab_background_top_mtrl_alpha, false) });
        }
        localObject1 = localObject2;
        if (localObject2 != null)
        {
          ((Drawable)localObject2).setChangingConfigurations(localTypedValue.changingConfigurations);
          a(paramContext, l, (Drawable)localObject2);
          localObject1 = localObject2;
        }
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = android.support.v4.content.a.b(paramContext, paramInt);
    }
    localObject1 = localObject2;
    if (localObject2 != null) {
      localObject1 = a(paramContext, paramInt, paramBoolean, (Drawable)localObject2);
    }
    if (localObject1 != null) {
      w.n((Drawable)localObject1);
    }
    return (Drawable)localObject1;
  }
  
  final Drawable a(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = null;
    ColorStateList localColorStateList = f(paramContext, paramInt);
    if (localColorStateList != null)
    {
      paramContext = paramDrawable;
      if (w.o(paramDrawable)) {
        paramContext = paramDrawable.mutate();
      }
      paramDrawable = android.support.v4.b.a.a.g(paramContext);
      android.support.v4.b.a.a.a(paramDrawable, localColorStateList);
      paramContext = (Context)localObject;
      if (paramInt == a.e.abc_switch_thumb_material) {
        paramContext = PorterDuff.Mode.MULTIPLY;
      }
      localObject = paramDrawable;
      if (paramContext != null)
      {
        android.support.v4.b.a.a.a(paramDrawable, paramContext);
        localObject = paramDrawable;
      }
    }
    do
    {
      do
      {
        return (Drawable)localObject;
        if (paramInt == a.e.abc_seekbar_track_material)
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), al.i(paramContext, a.a.colorControlNormal), Op);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), al.i(paramContext, a.a.colorControlNormal), Op);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), al.i(paramContext, a.a.colorControlActivated), Op);
          return paramDrawable;
        }
        if ((paramInt == a.e.abc_ratingbar_indicator_material) || (paramInt == a.e.abc_ratingbar_small_material))
        {
          localObject = (LayerDrawable)paramDrawable;
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908288), al.k(paramContext, a.a.colorControlNormal), Op);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908303), al.i(paramContext, a.a.colorControlActivated), Op);
          a(((LayerDrawable)localObject).findDrawableByLayerId(16908301), al.i(paramContext, a.a.colorControlActivated), Op);
          return paramDrawable;
        }
        localObject = paramDrawable;
      } while (a(paramContext, paramInt, paramDrawable));
      localObject = paramDrawable;
    } while (!paramBoolean);
    return null;
  }
  
  final Drawable e(Context paramContext, int paramInt)
  {
    if ((this.Oz != null) && (!this.Oz.isEmpty()))
    {
      if (this.OA != null)
      {
        localObject1 = (String)this.OA.get(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (this.Oz.get(localObject1) == null)))
        {
          localObject1 = null;
          return (Drawable)localObject1;
        }
      }
      else
      {
        this.OA = new SparseArray();
      }
      if (this.OD == null) {
        this.OD = new TypedValue();
      }
      TypedValue localTypedValue = this.OD;
      Object localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l = a(localTypedValue);
      Drawable localDrawable = a(paramContext, l);
      if (localDrawable != null) {
        return localDrawable;
      }
      Object localObject2 = localDrawable;
      XmlResourceParser localXmlResourceParser;
      AttributeSet localAttributeSet;
      if (localTypedValue.string != null)
      {
        localObject2 = localDrawable;
        if (localTypedValue.string.toString().endsWith(".xml"))
        {
          localObject2 = localDrawable;
          try
          {
            localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
            localObject2 = localDrawable;
            localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
            int i;
            do
            {
              localObject2 = localDrawable;
              i = localXmlResourceParser.next();
            } while ((i != 2) && (i != 1));
            if (i != 2)
            {
              localObject2 = localDrawable;
              throw new XmlPullParserException("No start tag found");
            }
          }
          catch (Exception paramContext) {}
        }
      }
      for (paramContext = (Context)localObject2;; paramContext = (Context)localObject1)
      {
        localObject1 = paramContext;
        if (paramContext != null) {
          break;
        }
        this.OA.append(paramInt, "appcompat_skip_skip");
        return paramContext;
        localObject2 = localDrawable;
        localObject1 = localXmlResourceParser.getName();
        localObject2 = localDrawable;
        this.OA.append(paramInt, localObject1);
        localObject2 = localDrawable;
        c localc = (c)this.Oz.get(localObject1);
        localObject1 = localDrawable;
        if (localc != null)
        {
          localObject2 = localDrawable;
          localObject1 = localc.a(paramContext, localXmlResourceParser, localAttributeSet, paramContext.getTheme());
        }
        if (localObject1 != null)
        {
          localObject2 = localObject1;
          ((Drawable)localObject1).setChangingConfigurations(localTypedValue.changingConfigurations);
          localObject2 = localObject1;
          a(paramContext, l, (Drawable)localObject1);
        }
      }
    }
    return null;
  }
  
  public final ColorStateList f(Context paramContext, int paramInt)
  {
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    Object localObject3;
    int k;
    if (this.Oy != null)
    {
      localObject1 = (SparseArray)this.Oy.get(paramContext);
      if (localObject1 != null)
      {
        localObject1 = (ColorStateList)((SparseArray)localObject1).get(paramInt);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          if (paramInt != a.e.abc_edit_text_material) {
            break label230;
          }
          localObject1 = al.hW;
          i = al.k(paramContext, a.a.colorControlNormal);
          localObject2 = al.Yn;
          j = al.i(paramContext, a.a.colorControlNormal);
          localObject3 = al.EMPTY_STATE_SET;
          k = al.i(paramContext, a.a.colorControlActivated);
          localObject1 = new ColorStateList(new int[][] { localObject1, localObject2, localObject3 }, new int[] { i, j, k });
        }
      }
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        if (this.Oy == null) {
          this.Oy = new WeakHashMap();
        }
        localObject3 = (SparseArray)this.Oy.get(paramContext);
        localObject2 = localObject3;
        if (localObject3 == null)
        {
          localObject2 = new SparseArray();
          this.Oy.put(paramContext, localObject2);
        }
        ((SparseArray)localObject2).append(paramInt, localObject1);
      }
      localObject2 = localObject1;
      return (ColorStateList)localObject2;
      localObject1 = null;
      break;
      localObject1 = null;
      break;
      label230:
      if (paramInt == a.e.abc_switch_track_mtrl_alpha)
      {
        localObject1 = al.hW;
        i = al.a(paramContext, 16842800, 0.1F);
        localObject2 = al.dd;
        j = al.a(paramContext, a.a.colorControlActivated, 0.3F);
        localObject3 = al.EMPTY_STATE_SET;
        k = al.a(paramContext, 16842800, 0.3F);
        localObject1 = new ColorStateList(new int[][] { localObject1, localObject2, localObject3 }, new int[] { i, j, k });
      }
      else
      {
        if (paramInt == a.e.abc_switch_thumb_material)
        {
          localObject1 = new int[3][];
          localObject2 = new int[3];
          localObject3 = al.j(paramContext, a.a.colorSwitchThumbNormal);
          if ((localObject3 != null) && (((ColorStateList)localObject3).isStateful()))
          {
            localObject1[0] = al.hW;
            localObject2[0] = ((ColorStateList)localObject3).getColorForState(localObject1[0], 0);
            localObject1[1] = al.dd;
            localObject2[1] = al.i(paramContext, a.a.colorControlActivated);
            localObject1[2] = al.EMPTY_STATE_SET;
            localObject2[2] = ((ColorStateList)localObject3).getDefaultColor();
          }
          for (;;)
          {
            localObject1 = new ColorStateList((int[][])localObject1, (int[])localObject2);
            break;
            localObject1[0] = al.hW;
            localObject2[0] = al.k(paramContext, a.a.colorSwitchThumbNormal);
            localObject1[1] = al.dd;
            localObject2[1] = al.i(paramContext, a.a.colorControlActivated);
            localObject1[2] = al.EMPTY_STATE_SET;
            localObject2[2] = al.i(paramContext, a.a.colorSwitchThumbNormal);
          }
        }
        if (paramInt == a.e.abc_btn_default_mtrl_shape)
        {
          localObject1 = g(paramContext, al.i(paramContext, a.a.colorButtonNormal));
        }
        else if (paramInt == a.e.abc_btn_borderless_material)
        {
          localObject1 = g(paramContext, 0);
        }
        else if (paramInt == a.e.abc_btn_colored_material)
        {
          localObject1 = g(paramContext, al.i(paramContext, a.a.colorAccent));
        }
        else if ((paramInt == a.e.abc_spinner_mtrl_am_alpha) || (paramInt == a.e.abc_spinner_textfield_background_material))
        {
          localObject1 = al.hW;
          i = al.k(paramContext, a.a.colorControlNormal);
          localObject2 = al.Yn;
          j = al.i(paramContext, a.a.colorControlNormal);
          localObject3 = al.EMPTY_STATE_SET;
          k = al.i(paramContext, a.a.colorControlActivated);
          localObject1 = new ColorStateList(new int[][] { localObject1, localObject2, localObject3 }, new int[] { i, j, k });
        }
        else if (a(Ot, paramInt))
        {
          localObject1 = al.j(paramContext, a.a.colorControlNormal);
        }
        else if (a(Ow, paramInt))
        {
          i = al.i(paramContext, a.a.colorControlNormal);
          j = al.i(paramContext, a.a.colorControlActivated);
          localObject1 = al.hW;
          k = al.k(paramContext, a.a.colorControlNormal);
          localObject1 = new ColorStateList(new int[][] { localObject1, al.FOCUSED_STATE_SET, al.Ym, al.PRESSED_STATE_SET, al.dd, al.SELECTED_STATE_SET, al.EMPTY_STATE_SET }, new int[] { k, j, j, j, j, j, i });
        }
        else if (a(Ox, paramInt))
        {
          localObject1 = al.hW;
          i = al.k(paramContext, a.a.colorControlNormal);
          localObject2 = al.dd;
          j = al.i(paramContext, a.a.colorControlActivated);
          localObject3 = al.EMPTY_STATE_SET;
          k = al.i(paramContext, a.a.colorControlNormal);
          localObject1 = new ColorStateList(new int[][] { localObject1, localObject2, localObject3 }, new int[] { i, j, k });
        }
        else if (paramInt == a.e.abc_seekbar_thumb_material)
        {
          localObject1 = al.hW;
          i = al.k(paramContext, a.a.colorControlActivated);
          localObject2 = al.EMPTY_STATE_SET;
          j = al.i(paramContext, a.a.colorControlActivated);
          localObject1 = new ColorStateList(new int[][] { localObject1, localObject2 }, new int[] { i, j });
        }
      }
    }
  }
  
  private static final class a
    implements h.c
  {
    public final Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = android.support.b.a.b.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext) {}
      return null;
    }
  }
  
  private static final class b
    extends android.support.v4.e.f<Integer, PorterDuffColorFilter>
  {
    public b()
    {
      super();
    }
    
    static int b(int paramInt, PorterDuff.Mode paramMode)
    {
      return (paramInt + 31) * 31 + paramMode.hashCode();
    }
  }
  
  private static abstract interface c
  {
    public abstract Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }
  
  private static final class d
    implements h.c
  {
    public final Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = android.support.b.a.f.a(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext) {}
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */