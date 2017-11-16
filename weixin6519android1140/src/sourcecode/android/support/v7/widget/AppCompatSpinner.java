package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.support.v4.view.x;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public class AppCompatSpinner
  extends Spinner
  implements x
{
  private static final boolean OQ;
  private static final boolean OR;
  private static final int[] OS;
  private ListPopupWindow.b JA;
  private Context Lo;
  private SpinnerAdapter OT;
  private boolean OU;
  private b OV;
  private int OW;
  private h Oc;
  private f Od;
  private final Rect dF;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      bool = true;
      OQ = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label45;
      }
    }
    label45:
    for (boolean bool = true;; bool = false)
    {
      OR = bool;
      OS = new int[] { 16843505 };
      return;
      bool = false;
      break;
    }
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.spinnerStyle);
  }
  
  public AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, (byte)0);
  }
  
  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt, byte paramByte)
  {
    this(paramContext, paramAttributeSet, paramInt, -1);
  }
  
  /* Error */
  private AppCompatSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: invokespecial 76	android/widget/Spinner:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   10: aload_0
    //   11: new 78	android/graphics/Rect
    //   14: dup
    //   15: invokespecial 80	android/graphics/Rect:<init>	()V
    //   18: putfield 82	android/support/v7/widget/AppCompatSpinner:dF	Landroid/graphics/Rect;
    //   21: aload_1
    //   22: aload_2
    //   23: getstatic 87	android/support/v7/a/a$k:Spinner	[I
    //   26: iload_3
    //   27: invokestatic 92	android/support/v7/widget/ap:a	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/widget/ap;
    //   30: astore 9
    //   32: aload_0
    //   33: invokestatic 98	android/support/v7/widget/h:ex	()Landroid/support/v7/widget/h;
    //   36: putfield 100	android/support/v7/widget/AppCompatSpinner:Oc	Landroid/support/v7/widget/h;
    //   39: aload_0
    //   40: new 102	android/support/v7/widget/f
    //   43: dup
    //   44: aload_0
    //   45: aload_0
    //   46: getfield 100	android/support/v7/widget/AppCompatSpinner:Oc	Landroid/support/v7/widget/h;
    //   49: invokespecial 105	android/support/v7/widget/f:<init>	(Landroid/view/View;Landroid/support/v7/widget/h;)V
    //   52: putfield 107	android/support/v7/widget/AppCompatSpinner:Od	Landroid/support/v7/widget/f;
    //   55: aload 9
    //   57: getstatic 110	android/support/v7/a/a$k:Spinner_popupTheme	I
    //   60: iconst_0
    //   61: invokevirtual 114	android/support/v7/widget/ap:getResourceId	(II)I
    //   64: istore 5
    //   66: iload 5
    //   68: ifeq +290 -> 358
    //   71: new 116	android/support/v7/view/d
    //   74: dup
    //   75: aload_1
    //   76: iload 5
    //   78: invokespecial 119	android/support/v7/view/d:<init>	(Landroid/content/Context;I)V
    //   81: astore 7
    //   83: aload_0
    //   84: aload 7
    //   86: putfield 121	android/support/v7/widget/AppCompatSpinner:Lo	Landroid/content/Context;
    //   89: aload_0
    //   90: getfield 121	android/support/v7/widget/AppCompatSpinner:Lo	Landroid/content/Context;
    //   93: ifnull +175 -> 268
    //   96: getstatic 49	android/os/Build$VERSION:SDK_INT	I
    //   99: bipush 11
    //   101: if_icmplt +318 -> 419
    //   104: aload_1
    //   105: aload_2
    //   106: getstatic 56	android/support/v7/widget/AppCompatSpinner:OS	[I
    //   109: iload_3
    //   110: iconst_0
    //   111: invokevirtual 127	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   114: astore 7
    //   116: iload 4
    //   118: istore 5
    //   120: aload 7
    //   122: iconst_0
    //   123: invokevirtual 133	android/content/res/TypedArray:hasValue	(I)Z
    //   126: ifeq +12 -> 138
    //   129: aload 7
    //   131: iconst_0
    //   132: iconst_0
    //   133: invokevirtual 136	android/content/res/TypedArray:getInt	(II)I
    //   136: istore 5
    //   138: iload 5
    //   140: istore 6
    //   142: aload 7
    //   144: ifnull +12 -> 156
    //   147: aload 7
    //   149: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   152: iload 5
    //   154: istore 6
    //   156: iload 6
    //   158: iconst_1
    //   159: if_icmpne +109 -> 268
    //   162: new 13	android/support/v7/widget/AppCompatSpinner$b
    //   165: dup
    //   166: aload_0
    //   167: aload_0
    //   168: getfield 121	android/support/v7/widget/AppCompatSpinner:Lo	Landroid/content/Context;
    //   171: aload_2
    //   172: iload_3
    //   173: invokespecial 142	android/support/v7/widget/AppCompatSpinner$b:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   176: astore 7
    //   178: aload_0
    //   179: getfield 121	android/support/v7/widget/AppCompatSpinner:Lo	Landroid/content/Context;
    //   182: aload_2
    //   183: getstatic 87	android/support/v7/a/a$k:Spinner	[I
    //   186: iload_3
    //   187: invokestatic 92	android/support/v7/widget/ap:a	(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroid/support/v7/widget/ap;
    //   190: astore 8
    //   192: aload_0
    //   193: aload 8
    //   195: getstatic 145	android/support/v7/a/a$k:Spinner_android_dropDownWidth	I
    //   198: bipush -2
    //   200: invokevirtual 148	android/support/v7/widget/ap:getLayoutDimension	(II)I
    //   203: putfield 150	android/support/v7/widget/AppCompatSpinner:OW	I
    //   206: aload 7
    //   208: aload 8
    //   210: getstatic 153	android/support/v7/a/a$k:Spinner_android_popupBackground	I
    //   213: invokevirtual 157	android/support/v7/widget/ap:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   216: invokevirtual 161	android/support/v7/widget/AppCompatSpinner$b:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   219: getstatic 164	android/support/v7/a/a$k:Spinner_android_prompt	I
    //   222: istore 4
    //   224: aload 7
    //   226: aload 9
    //   228: getfield 168	android/support/v7/widget/ap:Yu	Landroid/content/res/TypedArray;
    //   231: iload 4
    //   233: invokevirtual 172	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   236: putfield 176	android/support/v7/widget/AppCompatSpinner$b:Pb	Ljava/lang/CharSequence;
    //   239: aload 8
    //   241: getfield 168	android/support/v7/widget/ap:Yu	Landroid/content/res/TypedArray;
    //   244: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   247: aload_0
    //   248: aload 7
    //   250: putfield 178	android/support/v7/widget/AppCompatSpinner:OV	Landroid/support/v7/widget/AppCompatSpinner$b;
    //   253: aload_0
    //   254: new 8	android/support/v7/widget/AppCompatSpinner$1
    //   257: dup
    //   258: aload_0
    //   259: aload_0
    //   260: aload 7
    //   262: invokespecial 181	android/support/v7/widget/AppCompatSpinner$1:<init>	(Landroid/support/v7/widget/AppCompatSpinner;Landroid/view/View;Landroid/support/v7/widget/AppCompatSpinner$b;)V
    //   265: putfield 183	android/support/v7/widget/AppCompatSpinner:JA	Landroid/support/v7/widget/ListPopupWindow$b;
    //   268: getstatic 186	android/support/v7/a/a$k:Spinner_android_entries	I
    //   271: istore 4
    //   273: aload 9
    //   275: getfield 168	android/support/v7/widget/ap:Yu	Landroid/content/res/TypedArray;
    //   278: iload 4
    //   280: invokevirtual 190	android/content/res/TypedArray:getTextArray	(I)[Ljava/lang/CharSequence;
    //   283: astore 7
    //   285: aload 7
    //   287: ifnull +28 -> 315
    //   290: new 192	android/widget/ArrayAdapter
    //   293: dup
    //   294: aload_1
    //   295: ldc -63
    //   297: aload 7
    //   299: invokespecial 196	android/widget/ArrayAdapter:<init>	(Landroid/content/Context;I[Ljava/lang/Object;)V
    //   302: astore_1
    //   303: aload_1
    //   304: getstatic 201	android/support/v7/a/a$h:support_simple_spinner_dropdown_item	I
    //   307: invokevirtual 205	android/widget/ArrayAdapter:setDropDownViewResource	(I)V
    //   310: aload_0
    //   311: aload_1
    //   312: invokevirtual 209	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   315: aload 9
    //   317: getfield 168	android/support/v7/widget/ap:Yu	Landroid/content/res/TypedArray;
    //   320: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   323: aload_0
    //   324: iconst_1
    //   325: putfield 211	android/support/v7/widget/AppCompatSpinner:OU	Z
    //   328: aload_0
    //   329: getfield 213	android/support/v7/widget/AppCompatSpinner:OT	Landroid/widget/SpinnerAdapter;
    //   332: ifnull +16 -> 348
    //   335: aload_0
    //   336: aload_0
    //   337: getfield 213	android/support/v7/widget/AppCompatSpinner:OT	Landroid/widget/SpinnerAdapter;
    //   340: invokevirtual 209	android/support/v7/widget/AppCompatSpinner:setAdapter	(Landroid/widget/SpinnerAdapter;)V
    //   343: aload_0
    //   344: aconst_null
    //   345: putfield 213	android/support/v7/widget/AppCompatSpinner:OT	Landroid/widget/SpinnerAdapter;
    //   348: aload_0
    //   349: getfield 107	android/support/v7/widget/AppCompatSpinner:Od	Landroid/support/v7/widget/f;
    //   352: aload_2
    //   353: iload_3
    //   354: invokevirtual 216	android/support/v7/widget/f:a	(Landroid/util/AttributeSet;I)V
    //   357: return
    //   358: getstatic 51	android/support/v7/widget/AppCompatSpinner:OQ	Z
    //   361: ifne +9 -> 370
    //   364: aload_1
    //   365: astore 7
    //   367: goto -284 -> 83
    //   370: aconst_null
    //   371: astore 7
    //   373: goto -290 -> 83
    //   376: astore 7
    //   378: aconst_null
    //   379: astore 7
    //   381: iload 4
    //   383: istore 6
    //   385: aload 7
    //   387: ifnull -231 -> 156
    //   390: aload 7
    //   392: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   395: iload 4
    //   397: istore 6
    //   399: goto -243 -> 156
    //   402: astore_1
    //   403: aload 8
    //   405: astore 7
    //   407: aload 7
    //   409: ifnull +8 -> 417
    //   412: aload 7
    //   414: invokevirtual 139	android/content/res/TypedArray:recycle	()V
    //   417: aload_1
    //   418: athrow
    //   419: iconst_1
    //   420: istore 6
    //   422: goto -266 -> 156
    //   425: astore_1
    //   426: goto -19 -> 407
    //   429: astore 8
    //   431: goto -50 -> 381
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	434	0	this	AppCompatSpinner
    //   0	434	1	paramContext	Context
    //   0	434	2	paramAttributeSet	AttributeSet
    //   0	434	3	paramInt1	int
    //   0	434	4	paramInt2	int
    //   64	89	5	i	int
    //   140	281	6	j	int
    //   81	291	7	localObject	Object
    //   376	1	7	localException1	Exception
    //   379	34	7	localap1	ap
    //   1	403	8	localap2	ap
    //   429	1	8	localException2	Exception
    //   30	286	9	localap3	ap
    // Exception table:
    //   from	to	target	type
    //   104	116	376	java/lang/Exception
    //   104	116	402	finally
    //   120	138	425	finally
    //   120	138	429	java/lang/Exception
  }
  
  private int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int n = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i2 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int j = Math.max(0, i - (15 - (i2 - i)));
    View localView = null;
    int k = 0;
    i = 0;
    if (j < i2)
    {
      int m = paramSpinnerAdapter.getItemViewType(j);
      if (m == i) {
        break label204;
      }
      localView = null;
      i = m;
    }
    label204:
    for (;;)
    {
      localView = paramSpinnerAdapter.getView(j, localView, this);
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(n, i1);
      k = Math.max(k, localView.getMeasuredWidth());
      j += 1;
      break;
      if (paramDrawable != null)
      {
        paramDrawable.getPadding(this.dF);
        return this.dF.left + this.dF.right + k;
      }
      return k;
    }
  }
  
  public final void a(PorterDuff.Mode paramMode)
  {
    if (this.Od != null) {
      this.Od.a(paramMode);
    }
  }
  
  public final ColorStateList bK()
  {
    if (this.Od != null) {
      return this.Od.bK();
    }
    return null;
  }
  
  public final PorterDuff.Mode bL()
  {
    if (this.Od != null) {
      return this.Od.bL();
    }
    return null;
  }
  
  public final void d(ColorStateList paramColorStateList)
  {
    if (this.Od != null) {
      this.Od.d(paramColorStateList);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Od != null) {
      this.Od.eu();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    if (this.OV != null) {
      return this.OV.RO;
    }
    if (OR) {
      return super.getDropDownHorizontalOffset();
    }
    return 0;
  }
  
  public int getDropDownVerticalOffset()
  {
    if (this.OV != null)
    {
      localb = this.OV;
      if (localb.RR) {}
    }
    while (!OR)
    {
      b localb;
      return 0;
      return localb.RP;
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    if (this.OV != null) {
      return this.OW;
    }
    if (OR) {
      return super.getDropDownWidth();
    }
    return 0;
  }
  
  public Drawable getPopupBackground()
  {
    if (this.OV != null) {
      return this.OV.RL.getBackground();
    }
    if (OR) {
      return super.getPopupBackground();
    }
    return null;
  }
  
  public Context getPopupContext()
  {
    if (this.OV != null) {
      return this.Lo;
    }
    if (OQ) {
      return super.getPopupContext();
    }
    return null;
  }
  
  public CharSequence getPrompt()
  {
    if (this.OV != null) {
      return this.OV.Pb;
    }
    return super.getPrompt();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((this.OV != null) && (this.OV.RL.isShowing())) {
      this.OV.dismiss();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.OV != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.JA != null) && (this.JA.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick()
  {
    if (this.OV != null)
    {
      if (!this.OV.RL.isShowing()) {
        this.OV.show();
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    if (!this.OU) {
      this.OT = paramSpinnerAdapter;
    }
    do
    {
      return;
      super.setAdapter(paramSpinnerAdapter);
    } while (this.OV == null);
    if (this.Lo == null) {}
    for (Context localContext = getContext();; localContext = this.Lo)
    {
      this.OV.setAdapter(new a(paramSpinnerAdapter, localContext.getTheme()));
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.Od != null) {
      this.Od.f(null);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.Od != null) {
      this.Od.aK(paramInt);
    }
  }
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    if (this.OV != null) {
      this.OV.RO = paramInt;
    }
    while (!OR) {
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    if (this.OV != null) {
      this.OV.setVerticalOffset(paramInt);
    }
    while (!OR) {
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (this.OV != null) {
      this.OW = paramInt;
    }
    while (!OR) {
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    if (this.OV != null) {
      this.OV.setBackgroundDrawable(paramDrawable);
    }
    while (!OR) {
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(a.b(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    if (this.OV != null)
    {
      this.OV.Pb = paramCharSequence;
      return;
    }
    super.setPrompt(paramCharSequence);
  }
  
  private static final class a
    implements ListAdapter, SpinnerAdapter
  {
    private SpinnerAdapter OZ;
    private ListAdapter Pa;
    
    public a(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
    {
      this.OZ = paramSpinnerAdapter;
      if ((paramSpinnerAdapter instanceof ListAdapter)) {
        this.Pa = ((ListAdapter)paramSpinnerAdapter);
      }
      if ((paramTheme != null) && (AppCompatSpinner.ey()) && ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter)))
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
    }
    
    public final boolean areAllItemsEnabled()
    {
      ListAdapter localListAdapter = this.Pa;
      if (localListAdapter != null) {
        return localListAdapter.areAllItemsEnabled();
      }
      return true;
    }
    
    public final int getCount()
    {
      if (this.OZ == null) {
        return 0;
      }
      return this.OZ.getCount();
    }
    
    public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (this.OZ == null) {
        return null;
      }
      return this.OZ.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final Object getItem(int paramInt)
    {
      if (this.OZ == null) {
        return null;
      }
      return this.OZ.getItem(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      if (this.OZ == null) {
        return -1L;
      }
      return this.OZ.getItemId(paramInt);
    }
    
    public final int getItemViewType(int paramInt)
    {
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return getDropDownView(paramInt, paramView, paramViewGroup);
    }
    
    public final int getViewTypeCount()
    {
      return 1;
    }
    
    public final boolean hasStableIds()
    {
      return (this.OZ != null) && (this.OZ.hasStableIds());
    }
    
    public final boolean isEmpty()
    {
      return getCount() == 0;
    }
    
    public final boolean isEnabled(int paramInt)
    {
      ListAdapter localListAdapter = this.Pa;
      if (localListAdapter != null) {
        return localListAdapter.isEnabled(paramInt);
      }
      return true;
    }
    
    public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.OZ != null) {
        this.OZ.registerDataSetObserver(paramDataSetObserver);
      }
    }
    
    public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
    {
      if (this.OZ != null) {
        this.OZ.unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  private final class b
    extends ListPopupWindow
  {
    public ListAdapter EP;
    CharSequence Pb;
    final Rect Pc = new Rect();
    
    public b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
      this.RX = AppCompatSpinner.this;
      setModal(true);
      this.RW = 0;
      this.RZ = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppCompatSpinner.this.setSelection(paramAnonymousInt);
          if (AppCompatSpinner.this.getOnItemClickListener() != null) {
            AppCompatSpinner.this.performItemClick(paramAnonymousView, paramAnonymousInt, AppCompatSpinner.b.this.EP.getItemId(paramAnonymousInt));
          }
          AppCompatSpinner.b.this.dismiss();
        }
      };
    }
    
    final void ez()
    {
      Object localObject = this.RL.getBackground();
      int i;
      int m;
      int n;
      int i1;
      int j;
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(AppCompatSpinner.b(AppCompatSpinner.this));
        if (at.bw(AppCompatSpinner.this))
        {
          i = AppCompatSpinner.b(AppCompatSpinner.this).right;
          m = AppCompatSpinner.this.getPaddingLeft();
          n = AppCompatSpinner.this.getPaddingRight();
          i1 = AppCompatSpinner.this.getWidth();
          if (AppCompatSpinner.c(AppCompatSpinner.this) != -2) {
            break label246;
          }
          j = AppCompatSpinner.a(AppCompatSpinner.this, (SpinnerAdapter)this.EP, this.RL.getBackground());
          int k = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.b(AppCompatSpinner.this).left - AppCompatSpinner.b(AppCompatSpinner.this).right;
          if (j <= k) {
            break label294;
          }
          j = k;
        }
      }
      label171:
      label246:
      label294:
      for (;;)
      {
        setContentWidth(Math.max(j, i1 - m - n));
        if (at.bw(AppCompatSpinner.this)) {
          i = i1 - n - this.OW + i;
        }
        for (;;)
        {
          this.RO = i;
          return;
          i = -AppCompatSpinner.b(AppCompatSpinner.this).left;
          break;
          localObject = AppCompatSpinner.b(AppCompatSpinner.this);
          AppCompatSpinner.b(AppCompatSpinner.this).right = 0;
          ((Rect)localObject).left = 0;
          i = 0;
          break;
          if (AppCompatSpinner.c(AppCompatSpinner.this) == -1)
          {
            setContentWidth(i1 - m - n);
            break label171;
          }
          setContentWidth(AppCompatSpinner.c(AppCompatSpinner.this));
          break label171;
          i += m;
        }
      }
    }
    
    public final void setAdapter(ListAdapter paramListAdapter)
    {
      super.setAdapter(paramListAdapter);
      this.EP = paramListAdapter;
    }
    
    public final void show()
    {
      boolean bool = this.RL.isShowing();
      ez();
      fd();
      super.show();
      this.RM.setChoiceMode(1);
      int i = AppCompatSpinner.this.getSelectedItemPosition();
      Object localObject = this.RM;
      if ((this.RL.isShowing()) && (localObject != null))
      {
        ListPopupWindow.a.a((ListPopupWindow.a)localObject, false);
        ((ListPopupWindow.a)localObject).setSelection(i);
        if ((Build.VERSION.SDK_INT >= 11) && (((ListPopupWindow.a)localObject).getChoiceMode() != 0)) {
          ((ListPopupWindow.a)localObject).setItemChecked(i, true);
        }
      }
      if (bool) {}
      do
      {
        return;
        localObject = AppCompatSpinner.this.getViewTreeObserver();
      } while (localObject == null);
      final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          AppCompatSpinner.b localb = AppCompatSpinner.b.this;
          AppCompatSpinner localAppCompatSpinner = AppCompatSpinner.this;
          if ((z.al(localAppCompatSpinner)) && (localAppCompatSpinner.getGlobalVisibleRect(localb.Pc))) {}
          for (int i = 1; i == 0; i = 0)
          {
            AppCompatSpinner.b.this.dismiss();
            return;
          }
          AppCompatSpinner.b.this.ez();
          AppCompatSpinner.b.a(AppCompatSpinner.b.this);
        }
      };
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
      setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public final void onDismiss()
        {
          ViewTreeObserver localViewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
          if (localViewTreeObserver != null) {
            localViewTreeObserver.removeGlobalOnLayoutListener(local2);
          }
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\AppCompatSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */