package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.l;
import android.support.v4.view.a.f;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.i;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView
  extends ViewGroup
  implements p, w
{
  private static final int[] SJ = { 16843830 };
  private static final boolean SK;
  static final boolean SL;
  private static final Class<?>[] SM;
  private static final Interpolator TP;
  private final int[] Cs;
  private final int[] Ct;
  private final o SN;
  final m SO;
  private SavedState SP;
  e SQ;
  s SR;
  final as SS;
  private boolean ST;
  private final Runnable SU;
  private a SV;
  public h SW;
  private n SX;
  public final ArrayList<g> SY;
  public final ArrayList<j> SZ;
  private float TA;
  private final s TB;
  final q TC;
  public k TD;
  public List<k> TE;
  boolean TF;
  boolean TG;
  private RecyclerView.e.b TH;
  private boolean TI;
  private ac TJ;
  private d TK;
  private final int[] TL;
  private android.support.v4.view.q TM;
  private final int[] TN;
  private Runnable TO;
  private final as.b TQ;
  public j Ta;
  private boolean Tb;
  public boolean Tc;
  boolean Td;
  private int Te;
  private boolean Tf;
  private boolean Tg;
  private boolean Th;
  private int Ti;
  private boolean Tj;
  private final boolean Tk;
  public List<i> Tl;
  boolean Tm;
  private int Tn;
  i To;
  i Tp;
  i Tq;
  i Tr;
  public e Ts;
  private int Tt;
  private int Tu;
  private int Tv;
  private int Tw;
  private int Tx;
  private final int Ty;
  private final int Tz;
  private final Rect dF;
  private VelocityTracker ez;
  private int hQ;
  private final AccessibilityManager iz;
  public int xl;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20))
    {
      bool = true;
      SK = bool;
      if (Build.VERSION.SDK_INT < 23) {
        break label100;
      }
    }
    label100:
    for (boolean bool = true;; bool = false)
    {
      SL = bool;
      SM = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      TP = new Interpolator()
      {
        public final float getInterpolation(float paramAnonymousFloat)
        {
          paramAnonymousFloat -= 1.0F;
          return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
        }
      };
      return;
      bool = false;
      break;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  /* Error */
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: invokespecial 254	android/view/ViewGroup:<init>	(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   10: aload_0
    //   11: new 78	android/support/v7/widget/RecyclerView$o
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 257	android/support/v7/widget/RecyclerView$o:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   19: putfield 259	android/support/v7/widget/RecyclerView:SN	Landroid/support/v7/widget/RecyclerView$o;
    //   22: aload_0
    //   23: new 72	android/support/v7/widget/RecyclerView$m
    //   26: dup
    //   27: aload_0
    //   28: invokespecial 260	android/support/v7/widget/RecyclerView$m:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   31: putfield 262	android/support/v7/widget/RecyclerView:SO	Landroid/support/v7/widget/RecyclerView$m;
    //   34: aload_0
    //   35: new 264	android/support/v7/widget/as
    //   38: dup
    //   39: invokespecial 265	android/support/v7/widget/as:<init>	()V
    //   42: putfield 267	android/support/v7/widget/RecyclerView:SS	Landroid/support/v7/widget/as;
    //   45: aload_0
    //   46: new 10	android/support/v7/widget/RecyclerView$1
    //   49: dup
    //   50: aload_0
    //   51: invokespecial 268	android/support/v7/widget/RecyclerView$1:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   54: putfield 270	android/support/v7/widget/RecyclerView:SU	Ljava/lang/Runnable;
    //   57: aload_0
    //   58: new 272	android/graphics/Rect
    //   61: dup
    //   62: invokespecial 273	android/graphics/Rect:<init>	()V
    //   65: putfield 275	android/support/v7/widget/RecyclerView:dF	Landroid/graphics/Rect;
    //   68: aload_0
    //   69: new 277	java/util/ArrayList
    //   72: dup
    //   73: invokespecial 278	java/util/ArrayList:<init>	()V
    //   76: putfield 280	android/support/v7/widget/RecyclerView:SY	Ljava/util/ArrayList;
    //   79: aload_0
    //   80: new 277	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 278	java/util/ArrayList:<init>	()V
    //   87: putfield 282	android/support/v7/widget/RecyclerView:SZ	Ljava/util/ArrayList;
    //   90: aload_0
    //   91: iconst_0
    //   92: putfield 284	android/support/v7/widget/RecyclerView:Te	I
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield 286	android/support/v7/widget/RecyclerView:Tm	Z
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield 288	android/support/v7/widget/RecyclerView:Tn	I
    //   105: aload_0
    //   106: new 290	android/support/v7/widget/v
    //   109: dup
    //   110: invokespecial 291	android/support/v7/widget/v:<init>	()V
    //   113: putfield 293	android/support/v7/widget/RecyclerView:Ts	Landroid/support/v7/widget/RecyclerView$e;
    //   116: aload_0
    //   117: iconst_0
    //   118: putfield 295	android/support/v7/widget/RecyclerView:xl	I
    //   121: aload_0
    //   122: iconst_m1
    //   123: putfield 297	android/support/v7/widget/RecyclerView:Tt	I
    //   126: aload_0
    //   127: ldc_w 298
    //   130: putfield 300	android/support/v7/widget/RecyclerView:TA	F
    //   133: aload_0
    //   134: new 92	android/support/v7/widget/RecyclerView$s
    //   137: dup
    //   138: aload_0
    //   139: invokespecial 301	android/support/v7/widget/RecyclerView$s:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   142: putfield 303	android/support/v7/widget/RecyclerView:TB	Landroid/support/v7/widget/RecyclerView$s;
    //   145: aload_0
    //   146: new 86	android/support/v7/widget/RecyclerView$q
    //   149: dup
    //   150: invokespecial 304	android/support/v7/widget/RecyclerView$q:<init>	()V
    //   153: putfield 306	android/support/v7/widget/RecyclerView:TC	Landroid/support/v7/widget/RecyclerView$q;
    //   156: aload_0
    //   157: iconst_0
    //   158: putfield 308	android/support/v7/widget/RecyclerView:TF	Z
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield 310	android/support/v7/widget/RecyclerView:TG	Z
    //   166: aload_0
    //   167: new 51	android/support/v7/widget/RecyclerView$f
    //   170: dup
    //   171: aload_0
    //   172: invokespecial 311	android/support/v7/widget/RecyclerView$f:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   175: putfield 313	android/support/v7/widget/RecyclerView:TH	Landroid/support/v7/widget/RecyclerView$e$b;
    //   178: aload_0
    //   179: iconst_0
    //   180: putfield 315	android/support/v7/widget/RecyclerView:TI	Z
    //   183: aload_0
    //   184: iconst_2
    //   185: newarray <illegal type>
    //   187: putfield 317	android/support/v7/widget/RecyclerView:TL	[I
    //   190: aload_0
    //   191: iconst_2
    //   192: newarray <illegal type>
    //   194: putfield 319	android/support/v7/widget/RecyclerView:Cs	[I
    //   197: aload_0
    //   198: iconst_2
    //   199: newarray <illegal type>
    //   201: putfield 321	android/support/v7/widget/RecyclerView:Ct	[I
    //   204: aload_0
    //   205: iconst_2
    //   206: newarray <illegal type>
    //   208: putfield 323	android/support/v7/widget/RecyclerView:TN	[I
    //   211: aload_0
    //   212: new 12	android/support/v7/widget/RecyclerView$2
    //   215: dup
    //   216: aload_0
    //   217: invokespecial 324	android/support/v7/widget/RecyclerView$2:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   220: putfield 326	android/support/v7/widget/RecyclerView:TO	Ljava/lang/Runnable;
    //   223: aload_0
    //   224: new 16	android/support/v7/widget/RecyclerView$4
    //   227: dup
    //   228: aload_0
    //   229: invokespecial 327	android/support/v7/widget/RecyclerView$4:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   232: putfield 329	android/support/v7/widget/RecyclerView:TQ	Landroid/support/v7/widget/as$b;
    //   235: aload_0
    //   236: iconst_1
    //   237: invokevirtual 333	android/support/v7/widget/RecyclerView:setScrollContainer	(Z)V
    //   240: aload_0
    //   241: iconst_1
    //   242: invokevirtual 336	android/support/v7/widget/RecyclerView:setFocusableInTouchMode	(Z)V
    //   245: getstatic 210	android/os/Build$VERSION:SDK_INT	I
    //   248: bipush 16
    //   250: if_icmplt +384 -> 634
    //   253: iconst_1
    //   254: istore 4
    //   256: aload_0
    //   257: iload 4
    //   259: putfield 338	android/support/v7/widget/RecyclerView:Tk	Z
    //   262: aload_1
    //   263: invokestatic 344	android/view/ViewConfiguration:get	(Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   266: astore 6
    //   268: aload_0
    //   269: aload 6
    //   271: invokevirtual 348	android/view/ViewConfiguration:getScaledTouchSlop	()I
    //   274: putfield 350	android/support/v7/widget/RecyclerView:hQ	I
    //   277: aload_0
    //   278: aload 6
    //   280: invokevirtual 353	android/view/ViewConfiguration:getScaledMinimumFlingVelocity	()I
    //   283: putfield 355	android/support/v7/widget/RecyclerView:Ty	I
    //   286: aload_0
    //   287: aload 6
    //   289: invokevirtual 358	android/view/ViewConfiguration:getScaledMaximumFlingVelocity	()I
    //   292: putfield 360	android/support/v7/widget/RecyclerView:Tz	I
    //   295: aload_0
    //   296: invokestatic 366	android/support/v4/view/z:C	(Landroid/view/View;)I
    //   299: iconst_2
    //   300: if_icmpne +340 -> 640
    //   303: iconst_1
    //   304: istore 4
    //   306: aload_0
    //   307: iload 4
    //   309: invokevirtual 369	android/support/v7/widget/RecyclerView:setWillNotDraw	(Z)V
    //   312: aload_0
    //   313: getfield 293	android/support/v7/widget/RecyclerView:Ts	Landroid/support/v7/widget/RecyclerView$e;
    //   316: aload_0
    //   317: getfield 313	android/support/v7/widget/RecyclerView:TH	Landroid/support/v7/widget/RecyclerView$e$b;
    //   320: putfield 372	android/support/v7/widget/RecyclerView$e:TU	Landroid/support/v7/widget/RecyclerView$e$b;
    //   323: aload_0
    //   324: new 374	android/support/v7/widget/e
    //   327: dup
    //   328: new 20	android/support/v7/widget/RecyclerView$6
    //   331: dup
    //   332: aload_0
    //   333: invokespecial 375	android/support/v7/widget/RecyclerView$6:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   336: invokespecial 378	android/support/v7/widget/e:<init>	(Landroid/support/v7/widget/e$a;)V
    //   339: putfield 380	android/support/v7/widget/RecyclerView:SQ	Landroid/support/v7/widget/e;
    //   342: aload_0
    //   343: new 382	android/support/v7/widget/s
    //   346: dup
    //   347: new 18	android/support/v7/widget/RecyclerView$5
    //   350: dup
    //   351: aload_0
    //   352: invokespecial 383	android/support/v7/widget/RecyclerView$5:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   355: invokespecial 386	android/support/v7/widget/s:<init>	(Landroid/support/v7/widget/s$b;)V
    //   358: putfield 388	android/support/v7/widget/RecyclerView:SR	Landroid/support/v7/widget/s;
    //   361: aload_0
    //   362: invokestatic 391	android/support/v4/view/z:G	(Landroid/view/View;)I
    //   365: ifne +8 -> 373
    //   368: aload_0
    //   369: iconst_1
    //   370: invokestatic 394	android/support/v4/view/z:i	(Landroid/view/View;I)V
    //   373: aload_0
    //   374: aload_0
    //   375: invokevirtual 398	android/support/v7/widget/RecyclerView:getContext	()Landroid/content/Context;
    //   378: ldc_w 400
    //   381: invokevirtual 404	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   384: checkcast 406	android/view/accessibility/AccessibilityManager
    //   387: putfield 408	android/support/v7/widget/RecyclerView:iz	Landroid/view/accessibility/AccessibilityManager;
    //   390: aload_0
    //   391: new 410	android/support/v7/widget/ac
    //   394: dup
    //   395: aload_0
    //   396: invokespecial 411	android/support/v7/widget/ac:<init>	(Landroid/support/v7/widget/RecyclerView;)V
    //   399: putfield 413	android/support/v7/widget/RecyclerView:TJ	Landroid/support/v7/widget/ac;
    //   402: aload_0
    //   403: aload_0
    //   404: getfield 413	android/support/v7/widget/RecyclerView:TJ	Landroid/support/v7/widget/ac;
    //   407: invokestatic 416	android/support/v4/view/z:a	(Landroid/view/View;Landroid/support/v4/view/a;)V
    //   410: iload 5
    //   412: istore 4
    //   414: aload_2
    //   415: ifnull +212 -> 627
    //   418: aload_1
    //   419: aload_2
    //   420: getstatic 421	android/support/v7/d/a$c:cg	[I
    //   423: iload_3
    //   424: iconst_0
    //   425: invokevirtual 425	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   428: astore 6
    //   430: aload 6
    //   432: getstatic 428	android/support/v7/d/a$c:Is	I
    //   435: invokevirtual 434	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   438: astore 7
    //   440: aload 6
    //   442: invokevirtual 437	android/content/res/TypedArray:recycle	()V
    //   445: aload 7
    //   447: ifnull +145 -> 592
    //   450: aload 7
    //   452: invokevirtual 443	java/lang/String:trim	()Ljava/lang/String;
    //   455: astore 6
    //   457: aload 6
    //   459: invokevirtual 446	java/lang/String:length	()I
    //   462: ifeq +130 -> 592
    //   465: aload 6
    //   467: iconst_0
    //   468: invokevirtual 450	java/lang/String:charAt	(I)C
    //   471: bipush 46
    //   473: if_icmpne +173 -> 646
    //   476: new 452	java/lang/StringBuilder
    //   479: dup
    //   480: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   483: aload_1
    //   484: invokevirtual 456	android/content/Context:getPackageName	()Ljava/lang/String;
    //   487: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: aload 6
    //   492: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   498: astore 6
    //   500: aload_0
    //   501: invokevirtual 467	android/support/v7/widget/RecyclerView:isInEditMode	()Z
    //   504: ifeq +192 -> 696
    //   507: aload_0
    //   508: invokevirtual 473	java/lang/Object:getClass	()Ljava/lang/Class;
    //   511: invokevirtual 477	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   514: astore 7
    //   516: aload 7
    //   518: aload 6
    //   520: invokevirtual 483	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   523: ldc 57
    //   525: invokevirtual 487	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   528: astore 9
    //   530: aload 9
    //   532: getstatic 228	android/support/v7/widget/RecyclerView:SM	[Ljava/lang/Class;
    //   535: invokevirtual 491	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   538: astore 7
    //   540: iconst_4
    //   541: anewarray 469	java/lang/Object
    //   544: astore 8
    //   546: aload 8
    //   548: iconst_0
    //   549: aload_1
    //   550: aastore
    //   551: aload 8
    //   553: iconst_1
    //   554: aload_2
    //   555: aastore
    //   556: aload 8
    //   558: iconst_2
    //   559: iload_3
    //   560: invokestatic 495	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   563: aastore
    //   564: aload 8
    //   566: iconst_3
    //   567: iconst_0
    //   568: invokestatic 495	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   571: aastore
    //   572: aload 7
    //   574: iconst_1
    //   575: invokevirtual 500	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   578: aload_0
    //   579: aload 7
    //   581: aload 8
    //   583: invokevirtual 504	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   586: checkcast 57	android/support/v7/widget/RecyclerView$h
    //   589: invokevirtual 507	android/support/v7/widget/RecyclerView:a	(Landroid/support/v7/widget/RecyclerView$h;)V
    //   592: iload 5
    //   594: istore 4
    //   596: getstatic 210	android/os/Build$VERSION:SDK_INT	I
    //   599: bipush 21
    //   601: if_icmplt +26 -> 627
    //   604: aload_1
    //   605: aload_2
    //   606: getstatic 205	android/support/v7/widget/RecyclerView:SJ	[I
    //   609: iload_3
    //   610: iconst_0
    //   611: invokevirtual 425	android/content/Context:obtainStyledAttributes	(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   614: astore_1
    //   615: aload_1
    //   616: iconst_0
    //   617: iconst_1
    //   618: invokevirtual 511	android/content/res/TypedArray:getBoolean	(IZ)Z
    //   621: istore 4
    //   623: aload_1
    //   624: invokevirtual 437	android/content/res/TypedArray:recycle	()V
    //   627: aload_0
    //   628: iload 4
    //   630: invokevirtual 514	android/support/v7/widget/RecyclerView:setNestedScrollingEnabled	(Z)V
    //   633: return
    //   634: iconst_0
    //   635: istore 4
    //   637: goto -381 -> 256
    //   640: iconst_0
    //   641: istore 4
    //   643: goto -337 -> 306
    //   646: aload 6
    //   648: ldc_w 516
    //   651: invokevirtual 520	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   654: ifeq +6 -> 660
    //   657: goto -157 -> 500
    //   660: new 452	java/lang/StringBuilder
    //   663: dup
    //   664: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   667: ldc 2
    //   669: invokevirtual 524	java/lang/Class:getPackage	()Ljava/lang/Package;
    //   672: invokevirtual 529	java/lang/Package:getName	()Ljava/lang/String;
    //   675: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   678: bipush 46
    //   680: invokevirtual 532	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   683: aload 6
    //   685: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   691: astore 6
    //   693: goto -193 -> 500
    //   696: aload_1
    //   697: invokevirtual 533	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   700: astore 7
    //   702: goto -186 -> 516
    //   705: astore 8
    //   707: aload 9
    //   709: iconst_0
    //   710: anewarray 216	java/lang/Class
    //   713: invokevirtual 491	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   716: astore 7
    //   718: aconst_null
    //   719: astore 8
    //   721: goto -149 -> 572
    //   724: astore_1
    //   725: aload_1
    //   726: aload 8
    //   728: invokevirtual 537	java/lang/NoSuchMethodException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   731: pop
    //   732: new 539	java/lang/IllegalStateException
    //   735: dup
    //   736: new 452	java/lang/StringBuilder
    //   739: dup
    //   740: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   743: aload_2
    //   744: invokeinterface 542 1 0
    //   749: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   752: ldc_w 544
    //   755: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: aload 6
    //   760: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   766: aload_1
    //   767: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   770: athrow
    //   771: astore_1
    //   772: new 539	java/lang/IllegalStateException
    //   775: dup
    //   776: new 452	java/lang/StringBuilder
    //   779: dup
    //   780: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   783: aload_2
    //   784: invokeinterface 542 1 0
    //   789: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: ldc_w 549
    //   795: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   798: aload 6
    //   800: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   806: aload_1
    //   807: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   810: athrow
    //   811: astore_1
    //   812: new 539	java/lang/IllegalStateException
    //   815: dup
    //   816: new 452	java/lang/StringBuilder
    //   819: dup
    //   820: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   823: aload_2
    //   824: invokeinterface 542 1 0
    //   829: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   832: ldc_w 551
    //   835: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   838: aload 6
    //   840: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   846: aload_1
    //   847: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   850: athrow
    //   851: astore_1
    //   852: new 539	java/lang/IllegalStateException
    //   855: dup
    //   856: new 452	java/lang/StringBuilder
    //   859: dup
    //   860: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   863: aload_2
    //   864: invokeinterface 542 1 0
    //   869: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   872: ldc_w 551
    //   875: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: aload 6
    //   880: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   886: aload_1
    //   887: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   890: athrow
    //   891: astore_1
    //   892: new 539	java/lang/IllegalStateException
    //   895: dup
    //   896: new 452	java/lang/StringBuilder
    //   899: dup
    //   900: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   903: aload_2
    //   904: invokeinterface 542 1 0
    //   909: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   912: ldc_w 553
    //   915: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   918: aload 6
    //   920: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   926: aload_1
    //   927: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   930: athrow
    //   931: astore_1
    //   932: new 539	java/lang/IllegalStateException
    //   935: dup
    //   936: new 452	java/lang/StringBuilder
    //   939: dup
    //   940: invokespecial 453	java/lang/StringBuilder:<init>	()V
    //   943: aload_2
    //   944: invokeinterface 542 1 0
    //   949: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   952: ldc_w 555
    //   955: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: aload 6
    //   960: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   966: aload_1
    //   967: invokespecial 547	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   970: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	971	0	this	RecyclerView
    //   0	971	1	paramContext	Context
    //   0	971	2	paramAttributeSet	AttributeSet
    //   0	971	3	paramInt	int
    //   254	388	4	bool1	boolean
    //   1	592	5	bool2	boolean
    //   266	693	6	localObject1	Object
    //   438	279	7	localObject2	Object
    //   544	38	8	arrayOfObject	Object[]
    //   705	1	8	localNoSuchMethodException	NoSuchMethodException
    //   719	8	8	localThrowable	Throwable
    //   528	180	9	localClass	Class
    // Exception table:
    //   from	to	target	type
    //   530	546	705	java/lang/NoSuchMethodException
    //   556	572	705	java/lang/NoSuchMethodException
    //   707	718	724	java/lang/NoSuchMethodException
    //   500	516	771	java/lang/ClassNotFoundException
    //   516	530	771	java/lang/ClassNotFoundException
    //   530	546	771	java/lang/ClassNotFoundException
    //   556	572	771	java/lang/ClassNotFoundException
    //   572	592	771	java/lang/ClassNotFoundException
    //   696	702	771	java/lang/ClassNotFoundException
    //   707	718	771	java/lang/ClassNotFoundException
    //   725	771	771	java/lang/ClassNotFoundException
    //   500	516	811	java/lang/reflect/InvocationTargetException
    //   516	530	811	java/lang/reflect/InvocationTargetException
    //   530	546	811	java/lang/reflect/InvocationTargetException
    //   556	572	811	java/lang/reflect/InvocationTargetException
    //   572	592	811	java/lang/reflect/InvocationTargetException
    //   696	702	811	java/lang/reflect/InvocationTargetException
    //   707	718	811	java/lang/reflect/InvocationTargetException
    //   725	771	811	java/lang/reflect/InvocationTargetException
    //   500	516	851	java/lang/InstantiationException
    //   516	530	851	java/lang/InstantiationException
    //   530	546	851	java/lang/InstantiationException
    //   556	572	851	java/lang/InstantiationException
    //   572	592	851	java/lang/InstantiationException
    //   696	702	851	java/lang/InstantiationException
    //   707	718	851	java/lang/InstantiationException
    //   725	771	851	java/lang/InstantiationException
    //   500	516	891	java/lang/IllegalAccessException
    //   516	530	891	java/lang/IllegalAccessException
    //   530	546	891	java/lang/IllegalAccessException
    //   556	572	891	java/lang/IllegalAccessException
    //   572	592	891	java/lang/IllegalAccessException
    //   696	702	891	java/lang/IllegalAccessException
    //   707	718	891	java/lang/IllegalAccessException
    //   725	771	891	java/lang/IllegalAccessException
    //   500	516	931	java/lang/ClassCastException
    //   516	530	931	java/lang/ClassCastException
    //   530	546	931	java/lang/ClassCastException
    //   556	572	931	java/lang/ClassCastException
    //   572	592	931	java/lang/ClassCastException
    //   696	702	931	java/lang/ClassCastException
    //   707	718	931	java/lang/ClassCastException
    //   725	771	931	java/lang/ClassCastException
  }
  
  private void M(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.To != null)
    {
      bool1 = bool2;
      if (!this.To.isFinished())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = this.To.cq();
        }
      }
    }
    bool2 = bool1;
    if (this.Tq != null)
    {
      bool2 = bool1;
      if (!this.Tq.isFinished())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | this.Tq.cq();
        }
      }
    }
    bool1 = bool2;
    if (this.Tp != null)
    {
      bool1 = bool2;
      if (!this.Tp.isFinished())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | this.Tp.cq();
        }
      }
    }
    bool2 = bool1;
    if (this.Tr != null)
    {
      bool2 = bool1;
      if (!this.Tr.isFinished())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | this.Tr.cq();
        }
      }
    }
    if (bool2) {
      z.F(this);
    }
  }
  
  private void X(int paramInt)
  {
    if (paramInt == this.xl) {}
    for (;;)
    {
      return;
      this.xl = paramInt;
      if (paramInt != 2) {
        fp();
      }
      if (this.SW != null) {
        this.SW.bi(paramInt);
      }
      if (this.TD != null) {
        this.TD.e(this, paramInt);
      }
      if (this.TE != null)
      {
        int i = this.TE.size() - 1;
        while (i >= 0)
        {
          ((k)this.TE.get(i)).e(this, paramInt);
          i -= 1;
        }
      }
    }
  }
  
  private void a(t paramt, RecyclerView.e.c paramc)
  {
    paramt.setFlags(0, 8192);
    if ((this.TC.UO) && (paramt.gq()) && (!paramt.isRemoved()) && (!paramt.ga()))
    {
      long l = g(paramt);
      this.SS.a(l, paramt);
    }
    this.SS.b(paramt, paramc);
  }
  
  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    int j = 0;
    int i3 = 0;
    int m = 0;
    int i1 = 0;
    int n = 0;
    int i = 0;
    int k = 0;
    int i2 = 0;
    fm();
    if (this.SV != null)
    {
      fn();
      fx();
      android.support.v4.os.e.beginSection("RV Scroll");
      j = i3;
      if (paramInt1 != 0)
      {
        i = this.SW.a(paramInt1, this.SO, this.TC);
        j = paramInt1 - i;
      }
      k = i2;
      m = i1;
      if (paramInt2 != 0)
      {
        k = this.SW.b(paramInt2, this.SO, this.TC);
        m = paramInt2 - k;
      }
      android.support.v4.os.e.endSection();
      fK();
      fy();
      R(false);
      n = i;
    }
    if (!this.SY.isEmpty()) {
      invalidate();
    }
    if (dispatchNestedScroll(n, k, j, m, this.Cs))
    {
      this.Tw -= this.Cs[0];
      this.Tx -= this.Cs[1];
      if (paramMotionEvent != null) {
        paramMotionEvent.offsetLocation(this.Cs[0], this.Cs[1]);
      }
      paramMotionEvent = this.TN;
      paramMotionEvent[0] += this.Cs[0];
      paramMotionEvent = this.TN;
      paramMotionEvent[1] += this.Cs[1];
    }
    while (z.C(this) == 2)
    {
      if ((n != 0) || (k != 0)) {
        O(n, k);
      }
      if (!awakenScrollBars()) {
        invalidate();
      }
      if ((n == 0) && (k == 0)) {
        break;
      }
      return true;
    }
    float f1;
    float f2;
    float f3;
    float f4;
    if (paramMotionEvent != null)
    {
      f1 = paramMotionEvent.getX();
      f2 = j;
      f3 = paramMotionEvent.getY();
      f4 = m;
      j = 0;
      if (f2 >= 0.0F) {
        break label460;
      }
      fq();
      i = j;
      if (this.To.h(-f2 / getWidth(), 1.0F - f3 / getHeight())) {
        i = 1;
      }
      label383:
      if (f4 >= 0.0F) {
        break label511;
      }
      fs();
      j = i;
      if (this.Tp.h(-f4 / getHeight(), f1 / getWidth())) {
        j = 1;
      }
    }
    for (;;)
    {
      if ((j != 0) || (f2 != 0.0F) || (f4 != 0.0F)) {
        z.F(this);
      }
      M(paramInt1, paramInt2);
      break;
      label460:
      i = j;
      if (f2 <= 0.0F) {
        break label383;
      }
      fr();
      i = j;
      if (!this.Tq.h(f2 / getWidth(), f3 / getHeight())) {
        break label383;
      }
      i = 1;
      break label383;
      label511:
      j = i;
      if (f4 > 0.0F)
      {
        ft();
        j = i;
        if (this.Tr.h(f4 / getHeight(), 1.0F - f1 / getWidth())) {
          j = 1;
        }
      }
    }
    return false;
  }
  
  static t aZ(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((LayoutParams)paramView.getLayoutParams()).Ui;
  }
  
  public static int ba(View paramView)
  {
    paramView = aZ(paramView);
    if (paramView != null) {
      return paramView.gd();
    }
    return -1;
  }
  
  public static int bb(View paramView)
  {
    paramView = aZ(paramView);
    if (paramView != null) {
      return paramView.gb();
    }
    return -1;
  }
  
  private void bd(View paramView)
  {
    aZ(paramView);
    if (this.Tl != null)
    {
      int i = this.Tl.size() - 1;
      while (i >= 0)
      {
        ((i)this.Tl.get(i)).bm(paramView);
        i -= 1;
      }
    }
  }
  
  private void c(int[] paramArrayOfInt)
  {
    int i2 = this.SR.getChildCount();
    if (i2 == 0)
    {
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return;
    }
    int i = Integer.MAX_VALUE;
    int k = Integer.MIN_VALUE;
    int n = 0;
    int m;
    int j;
    if (n < i2)
    {
      t localt = aZ(this.SR.getChildAt(n));
      m = i;
      if (localt.ga()) {
        break label122;
      }
      int i1 = localt.gb();
      j = i;
      if (i1 < i) {
        j = i1;
      }
      m = j;
      if (i1 <= k) {
        break label122;
      }
      i = i1;
    }
    for (;;)
    {
      n += 1;
      k = i;
      i = j;
      break;
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = k;
      return;
      label122:
      i = k;
      j = m;
    }
  }
  
  private void f(t paramt)
  {
    View localView = paramt.UU;
    if (localView.getParent() == this) {}
    for (int i = 1;; i = 0)
    {
      this.SO.p(aQ(localView));
      if (!paramt.gl()) {
        break;
      }
      this.SR.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i == 0)
    {
      this.SR.a(localView, -1, true);
      return;
    }
    paramt = this.SR;
    i = paramt.PC.indexOfChild(localView);
    if (i < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + localView);
    }
    paramt.PD.set(i);
    paramt.aN(localView);
  }
  
  private boolean fA()
  {
    return this.Tn > 0;
  }
  
  private void fB()
  {
    if ((!this.TI) && (this.Tb))
    {
      z.a(this, this.TO);
      this.TI = true;
    }
  }
  
  private boolean fC()
  {
    return (this.Ts != null) && (this.SW.eP());
  }
  
  private void fD()
  {
    boolean bool2 = true;
    if (this.Tm)
    {
      this.SQ.reset();
      fJ();
      this.SW.eL();
    }
    int i;
    label57:
    q localq;
    if (fC())
    {
      this.SQ.eq();
      if ((!this.TF) && (!this.TG)) {
        break label176;
      }
      i = 1;
      localq = this.TC;
      if ((!this.Td) || (this.Ts == null) || ((!this.Tm) && (i == 0) && (!this.SW.Ud)) || ((this.Tm) && (!this.SV.TT))) {
        break label181;
      }
      bool1 = true;
      label117:
      localq.UM = bool1;
      localq = this.TC;
      if ((!this.TC.UM) || (i == 0) || (this.Tm) || (!fC())) {
        break label186;
      }
    }
    label176:
    label181:
    label186:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localq.UN = bool1;
      return;
      this.SQ.et();
      break;
      i = 0;
      break label57;
      bool1 = false;
      break label117;
    }
  }
  
  private void fE()
  {
    if (this.SV == null) {}
    for (;;)
    {
      return;
      if (this.SW != null)
      {
        this.TC.UP = false;
        Object localObject1;
        long l;
        RecyclerView.e.c localc;
        t localt;
        boolean bool1;
        boolean bool2;
        Object localObject2;
        int k;
        if (this.TC.UF == 1)
        {
          fF();
          this.SW.z(this);
          fG();
          this.TC.bn(4);
          fn();
          fx();
          this.TC.UF = 1;
          if (!this.TC.UM) {
            break label639;
          }
          i = this.SR.getChildCount() - 1;
          if (i < 0) {
            break label628;
          }
          localObject1 = aZ(this.SR.getChildAt(i));
          if (!((t)localObject1).ga())
          {
            l = g((t)localObject1);
            localc = new RecyclerView.e.c().b((t)localObject1, 0);
            localt = (t)this.SS.Zt.get(l);
            if ((localt == null) || (localt.ga())) {
              break label614;
            }
            bool1 = this.SS.u(localt);
            bool2 = this.SS.u((t)localObject1);
            if ((bool1) && (localt == localObject1)) {
              break label614;
            }
            localObject2 = this.SS.c(localt, 4);
            this.SS.c((t)localObject1, localc);
            localc = this.SS.c((t)localObject1, 8);
            if (localObject2 != null) {
              break label519;
            }
            k = this.SR.getChildCount();
            j = 0;
          }
        }
        else
        {
          for (;;)
          {
            if (j >= k) {
              break label485;
            }
            localObject2 = aZ(this.SR.getChildAt(j));
            if ((localObject2 != localObject1) && (g((t)localObject2) == l))
            {
              if ((this.SV != null) && (this.SV.TT))
              {
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localObject2 + " \n View Holder 2:" + localObject1);
                localObject1 = this.SQ;
                if ((!((e)localObject1).NT.isEmpty()) && (!((e)localObject1).NS.isEmpty())) {}
                for (i = 1;; i = 0)
                {
                  if ((i == 0) && (this.SW.mWidth == getWidth()) && (this.SW.mHeight == getHeight())) {
                    break label430;
                  }
                  this.SW.z(this);
                  fG();
                  break;
                }
                label430:
                this.SW.z(this);
                break;
              }
              throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localObject2 + " \n View Holder 2:" + localObject1);
            }
            j += 1;
          }
          label485:
          new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ").append(localt).append(" cannot be found but it is necessary for ").append(localObject1);
        }
        for (;;)
        {
          i -= 1;
          break;
          label519:
          localt.U(false);
          if (bool1) {
            f(localt);
          }
          if (localt != localObject1)
          {
            if (bool2) {
              f((t)localObject1);
            }
            localt.UZ = ((t)localObject1);
            f(localt);
            this.SO.p(localt);
            ((t)localObject1).U(false);
            ((t)localObject1).Va = localt;
          }
          if (this.Ts.a(localt, (t)localObject1, (RecyclerView.e.c)localObject2, localc))
          {
            fB();
            continue;
            label614:
            this.SS.c((t)localObject1, localc);
          }
        }
        label628:
        this.SS.a(this.TQ);
        label639:
        this.SW.c(this.SO);
        this.TC.UI = this.TC.UH;
        this.Tm = false;
        this.TC.UM = false;
        this.TC.UN = false;
        this.SW.Ud = false;
        if (this.SO.Up != null) {
          this.SO.Up.clear();
        }
        fy();
        R(false);
        this.SS.clear();
        int i = this.TL[0];
        int j = this.TL[1];
        if (this.SR.getChildCount() == 0) {
          if ((i != 0) || (j != 0)) {
            i = 1;
          }
        }
        while (i != 0)
        {
          O(0, 0);
          return;
          i = 0;
          continue;
          c(this.TL);
          if ((this.TL[0] != i) || (this.TL[1] != j)) {
            i = 1;
          } else {
            i = 0;
          }
        }
      }
    }
  }
  
  private void fF()
  {
    this.TC.bn(1);
    this.TC.UP = false;
    fn();
    this.SS.clear();
    fx();
    fD();
    Object localObject1 = this.TC;
    if ((this.TC.UM) && (this.TG)) {}
    int j;
    int i;
    Object localObject2;
    for (boolean bool = true;; bool = false)
    {
      ((q)localObject1).UO = bool;
      this.TG = false;
      this.TF = false;
      this.TC.UL = this.TC.UN;
      this.TC.UH = this.SV.getItemCount();
      c(this.TL);
      if (!this.TC.UM) {
        break;
      }
      j = this.SR.getChildCount();
      i = 0;
      while (i < j)
      {
        localObject1 = aZ(this.SR.getChildAt(i));
        if ((!((t)localObject1).ga()) && ((!((t)localObject1).gj()) || (this.SV.TT)))
        {
          localObject2 = this.Ts.a(this.TC, (t)localObject1, e.j((t)localObject1), ((t)localObject1).gn());
          this.SS.b((t)localObject1, (RecyclerView.e.c)localObject2);
          if ((this.TC.UO) && (((t)localObject1).gq()) && (!((t)localObject1).isRemoved()) && (!((t)localObject1).ga()) && (!((t)localObject1).gj()))
          {
            long l = g((t)localObject1);
            this.SS.a(l, (t)localObject1);
          }
        }
        i += 1;
      }
    }
    if (this.TC.UN)
    {
      j = this.SR.eF();
      i = 0;
      while (i < j)
      {
        localObject1 = aZ(this.SR.aN(i));
        if ((!((t)localObject1).ga()) && (((t)localObject1).UV == -1)) {
          ((t)localObject1).UV = ((t)localObject1).jP;
        }
        i += 1;
      }
      bool = this.TC.UK;
      this.TC.UK = false;
      this.SW.c(this.SO, this.TC);
      this.TC.UK = bool;
      i = 0;
      if (i < this.SR.getChildCount())
      {
        t localt = aZ(this.SR.getChildAt(i));
        label469:
        RecyclerView.e.c localc;
        if (!localt.ga())
        {
          localObject1 = (as.a)this.SS.Zs.get(localt);
          if ((localObject1 == null) || ((((as.a)localObject1).flags & 0x4) == 0)) {
            break label543;
          }
          j = 1;
          if (j == 0)
          {
            int k = e.j(localt);
            bool = localt.bo(8192);
            j = k;
            if (!bool) {
              j = k | 0x1000;
            }
            localc = this.Ts.a(this.TC, localt, j, localt.gn());
            if (!bool) {
              break label548;
            }
            a(localt, localc);
          }
        }
        for (;;)
        {
          i += 1;
          break;
          label543:
          j = 0;
          break label469;
          label548:
          as localas = this.SS;
          localObject2 = (as.a)localas.Zs.get(localt);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = as.a.hc();
            localas.Zs.put(localt, localObject1);
          }
          ((as.a)localObject1).flags |= 0x2;
          ((as.a)localObject1).Zu = localc;
        }
      }
      fI();
    }
    for (;;)
    {
      fy();
      R(false);
      this.TC.UF = 2;
      return;
      fI();
    }
  }
  
  private void fG()
  {
    fn();
    fx();
    this.TC.bn(6);
    this.SQ.et();
    this.TC.UH = this.SV.getItemCount();
    this.TC.UJ = 0;
    this.TC.UL = false;
    this.SW.c(this.SO, this.TC);
    this.TC.UK = false;
    this.SP = null;
    q localq = this.TC;
    if ((this.TC.UM) && (this.Ts != null)) {}
    for (boolean bool = true;; bool = false)
    {
      localq.UM = bool;
      this.TC.UF = 4;
      fy();
      R(false);
      return;
    }
  }
  
  private void fI()
  {
    int j = 0;
    int k = this.SR.eF();
    int i = 0;
    while (i < k)
    {
      localObject = aZ(this.SR.aN(i));
      if (!((t)localObject).ga()) {
        ((t)localObject).fZ();
      }
      i += 1;
    }
    Object localObject = this.SO;
    k = ((m)localObject).Uq.size();
    i = 0;
    while (i < k)
    {
      ((t)((m)localObject).Uq.get(i)).fZ();
      i += 1;
    }
    k = ((m)localObject).Uo.size();
    i = 0;
    while (i < k)
    {
      ((t)((m)localObject).Uo.get(i)).fZ();
      i += 1;
    }
    if (((m)localObject).Up != null)
    {
      k = ((m)localObject).Up.size();
      i = j;
      while (i < k)
      {
        ((t)((m)localObject).Up.get(i)).fZ();
        i += 1;
      }
    }
  }
  
  private void fJ()
  {
    int j = this.SR.eF();
    int i = 0;
    while (i < j)
    {
      localObject = aZ(this.SR.aN(i));
      if ((localObject != null) && (!((t)localObject).ga())) {
        ((t)localObject).addFlags(6);
      }
      i += 1;
    }
    fH();
    Object localObject = this.SO;
    if ((((m)localObject).TR.SV != null) && (((m)localObject).TR.SV.TT))
    {
      j = ((m)localObject).Uq.size();
      i = 0;
    }
    while (i < j)
    {
      t localt = (t)((m)localObject).Uq.get(i);
      if (localt != null)
      {
        localt.addFlags(6);
        localt.R(null);
      }
      i += 1;
      continue;
      ((m)localObject).fU();
    }
  }
  
  private void fK()
  {
    int j = this.SR.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = this.SR.getChildAt(i);
      Object localObject = aQ(localView);
      if ((localObject != null) && (((t)localObject).Va != null))
      {
        localObject = ((t)localObject).Va.UU;
        int k = localView.getLeft();
        int m = localView.getTop();
        if ((k != ((View)localObject).getLeft()) || (m != ((View)localObject).getTop())) {
          ((View)localObject).layout(k, m, ((View)localObject).getWidth() + k, ((View)localObject).getHeight() + m);
        }
      }
      i += 1;
    }
  }
  
  private android.support.v4.view.q fL()
  {
    if (this.TM == null) {
      this.TM = new android.support.v4.view.q(this);
    }
    return this.TM;
  }
  
  private void fm()
  {
    int k = 0;
    if (!this.Td) {}
    label160:
    label167:
    do
    {
      do
      {
        return;
        if (this.Tm)
        {
          android.support.v4.os.e.beginSection("RV FullInvalidate");
          fE();
          android.support.v4.os.e.endSection();
          return;
        }
      } while (!this.SQ.es());
      if ((this.SQ.aH(4)) && (!this.SQ.aH(11)))
      {
        android.support.v4.os.e.beginSection("RV PartialInvalidate");
        fn();
        this.SQ.eq();
        int i;
        if (!this.Tf)
        {
          int m = this.SR.getChildCount();
          i = 0;
          int j = k;
          if (i < m)
          {
            t localt = aZ(this.SR.getChildAt(i));
            if ((localt == null) || (localt.ga()) || (!localt.gq())) {
              break label160;
            }
            j = 1;
          }
          if (j == 0) {
            break label167;
          }
          fE();
        }
        for (;;)
        {
          R(true);
          android.support.v4.os.e.endSection();
          return;
          i += 1;
          break;
          this.SQ.er();
        }
      }
    } while (!this.SQ.es());
    android.support.v4.os.e.beginSection("RV FullInvalidate");
    fE();
    android.support.v4.os.e.endSection();
  }
  
  private void fo()
  {
    X(0);
    fp();
  }
  
  private void fp()
  {
    this.TB.stop();
    if (this.SW != null) {
      this.SW.fT();
    }
  }
  
  private void fu()
  {
    this.Tr = null;
    this.Tp = null;
    this.Tq = null;
    this.To = null;
  }
  
  private void fv()
  {
    if (this.ez != null) {
      this.ez.clear();
    }
    stopNestedScroll();
    boolean bool2 = false;
    if (this.To != null) {
      bool2 = this.To.cq();
    }
    boolean bool1 = bool2;
    if (this.Tp != null) {
      bool1 = bool2 | this.Tp.cq();
    }
    bool2 = bool1;
    if (this.Tq != null) {
      bool2 = bool1 | this.Tq.cq();
    }
    bool1 = bool2;
    if (this.Tr != null) {
      bool1 = bool2 | this.Tr.cq();
    }
    if (bool1) {
      z.F(this);
    }
  }
  
  private void fw()
  {
    fv();
    X(0);
  }
  
  private void fx()
  {
    this.Tn += 1;
  }
  
  private void fy()
  {
    this.Tn -= 1;
    if (this.Tn <= 0)
    {
      this.Tn = 0;
      int i = this.Ti;
      this.Ti = 0;
      if ((i != 0) && (fz()))
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
        localAccessibilityEvent.setEventType(2048);
        android.support.v4.view.a.a.a(localAccessibilityEvent, i);
        sendAccessibilityEventUnchecked(localAccessibilityEvent);
      }
    }
  }
  
  private long g(t paramt)
  {
    if (this.SV.TT) {
      return paramt.UW;
    }
    return paramt.jP;
  }
  
  private int h(t paramt)
  {
    int i;
    if ((paramt.bo(524)) || (!paramt.isBound())) {
      i = -1;
    }
    e locale;
    int j;
    int n;
    int m;
    do
    {
      return i;
      locale = this.SQ;
      j = paramt.jP;
      n = locale.NS.size();
      m = 0;
      i = j;
    } while (m >= n);
    paramt = (e.b)locale.NS.get(m);
    switch (paramt.nJ)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      m += 1;
      j = i;
      break;
      i = j;
      if (paramt.NZ <= j)
      {
        i = j + paramt.Ob;
        continue;
        i = j;
        if (paramt.NZ <= j)
        {
          if (paramt.NZ + paramt.Ob > j) {
            return -1;
          }
          i = j - paramt.Ob;
          continue;
          if (paramt.NZ == j)
          {
            i = paramt.Ob;
          }
          else
          {
            int k = j;
            if (paramt.NZ < j) {
              k = j - 1;
            }
            i = k;
            if (paramt.Ob <= k) {
              i = k + 1;
            }
          }
        }
      }
    }
  }
  
  private void m(MotionEvent paramMotionEvent)
  {
    int i = o.e(paramMotionEvent);
    if (o.c(paramMotionEvent, i) == this.Tt) {
      if (i != 0) {
        break label75;
      }
    }
    label75:
    for (i = 1;; i = 0)
    {
      this.Tt = o.c(paramMotionEvent, i);
      int j = (int)(o.d(paramMotionEvent, i) + 0.5F);
      this.Tw = j;
      this.Tu = j;
      i = (int)(o.e(paramMotionEvent, i) + 0.5F);
      this.Tx = i;
      this.Tv = i;
      return;
    }
  }
  
  final void N(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(h.i(paramInt1, getPaddingLeft() + getPaddingRight(), z.T(this)), h.i(paramInt2, getPaddingTop() + getPaddingBottom(), z.U(this)));
  }
  
  final void O(int paramInt1, int paramInt2)
  {
    int i = getScrollX();
    int j = getScrollY();
    onScrollChanged(i, j, i, j);
    if (this.TD != null) {
      this.TD.c(this, paramInt1, paramInt2);
    }
    if (this.TE != null)
    {
      i = this.TE.size() - 1;
      while (i >= 0)
      {
        ((k)this.TE.get(i)).c(this, paramInt1, paramInt2);
        i -= 1;
      }
    }
  }
  
  final void R(boolean paramBoolean)
  {
    if (this.Te <= 0) {
      this.Te = 1;
    }
    if (!paramBoolean) {
      this.Tf = false;
    }
    if (this.Te == 1)
    {
      if ((paramBoolean) && (this.Tf) && (!this.Tg) && (this.SW != null) && (this.SV != null)) {
        fE();
      }
      if (!this.Tg) {
        this.Tf = false;
      }
    }
    this.Te -= 1;
  }
  
  public final void S(boolean paramBoolean)
  {
    if (paramBoolean != this.Tg)
    {
      r("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.Tg = false;
        if ((this.Tf) && (this.SW != null) && (this.SV != null)) {
          requestLayout();
        }
        this.Tf = false;
      }
    }
    else
    {
      return;
    }
    long l = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
    this.Tg = true;
    this.Th = true;
    fo();
  }
  
  public void a(a parama)
  {
    S(false);
    if (this.SV != null) {
      this.SV.b(this.SN);
    }
    if (this.Ts != null) {
      this.Ts.eK();
    }
    if (this.SW != null)
    {
      this.SW.d(this.SO);
      this.SW.c(this.SO);
    }
    this.SO.clear();
    this.SQ.reset();
    a locala = this.SV;
    this.SV = parama;
    if (parama != null) {
      parama.a(this.SN);
    }
    Object localObject = this.SO;
    parama = this.SV;
    ((m)localObject).clear();
    localObject = ((m)localObject).fV();
    if (locala != null) {
      ((l)localObject).Un -= 1;
    }
    if (((l)localObject).Un == 0) {
      ((l)localObject).Ul.clear();
    }
    if (parama != null) {
      ((l)localObject).Un += 1;
    }
    this.TC.UK = true;
    fJ();
    requestLayout();
  }
  
  public final void a(d paramd)
  {
    if (paramd == this.TK) {
      return;
    }
    this.TK = paramd;
    if (this.TK != null) {}
    for (boolean bool = true;; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }
  
  public final void a(e parame)
  {
    if (this.Ts != null)
    {
      this.Ts.eK();
      this.Ts.TU = null;
    }
    this.Ts = parame;
    if (this.Ts != null) {
      this.Ts.TU = this.TH;
    }
  }
  
  public final void a(g paramg)
  {
    if (this.SW != null) {
      this.SW.r("Cannot add item decoration during a scroll  or layout");
    }
    if (this.SY.isEmpty()) {
      setWillNotDraw(false);
    }
    this.SY.add(paramg);
    fH();
    requestLayout();
  }
  
  public void a(h paramh)
  {
    if (paramh == this.SW) {
      return;
    }
    fo();
    if (this.SW != null)
    {
      if (this.Tb) {
        this.SW.b(this, this.SO);
      }
      this.SW.y(null);
    }
    this.SO.clear();
    s locals = this.SR;
    for (s.a locala = locals.PD;; locala = locala.PG)
    {
      locala.PF = 0L;
      if (locala.PG == null) {
        break;
      }
    }
    int i = locals.PE.size() - 1;
    while (i >= 0)
    {
      locals.PC.aS((View)locals.PE.get(i));
      locals.PE.remove(i);
      i -= 1;
    }
    locals.PC.removeAllViews();
    this.SW = paramh;
    if (paramh != null)
    {
      if (paramh.Ub != null) {
        throw new IllegalArgumentException("LayoutManager " + paramh + " is already attached to a RecyclerView: " + paramh.Ub);
      }
      this.SW.y(this);
      if (this.Tb) {
        this.SW.gx = true;
      }
    }
    requestLayout();
  }
  
  public final void a(k paramk)
  {
    if (this.TE == null) {
      this.TE = new ArrayList();
    }
    this.TE.add(paramk);
  }
  
  public final t aQ(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return aZ(paramView);
  }
  
  public void aX(int paramInt)
  {
    if (this.Tg) {}
    do
    {
      return;
      fo();
    } while (this.SW == null);
    this.SW.aX(paramInt);
    awakenScrollBars();
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final t bb(int paramInt)
  {
    if (this.Tm) {}
    for (;;)
    {
      return null;
      int j = this.SR.eF();
      int i = 0;
      while (i < j)
      {
        t localt = aZ(this.SR.aN(i));
        if ((localt != null) && (!localt.isRemoved()) && (h(localt) == paramInt)) {
          return localt;
        }
        i += 1;
      }
    }
  }
  
  final Rect bc(View paramView)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.Uj) {
      return localLayoutParams.QD;
    }
    Rect localRect = localLayoutParams.QD;
    localRect.set(0, 0, 0, 0);
    int j = this.SY.size();
    int i = 0;
    while (i < j)
    {
      this.dF.set(0, 0, 0, 0);
      ((g)this.SY.get(i)).a(this.dF, paramView, this);
      localRect.left += this.dF.left;
      localRect.top += this.dF.top;
      localRect.right += this.dF.right;
      localRect.bottom += this.dF.bottom;
      i += 1;
    }
    localLayoutParams.Uj = false;
    return localRect;
  }
  
  final void c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = this.SR.eF();
    int i = 0;
    if (i < j)
    {
      localObject = aZ(this.SR.aN(i));
      if ((localObject != null) && (!((t)localObject).ga()))
      {
        if (((t)localObject).jP < paramInt1 + paramInt2) {
          break label82;
        }
        ((t)localObject).h(-paramInt2, paramBoolean);
        this.TC.UK = true;
      }
      for (;;)
      {
        i += 1;
        break;
        label82:
        if (((t)localObject).jP >= paramInt1)
        {
          int k = -paramInt2;
          ((t)localObject).addFlags(8);
          ((t)localObject).h(k, paramBoolean);
          ((t)localObject).jP = (paramInt1 - 1);
          this.TC.UK = true;
        }
      }
    }
    Object localObject = this.SO;
    i = ((m)localObject).Uq.size() - 1;
    if (i >= 0)
    {
      t localt = (t)((m)localObject).Uq.get(i);
      if (localt != null)
      {
        if (localt.jP < paramInt1 + paramInt2) {
          break label200;
        }
        localt.h(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i -= 1;
        break;
        label200:
        if (localt.jP >= paramInt1)
        {
          localt.addFlags(8);
          ((m)localObject).bl(i);
        }
      }
    }
    requestLayout();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (this.SW.a((LayoutParams)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.SW == null) {}
    while (!this.SW.eQ()) {
      return 0;
    }
    return this.SW.d(this.TC);
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.SW == null) {}
    while (!this.SW.eQ()) {
      return 0;
    }
    return this.SW.b(this.TC);
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.SW == null) {}
    while (!this.SW.eQ()) {
      return 0;
    }
    return this.SW.f(this.TC);
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.SW == null) {}
    while (!this.SW.eR()) {
      return 0;
    }
    return this.SW.e(this.TC);
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.SW == null) {}
    while (!this.SW.eR()) {
      return 0;
    }
    return this.SW.c(this.TC);
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.SW == null) {}
    while (!this.SW.eR()) {
      return 0;
    }
    return this.SW.g(this.TC);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return fL().dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return fL().dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return fL().dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return fL().dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int k = 1;
    int m = 0;
    super.draw(paramCanvas);
    int j = this.SY.size();
    int i = 0;
    while (i < j)
    {
      ((g)this.SY.get(i)).b(paramCanvas, this);
      i += 1;
    }
    int n;
    if ((this.To != null) && (!this.To.isFinished()))
    {
      n = paramCanvas.save();
      if (this.ST)
      {
        i = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i + -getHeight(), 0.0F);
        if ((this.To == null) || (!this.To.draw(paramCanvas))) {
          break label452;
        }
        j = 1;
        label124:
        paramCanvas.restoreToCount(n);
      }
    }
    for (;;)
    {
      i = j;
      if (this.Tp != null)
      {
        i = j;
        if (!this.Tp.isFinished())
        {
          n = paramCanvas.save();
          if (this.ST) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((this.Tp == null) || (!this.Tp.draw(paramCanvas))) {
            break label457;
          }
          i = 1;
          label198:
          i = j | i;
          paramCanvas.restoreToCount(n);
        }
      }
      j = i;
      if (this.Tq != null)
      {
        j = i;
        if (!this.Tq.isFinished())
        {
          n = paramCanvas.save();
          int i1 = getWidth();
          if (!this.ST) {
            break label462;
          }
          j = getPaddingTop();
          label253:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-j, -i1);
          if ((this.Tq == null) || (!this.Tq.draw(paramCanvas))) {
            break label467;
          }
          j = 1;
          label291:
          j = i | j;
          paramCanvas.restoreToCount(n);
        }
      }
      i = j;
      if (this.Tr != null)
      {
        i = j;
        if (!this.Tr.isFinished())
        {
          n = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.ST) {
            break label472;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label368:
          i = m;
          if (this.Tr != null)
          {
            i = m;
            if (this.Tr.draw(paramCanvas)) {
              i = 1;
            }
          }
          i = j | i;
          paramCanvas.restoreToCount(n);
        }
      }
      if ((i == 0) && (this.Ts != null) && (this.SY.size() > 0) && (this.Ts.isRunning())) {
        i = k;
      }
      for (;;)
      {
        if (i != 0) {
          z.F(this);
        }
        return;
        i = 0;
        break;
        label452:
        j = 0;
        break label124;
        label457:
        i = 0;
        break label198;
        label462:
        j = 0;
        break label253;
        label467:
        j = 0;
        break label291;
        label472:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label368;
      }
      j = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void fH()
  {
    int j = 0;
    int k = this.SR.eF();
    int i = 0;
    while (i < k)
    {
      ((LayoutParams)this.SR.aN(i).getLayoutParams()).Uj = true;
      i += 1;
    }
    m localm = this.SO;
    k = localm.Uq.size();
    i = j;
    while (i < k)
    {
      LayoutParams localLayoutParams = (LayoutParams)((t)localm.Uq.get(i)).UU.getLayoutParams();
      if (localLayoutParams != null) {
        localLayoutParams.Uj = true;
      }
      i += 1;
    }
  }
  
  public a fl()
  {
    return this.SV;
  }
  
  final void fn()
  {
    this.Te += 1;
    if ((this.Te == 1) && (!this.Tg)) {
      this.Tf = false;
    }
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    View localView2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
    View localView1 = localView2;
    if (localView2 == null)
    {
      localView1 = localView2;
      if (this.SV != null)
      {
        localView1 = localView2;
        if (this.SW != null)
        {
          localView1 = localView2;
          if (!fA())
          {
            localView1 = localView2;
            if (!this.Tg)
            {
              fn();
              localView1 = this.SW.a(paramView, paramInt, this.SO, this.TC);
              R(false);
            }
          }
        }
      }
    }
    if (localView1 != null) {
      return localView1;
    }
    return super.focusSearch(paramView, paramInt);
  }
  
  final void fq()
  {
    if (this.To != null) {
      return;
    }
    this.To = new i(getContext());
    if (this.ST)
    {
      this.To.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.To.setSize(getMeasuredHeight(), getMeasuredWidth());
  }
  
  final void fr()
  {
    if (this.Tq != null) {
      return;
    }
    this.Tq = new i(getContext());
    if (this.ST)
    {
      this.Tq.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.Tq.setSize(getMeasuredHeight(), getMeasuredWidth());
  }
  
  final void fs()
  {
    if (this.Tp != null) {
      return;
    }
    this.Tp = new i(getContext());
    if (this.ST)
    {
      this.Tp.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.Tp.setSize(getMeasuredWidth(), getMeasuredHeight());
  }
  
  final void ft()
  {
    if (this.Tr != null) {
      return;
    }
    this.Tr = new i(getContext());
    if (this.ST)
    {
      this.Tr.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.Tr.setSize(getMeasuredWidth(), getMeasuredHeight());
  }
  
  final boolean fz()
  {
    return (this.iz != null) && (this.iz.isEnabled());
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.SW == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.SW.eM();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.SW == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.SW.a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.SW == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.SW.e(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    if (this.SW != null) {
      return -1;
    }
    return super.getBaseline();
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.TK == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return this.TK.X(paramInt1, paramInt2);
  }
  
  public boolean hasNestedScrollingParent()
  {
    return fL().hasNestedScrollingParent();
  }
  
  public boolean isAttachedToWindow()
  {
    return this.Tb;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return fL().wA;
  }
  
  public final View j(float paramFloat1, float paramFloat2)
  {
    int i = this.SR.getChildCount() - 1;
    while (i >= 0)
    {
      View localView = this.SR.getChildAt(i);
      float f1 = z.R(localView);
      float f2 = z.S(localView);
      if ((paramFloat1 >= localView.getLeft() + f1) && (paramFloat1 <= f1 + localView.getRight()) && (paramFloat2 >= localView.getTop() + f2) && (paramFloat2 <= localView.getBottom() + f2)) {
        return localView;
      }
      i -= 1;
    }
    return null;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.Tn = 0;
    this.Tb = true;
    this.Td = false;
    if (this.SW != null) {
      this.SW.gx = true;
    }
    this.TI = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.Ts != null) {
      this.Ts.eK();
    }
    this.Td = false;
    fo();
    this.Tb = false;
    if (this.SW != null) {
      this.SW.b(this, this.SO);
    }
    removeCallbacks(this.TO);
    as.a.hd();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = this.SY.size();
    int i = 0;
    while (i < j)
    {
      ((g)this.SY.get(i)).a(paramCanvas, this);
      i += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    float f3 = 0.0F;
    if (this.SW == null) {}
    label171:
    label174:
    for (;;)
    {
      return false;
      if ((!this.Tg) && ((o.g(paramMotionEvent) & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.SW.eR())
        {
          f1 = -o.f(paramMotionEvent, 9);
          if (!this.SW.eQ()) {
            break label171;
          }
        }
        for (float f2 = o.f(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label174;
          }
          if (this.TA == Float.MIN_VALUE)
          {
            TypedValue localTypedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
              this.TA = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
            }
          }
          else
          {
            f3 = this.TA;
          }
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int k = -1;
    boolean bool1 = true;
    if (this.Tg)
    {
      bool1 = false;
      return bool1;
    }
    int j = paramMotionEvent.getAction();
    if ((j == 3) || (j == 0)) {
      this.Ta = null;
    }
    int m = this.SZ.size();
    int i = 0;
    if (i < m)
    {
      j localj = (j)this.SZ.get(i);
      if ((localj.n(paramMotionEvent)) && (j != 3)) {
        this.Ta = localj;
      }
    }
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        break label114;
      }
      fw();
      return true;
      i += 1;
      break;
    }
    label114:
    if (this.SW == null) {
      return false;
    }
    boolean bool2 = this.SW.eQ();
    boolean bool3 = this.SW.eR();
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    this.ez.addMovement(paramMotionEvent);
    j = o.d(paramMotionEvent);
    i = o.e(paramMotionEvent);
    switch (j)
    {
    case 4: 
    default: 
      if (this.xl != 1) {
        return false;
      }
      break;
    case 0: 
      label216:
      if (this.Th) {
        this.Th = false;
      }
      this.Tt = o.c(paramMotionEvent, 0);
      i = (int)(paramMotionEvent.getX() + 0.5F);
      this.Tw = i;
      this.Tu = i;
      i = (int)(paramMotionEvent.getY() + 0.5F);
      this.Tx = i;
      this.Tv = i;
      if (this.xl == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        X(1);
      }
      paramMotionEvent = this.TN;
      this.TN[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool2) {}
      break;
    }
    for (i = 1;; i = 0)
    {
      j = i;
      if (bool3) {
        j = i | 0x2;
      }
      startNestedScroll(j);
      break label216;
      this.Tt = o.c(paramMotionEvent, i);
      j = (int)(o.d(paramMotionEvent, i) + 0.5F);
      this.Tw = j;
      this.Tu = j;
      i = (int)(o.e(paramMotionEvent, i) + 0.5F);
      this.Tx = i;
      this.Tv = i;
      break label216;
      j = o.b(paramMotionEvent, this.Tt);
      if (j < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.Tt).append(" not found. Did any MotionEvents get skipped?");
        return false;
      }
      i = (int)(o.d(paramMotionEvent, j) + 0.5F);
      j = (int)(o.e(paramMotionEvent, j) + 0.5F);
      if (this.xl == 1) {
        break label216;
      }
      i -= this.Tu;
      m = j - this.Tv;
      int n;
      if ((bool2) && (Math.abs(i) > this.hQ))
      {
        j = this.Tu;
        n = this.hQ;
        if (i < 0)
        {
          i = -1;
          label524:
          this.Tw = (i * n + j);
        }
      }
      for (i = 1;; i = 0)
      {
        j = i;
        if (bool3)
        {
          j = i;
          if (Math.abs(m) > this.hQ)
          {
            j = this.Tv;
            n = this.hQ;
            if (m >= 0) {
              break label605;
            }
          }
        }
        label605:
        for (i = k;; i = 1)
        {
          this.Tx = (j + i * n);
          j = 1;
          if (j == 0) {
            break;
          }
          X(1);
          break;
          i = 1;
          break label524;
        }
        m(paramMotionEvent);
        break label216;
        this.ez.clear();
        stopNestedScroll();
        break label216;
        fw();
        break label216;
        break;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.support.v4.os.e.beginSection("RV OnLayout");
    fE();
    android.support.v4.os.e.endSection();
    this.Td = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    if (this.SW == null) {
      N(paramInt1, paramInt2);
    }
    do
    {
      int i;
      do
      {
        return;
        if (!this.SW.Ue) {
          break;
        }
        int k = View.MeasureSpec.getMode(paramInt1);
        int m = View.MeasureSpec.getMode(paramInt2);
        i = j;
        if (k == 1073741824)
        {
          i = j;
          if (m == 1073741824) {
            i = 1;
          }
        }
        this.SW.aa(paramInt1, paramInt2);
      } while ((i != 0) || (this.SV == null));
      if (this.TC.UF == 1) {
        fF();
      }
      this.SW.Y(paramInt1, paramInt2);
      this.TC.UP = true;
      fG();
      this.SW.Z(paramInt1, paramInt2);
    } while (!this.SW.eW());
    this.SW.Y(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    this.TC.UP = true;
    fG();
    this.SW.Z(paramInt1, paramInt2);
    return;
    if (this.Tc)
    {
      this.SW.aa(paramInt1, paramInt2);
      return;
    }
    if (this.Tj)
    {
      fn();
      fD();
      if (this.TC.UN)
      {
        this.TC.UL = true;
        this.Tj = false;
        R(false);
      }
    }
    else
    {
      if (this.SV == null) {
        break label313;
      }
    }
    label313:
    for (this.TC.UH = this.SV.getItemCount();; this.TC.UH = 0)
    {
      fn();
      this.SW.aa(paramInt1, paramInt2);
      R(false);
      this.TC.UL = false;
      return;
      this.SQ.et();
      this.TC.UL = false;
      break;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      this.SP = ((SavedState)paramParcelable);
      super.onRestoreInstanceState(this.SP.getSuperState());
    } while ((this.SW == null) || (this.SP.Uv == null));
    this.SW.onRestoreInstanceState(this.SP.Uv);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if (this.SP != null)
    {
      SavedState.a(localSavedState, this.SP);
      return localSavedState;
    }
    if (this.SW != null)
    {
      localSavedState.Uv = this.SW.onSaveInstanceState();
      return localSavedState;
    }
    localSavedState.Uv = null;
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      fu();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i2 = 0;
    if ((this.Tg) || (this.Th)) {}
    label144:
    label153:
    label159:
    do
    {
      return false;
      i = paramMotionEvent.getAction();
      if (this.Ta != null)
      {
        if (i == 0) {
          this.Ta = null;
        }
      }
      else
      {
        if (i == 0) {
          break label153;
        }
        j = this.SZ.size();
        i = 0;
        if (i >= j) {
          break label153;
        }
        localObject = (j)this.SZ.get(i);
        if (!((j)localObject).n(paramMotionEvent)) {
          break label144;
        }
        this.Ta = ((j)localObject);
        i = 1;
      }
      for (;;)
      {
        if (i == 0) {
          break label159;
        }
        fw();
        return true;
        this.Ta.o(paramMotionEvent);
        if ((i == 3) || (i == 1)) {
          this.Ta = null;
        }
        i = 1;
        continue;
        i += 1;
        break;
        i = 0;
      }
    } while (this.SW == null);
    boolean bool1 = this.SW.eQ();
    boolean bool2 = this.SW.eR();
    if (this.ez == null) {
      this.ez = VelocityTracker.obtain();
    }
    Object localObject = MotionEvent.obtain(paramMotionEvent);
    int k = o.d(paramMotionEvent);
    int j = o.e(paramMotionEvent);
    if (k == 0)
    {
      int[] arrayOfInt = this.TN;
      this.TN[1] = 0;
      arrayOfInt[0] = 0;
    }
    ((MotionEvent)localObject).offsetLocation(this.TN[0], this.TN[1]);
    int i = i2;
    switch (k)
    {
    default: 
      i = i2;
    case 4: 
      if (i == 0) {
        this.ez.addMovement((MotionEvent)localObject);
      }
      ((MotionEvent)localObject).recycle();
      return true;
    case 0: 
      this.Tt = o.c(paramMotionEvent, 0);
      i = (int)(paramMotionEvent.getX() + 0.5F);
      this.Tw = i;
      this.Tu = i;
      i = (int)(paramMotionEvent.getY() + 0.5F);
      this.Tx = i;
      this.Tv = i;
      if (!bool1) {
        break;
      }
    }
    for (i = 1;; i = 0)
    {
      j = i;
      if (bool2) {
        j = i | 0x2;
      }
      startNestedScroll(j);
      i = i2;
      break;
      this.Tt = o.c(paramMotionEvent, j);
      i = (int)(o.d(paramMotionEvent, j) + 0.5F);
      this.Tw = i;
      this.Tu = i;
      i = (int)(o.e(paramMotionEvent, j) + 0.5F);
      this.Tx = i;
      this.Tv = i;
      i = i2;
      break;
      i = o.b(paramMotionEvent, this.Tt);
      if (i < 0)
      {
        new StringBuilder("Error processing scroll; pointer index for id ").append(this.Tt).append(" not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i3 = (int)(o.d(paramMotionEvent, i) + 0.5F);
      int i4 = (int)(o.e(paramMotionEvent, i) + 0.5F);
      int m = this.Tw - i3;
      k = this.Tx - i4;
      i = k;
      j = m;
      if (dispatchNestedPreScroll(m, k, this.Ct, this.Cs))
      {
        j = m - this.Ct[0];
        i = k - this.Ct[1];
        ((MotionEvent)localObject).offsetLocation(this.Cs[0], this.Cs[1]);
        paramMotionEvent = this.TN;
        paramMotionEvent[0] += this.Cs[0];
        paramMotionEvent = this.TN;
        paramMotionEvent[1] += this.Cs[1];
      }
      k = i;
      m = j;
      if (this.xl != 1)
      {
        if ((!bool1) || (Math.abs(j) <= this.hQ)) {
          break label1295;
        }
        if (j <= 0) {
          break label889;
        }
        j -= this.hQ;
      }
      label728:
      label778:
      label850:
      label889:
      label901:
      label919:
      label979:
      label997:
      label1129:
      label1264:
      label1275:
      label1292:
      label1295:
      for (k = 1;; k = 0)
      {
        int n = i;
        int i1 = k;
        if (bool2)
        {
          n = i;
          i1 = k;
          if (Math.abs(i) > this.hQ)
          {
            if (i <= 0) {
              break label901;
            }
            n = i - this.hQ;
            i1 = 1;
          }
        }
        k = n;
        m = j;
        if (i1 != 0)
        {
          X(1);
          m = j;
          k = n;
        }
        i = i2;
        if (this.xl != 1) {
          break;
        }
        this.Tw = (i3 - this.Cs[0]);
        this.Tx = (i4 - this.Cs[1]);
        if (bool1) {
          if (!bool2) {
            break label919;
          }
        }
        for (;;)
        {
          i = i2;
          if (!a(m, k, (MotionEvent)localObject)) {
            break;
          }
          getParent().requestDisallowInterceptTouchEvent(true);
          i = i2;
          break;
          j += this.hQ;
          break label728;
          n = i + this.hQ;
          break label778;
          m = 0;
          break label850;
          k = 0;
        }
        m(paramMotionEvent);
        i = i2;
        break;
        this.ez.addMovement((MotionEvent)localObject);
        this.ez.computeCurrentVelocity(1000, this.Tz);
        float f1;
        float f2;
        if (bool1)
        {
          f1 = -y.a(this.ez, this.Tt);
          if (!bool2) {
            break label1264;
          }
          f2 = -y.b(this.ez, this.Tt);
          if ((f1 != 0.0F) || (f2 != 0.0F))
          {
            k = (int)f1;
            j = (int)f2;
            if ((this.SW == null) || (this.Tg)) {
              break label1275;
            }
            bool1 = this.SW.eQ();
            bool2 = this.SW.eR();
            if (bool1)
            {
              i = k;
              if (Math.abs(k) >= this.Ty) {}
            }
            else
            {
              i = 0;
            }
            if ((bool2) && (Math.abs(j) >= this.Ty)) {
              break label1292;
            }
            j = 0;
          }
        }
        for (;;)
        {
          if (((i != 0) || (j != 0)) && (!dispatchNestedPreFling(i, j))) {
            if ((bool1) || (bool2))
            {
              bool1 = true;
              dispatchNestedFling(i, j, bool1);
              if (!bool1) {
                break label1275;
              }
              i = Math.max(-this.Tz, Math.min(i, this.Tz));
              j = Math.max(-this.Tz, Math.min(j, this.Tz));
              paramMotionEvent = this.TB;
              c(paramMotionEvent.TR, 2);
              paramMotionEvent.UR = 0;
              paramMotionEvent.UQ = 0;
              paramMotionEvent.hN.a(0, i, j, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
              paramMotionEvent.fY();
            }
          }
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              X(0);
            }
            fv();
            i = 1;
            break;
            f1 = 0.0F;
            break label979;
            f2 = 0.0F;
            break label997;
            bool1 = false;
            break label1129;
          }
          fw();
          i = i2;
          break;
        }
      }
    }
  }
  
  final void r(String paramString)
  {
    if (fA())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    t localt = aZ(paramView);
    if (localt != null)
    {
      if (!localt.gl()) {
        break label32;
      }
      localt.gi();
    }
    label32:
    while (localt.ga())
    {
      bd(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localt);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    int i;
    Object localObject;
    if ((this.SW.fS()) || (fA()))
    {
      i = 1;
      if ((i == 0) && (paramView2 != null))
      {
        this.dF.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
        localObject = paramView2.getLayoutParams();
        if ((localObject instanceof LayoutParams))
        {
          localObject = (LayoutParams)localObject;
          if (!((LayoutParams)localObject).Uj)
          {
            localObject = ((LayoutParams)localObject).QD;
            Rect localRect = this.dF;
            localRect.left -= ((Rect)localObject).left;
            localRect = this.dF;
            localRect.right += ((Rect)localObject).right;
            localRect = this.dF;
            localRect.top -= ((Rect)localObject).top;
            localRect = this.dF;
            i = localRect.bottom;
            localRect.bottom = (((Rect)localObject).bottom + i);
          }
        }
        offsetDescendantRectToMyCoords(paramView2, this.dF);
        offsetRectIntoDescendantCoords(paramView1, this.dF);
        localObject = this.dF;
        if (this.Td) {
          break label226;
        }
      }
    }
    label226:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
      i = 0;
      break;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    h localh = this.SW;
    int i2 = localh.getPaddingLeft();
    int m = localh.getPaddingTop();
    int i3 = localh.mWidth - localh.getPaddingRight();
    int i1 = localh.mHeight;
    int i6 = localh.getPaddingBottom();
    int i4 = paramView.getLeft() + paramRect.left - paramView.getScrollX();
    int n = paramView.getTop() + paramRect.top - paramView.getScrollY();
    int i5 = i4 + paramRect.width();
    int i7 = paramRect.height();
    int i = Math.min(0, i4 - i2);
    int j = Math.min(0, n - m);
    int k = Math.max(0, i5 - i3);
    i1 = Math.max(0, n + i7 - (i1 - i6));
    if (z.J(localh.Ub) == 1) {
      if (k != 0)
      {
        i = k;
        if (j == 0) {
          break label232;
        }
        label170:
        if ((i == 0) && (j == 0)) {
          break label258;
        }
        if (!paramBoolean) {
          break label247;
        }
        scrollBy(i, j);
      }
    }
    for (;;)
    {
      return true;
      i = Math.max(i, i5 - i3);
      break;
      if (i != 0) {
        break;
      }
      for (;;)
      {
        i = Math.min(i4 - i2, k);
      }
      label232:
      j = Math.min(n - m, i1);
      break label170;
      label247:
      smoothScrollBy(i, j);
    }
    label258:
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int j = this.SZ.size();
    int i = 0;
    while (i < j)
    {
      ((j)this.SZ.get(i)).T(paramBoolean);
      i += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((this.Te == 0) && (!this.Tg))
    {
      super.requestLayout();
      return;
    }
    this.Tf = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.SW == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      do
      {
        return;
      } while (this.Tg);
      bool1 = this.SW.eQ();
      bool2 = this.SW.eR();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label64;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label64:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2) {}
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = 0;
    int j = 0;
    if (fA()) {
      if (paramAccessibilityEvent == null) {
        break label52;
      }
    }
    label52:
    for (i = android.support.v4.view.a.a.b(paramAccessibilityEvent);; i = 0)
    {
      if (i == 0) {
        i = j;
      }
      for (;;)
      {
        this.Ti = (i | this.Ti);
        i = 1;
        if (i != 0) {
          return;
        }
        super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        return;
      }
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.ST) {
      fu();
    }
    this.ST = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.Td) {
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    fL().setNestedScrollingEnabled(paramBoolean);
  }
  
  public final void smoothScrollBy(int paramInt1, int paramInt2)
  {
    int i = 0;
    if (this.SW == null) {}
    for (;;)
    {
      return;
      if (!this.Tg)
      {
        if (!this.SW.eQ()) {
          paramInt1 = 0;
        }
        if (!this.SW.eR()) {
          paramInt2 = i;
        }
        while ((paramInt1 != 0) || (paramInt2 != 0))
        {
          this.TB.smoothScrollBy(paramInt1, paramInt2);
          return;
        }
      }
    }
  }
  
  public final void smoothScrollToPosition(int paramInt)
  {
    if (this.Tg) {}
    while (this.SW == null) {
      return;
    }
    this.SW.a(this, paramInt);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return fL().startNestedScroll(paramInt);
  }
  
  public void stopNestedScroll()
  {
    fL().stopNestedScroll();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    final Rect QD = new Rect();
    RecyclerView.t Ui;
    boolean Uj = true;
    boolean Uk = false;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    Parcelable Uv;
    
    SavedState(Parcel paramParcel)
    {
      super();
      this.Uv = paramParcel.readParcelable(RecyclerView.h.class.getClassLoader());
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeParcelable(this.Uv, 0);
    }
  }
  
  public static abstract class a<VH extends RecyclerView.t>
  {
    public final RecyclerView.b TS = new RecyclerView.b();
    public boolean TT = false;
    
    public final void P(int paramInt1, int paramInt2)
    {
      this.TS.P(paramInt1, paramInt2);
    }
    
    public final void Q(int paramInt1, int paramInt2)
    {
      this.TS.Q(paramInt1, paramInt2);
    }
    
    public final void R(int paramInt1, int paramInt2)
    {
      this.TS.R(paramInt1, paramInt2);
    }
    
    public final void S(int paramInt1, int paramInt2)
    {
      this.TS.S(paramInt1, paramInt2);
    }
    
    public abstract VH a(ViewGroup paramViewGroup, int paramInt);
    
    public final void a(RecyclerView.c paramc)
    {
      this.TS.registerObserver(paramc);
    }
    
    public void a(VH paramVH) {}
    
    public abstract void a(VH paramVH, int paramInt);
    
    public void a(VH paramVH, int paramInt, List<Object> paramList)
    {
      a(paramVH, paramInt);
    }
    
    public final void b(int paramInt1, int paramInt2, Object paramObject)
    {
      this.TS.b(paramInt1, paramInt2, paramObject);
    }
    
    public final void b(int paramInt, Object paramObject)
    {
      this.TS.b(paramInt, 1, paramObject);
    }
    
    public final void b(RecyclerView.c paramc)
    {
      this.TS.unregisterObserver(paramc);
    }
    
    public final void bc(int paramInt)
    {
      this.TS.P(paramInt, 1);
    }
    
    public final void bd(int paramInt)
    {
      this.TS.R(paramInt, 1);
    }
    
    public final void be(int paramInt)
    {
      this.TS.S(paramInt, 1);
    }
    
    public final VH d(ViewGroup paramViewGroup, int paramInt)
    {
      android.support.v4.os.e.beginSection("RV CreateView");
      paramViewGroup = a(paramViewGroup, paramInt);
      paramViewGroup.UX = paramInt;
      android.support.v4.os.e.endSection();
      return paramViewGroup;
    }
    
    public final void fO()
    {
      if (this.TS.fP()) {
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      }
      this.TT = true;
    }
    
    public abstract int getItemCount();
    
    public long getItemId(int paramInt)
    {
      return -1L;
    }
    
    public int getItemViewType(int paramInt)
    {
      return 0;
    }
  }
  
  public static final class b
    extends Observable<RecyclerView.c>
  {
    public final void P(int paramInt1, int paramInt2)
    {
      b(paramInt1, paramInt2, null);
    }
    
    public final void Q(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).W(paramInt1, paramInt2);
        i -= 1;
      }
    }
    
    public final void R(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).U(paramInt1, paramInt2);
        i -= 1;
      }
    }
    
    public final void S(int paramInt1, int paramInt2)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).V(paramInt1, paramInt2);
        i -= 1;
      }
    }
    
    public final void b(int paramInt1, int paramInt2, Object paramObject)
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).c(paramInt1, paramInt2, paramObject);
        i -= 1;
      }
    }
    
    public final boolean fP()
    {
      return !this.mObservers.isEmpty();
    }
    
    public final void notifyChanged()
    {
      int i = this.mObservers.size() - 1;
      while (i >= 0)
      {
        ((RecyclerView.c)this.mObservers.get(i)).onChanged();
        i -= 1;
      }
    }
  }
  
  public static abstract class c
  {
    public void T(int paramInt1, int paramInt2) {}
    
    public void U(int paramInt1, int paramInt2) {}
    
    public void V(int paramInt1, int paramInt2) {}
    
    public void W(int paramInt1, int paramInt2) {}
    
    public void c(int paramInt1, int paramInt2, Object paramObject)
    {
      T(paramInt1, paramInt2);
    }
    
    public void onChanged() {}
  }
  
  public static abstract interface d
  {
    public abstract int X(int paramInt1, int paramInt2);
  }
  
  public static abstract class e
  {
    b TU = null;
    private ArrayList<a> TV = new ArrayList();
    public long TW = 120L;
    public long TX = 120L;
    public long TY = 250L;
    public long TZ = 250L;
    
    static int j(RecyclerView.t paramt)
    {
      int j = paramt.tu & 0xE;
      int i;
      if (paramt.gj()) {
        i = 4;
      }
      int k;
      int m;
      do
      {
        do
        {
          do
          {
            do
            {
              return i;
              i = j;
            } while ((j & 0x4) != 0);
            k = paramt.UV;
            m = paramt.gd();
            i = j;
          } while (k == -1);
          i = j;
        } while (m == -1);
        i = j;
      } while (k == m);
      return j | 0x800;
    }
    
    public c a(RecyclerView.q paramq, RecyclerView.t paramt, int paramInt, List<Object> paramList)
    {
      return new c().b(paramt, 0);
    }
    
    public final boolean a(a parama)
    {
      boolean bool = isRunning();
      if (parama != null)
      {
        if (!bool) {
          parama.fR();
        }
      }
      else {
        return bool;
      }
      this.TV.add(parama);
      return bool;
    }
    
    public abstract boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, c paramc1, c paramc2);
    
    public boolean a(RecyclerView.t paramt, List<Object> paramList)
    {
      return m(paramt);
    }
    
    public abstract void d(RecyclerView.t paramt);
    
    public abstract boolean d(RecyclerView.t paramt, c paramc1, c paramc2);
    
    public abstract boolean e(RecyclerView.t paramt, c paramc1, c paramc2);
    
    public abstract void eI();
    
    public abstract void eK();
    
    public abstract boolean f(RecyclerView.t paramt, c paramc1, c paramc2);
    
    public final void fQ()
    {
      int j = this.TV.size();
      int i = 0;
      while (i < j)
      {
        ((a)this.TV.get(i)).fR();
        i += 1;
      }
      this.TV.clear();
    }
    
    public abstract boolean isRunning();
    
    public final void k(RecyclerView.t paramt)
    {
      l(paramt);
      if (this.TU != null) {
        this.TU.l(paramt);
      }
    }
    
    public void l(RecyclerView.t paramt) {}
    
    public boolean m(RecyclerView.t paramt)
    {
      return true;
    }
    
    public static abstract interface a
    {
      public abstract void fR();
    }
    
    static abstract interface b
    {
      public abstract void l(RecyclerView.t paramt);
    }
    
    public static class c
    {
      public int Ua;
      public int bottom;
      public int left;
      public int right;
      public int top;
      
      public c b(RecyclerView.t paramt, int paramInt)
      {
        paramt = paramt.UU;
        this.left = paramt.getLeft();
        this.top = paramt.getTop();
        this.right = paramt.getRight();
        this.bottom = paramt.getBottom();
        return this;
      }
    }
  }
  
  private final class f
    implements RecyclerView.e.b
  {
    public f() {}
    
    public final void l(RecyclerView.t paramt)
    {
      int i = 1;
      paramt.U(true);
      if ((paramt.UZ != null) && (paramt.Va == null)) {
        paramt.UZ = null;
      }
      paramt.Va = null;
      if ((paramt.tu & 0x10) != 0) {}
      for (;;)
      {
        if ((i == 0) && (!RecyclerView.c(RecyclerView.this, paramt.UU)) && (paramt.gl())) {
          RecyclerView.this.removeDetachedView(paramt.UU, false);
        }
        return;
        i = 0;
      }
    }
  }
  
  public static abstract class g
  {
    public void a(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
    
    public void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView)
    {
      ((RecyclerView.LayoutParams)paramView.getLayoutParams()).Ui.gb();
      paramRect.set(0, 0, 0, 0);
    }
    
    public void b(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  }
  
  public static abstract class h
  {
    s SR;
    RecyclerView Ub;
    RecyclerView.p Uc;
    public boolean Ud = false;
    public boolean Ue = false;
    boolean Uf = true;
    int Ug;
    int Uh;
    boolean gx = false;
    int mHeight;
    int mWidth;
    
    public static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      int i = 0;
      int j = Math.max(0, paramInt1 - paramInt3);
      if (paramBoolean) {
        if (paramInt4 >= 0)
        {
          paramInt3 = 1073741824;
          paramInt1 = paramInt4;
        }
      }
      for (;;)
      {
        return View.MeasureSpec.makeMeasureSpec(paramInt1, paramInt3);
        if (paramInt4 == -1)
        {
          switch (paramInt2)
          {
          case 0: 
          default: 
            paramInt1 = 0;
            paramInt3 = i;
            break;
          case 1073741824: 
          case -2147483648: 
            paramInt1 = j;
            paramInt3 = paramInt2;
            break;
          }
        }
        else
        {
          if (paramInt4 == -2)
          {
            paramInt1 = 0;
            paramInt3 = i;
            continue;
            if (paramInt4 >= 0)
            {
              paramInt3 = 1073741824;
              paramInt1 = paramInt4;
              continue;
            }
            if (paramInt4 == -1)
            {
              paramInt1 = j;
              paramInt3 = paramInt2;
              continue;
            }
            if (paramInt4 == -2)
            {
              if (paramInt2 != Integer.MIN_VALUE)
              {
                paramInt1 = j;
                paramInt3 = i;
                if (paramInt2 != 1073741824) {
                  continue;
                }
              }
              paramInt3 = Integer.MIN_VALUE;
              paramInt1 = j;
              continue;
            }
          }
          paramInt1 = 0;
          paramInt3 = i;
        }
      }
    }
    
    public static int be(View paramView)
    {
      return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).Ui.gb();
    }
    
    private void bf(int paramInt)
    {
      getChildAt(paramInt);
      this.SR.detachViewFromParent(paramInt);
    }
    
    public static int bg(View paramView)
    {
      Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD;
      int i = paramView.getMeasuredWidth();
      int j = localRect.left;
      return localRect.right + (i + j);
    }
    
    public static int bh(View paramView)
    {
      Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD;
      int i = paramView.getMeasuredHeight();
      int j = localRect.top;
      return localRect.bottom + (i + j);
    }
    
    public static int bi(View paramView)
    {
      return paramView.getLeft() - ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD.left;
    }
    
    public static int bj(View paramView)
    {
      return paramView.getTop() - ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD.top;
    }
    
    public static int bk(View paramView)
    {
      int i = paramView.getRight();
      return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD.right + i;
    }
    
    public static int bl(View paramView)
    {
      int i = paramView.getBottom();
      return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD.bottom + i;
    }
    
    public static void g(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).QD;
      paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
    }
    
    public static int i(int paramInt1, int paramInt2, int paramInt3)
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      int i = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = i;
      switch (j)
      {
      default: 
        paramInt1 = Math.max(paramInt2, paramInt3);
      case 1073741824: 
        return paramInt1;
      }
      return Math.min(i, Math.max(paramInt2, paramInt3));
    }
    
    static boolean j(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {}
      do
      {
        do
        {
          return false;
          switch (i)
          {
          default: 
            return false;
          }
        } while (paramInt2 < paramInt1);
        return true;
        return true;
      } while (paramInt2 != paramInt1);
      return true;
    }
    
    private void removeViewAt(int paramInt)
    {
      if (getChildAt(paramInt) != null)
      {
        s locals = this.SR;
        paramInt = locals.aM(paramInt);
        View localView = locals.PC.getChildAt(paramInt);
        if (localView != null)
        {
          if (locals.PD.aO(paramInt)) {
            locals.aO(localView);
          }
          locals.PC.removeViewAt(paramInt);
        }
      }
    }
    
    public void A(int paramInt1, int paramInt2) {}
    
    public void B(int paramInt1, int paramInt2) {}
    
    final void Y(int paramInt1, int paramInt2)
    {
      this.mWidth = View.MeasureSpec.getSize(paramInt1);
      this.Ug = View.MeasureSpec.getMode(paramInt1);
      if ((this.Ug == 0) && (!RecyclerView.SL)) {
        this.mWidth = 0;
      }
      this.mHeight = View.MeasureSpec.getSize(paramInt2);
      this.Uh = View.MeasureSpec.getMode(paramInt2);
      if ((this.Uh == 0) && (!RecyclerView.SL)) {
        this.mHeight = 0;
      }
    }
    
    final void Z(int paramInt1, int paramInt2)
    {
      int j = Integer.MAX_VALUE;
      int i = Integer.MIN_VALUE;
      int i5 = getChildCount();
      if (i5 == 0)
      {
        this.Ub.N(paramInt1, paramInt2);
        return;
      }
      int n = 0;
      int k = Integer.MIN_VALUE;
      int m = Integer.MAX_VALUE;
      int i1;
      int i3;
      int i2;
      if (n < i5)
      {
        View localView = getChildAt(n);
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
        int i4 = bi(localView) - localLayoutParams.leftMargin;
        i1 = bk(localView);
        i3 = localLayoutParams.rightMargin + i1;
        i2 = bj(localView) - localLayoutParams.topMargin;
        i1 = bl(localView);
        i1 = localLayoutParams.bottomMargin + i1;
        if (i4 >= m) {
          break label215;
        }
        m = i4;
      }
      label215:
      for (;;)
      {
        if (i3 > k) {
          k = i3;
        }
        for (;;)
        {
          if (i2 < j) {
            j = i2;
          }
          for (;;)
          {
            if (i1 > i) {
              i = i1;
            }
            for (;;)
            {
              n += 1;
              break;
              RecyclerView.v(this.Ub).set(m, j, k, i);
              a(RecyclerView.v(this.Ub), paramInt1, paramInt2);
              return;
            }
          }
        }
      }
    }
    
    public int a(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
    {
      return 0;
    }
    
    public int a(RecyclerView.m paramm, RecyclerView.q paramq)
    {
      if ((this.Ub == null) || (RecyclerView.h(this.Ub) == null)) {}
      while (!eR()) {
        return 1;
      }
      return RecyclerView.h(this.Ub).getItemCount();
    }
    
    public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
    {
      return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
    }
    
    public View a(View paramView, int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
    {
      return null;
    }
    
    public final void a(int paramInt, RecyclerView.m paramm)
    {
      View localView = getChildAt(paramInt);
      removeViewAt(paramInt);
      paramm.bn(localView);
    }
    
    public void a(Rect paramRect, int paramInt1, int paramInt2)
    {
      int i = paramRect.width();
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = paramRect.height();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      setMeasuredDimension(i(paramInt1, i + j + k, z.T(this.Ub)), i(paramInt2, m + n + i1, z.U(this.Ub)));
    }
    
    public void a(RecyclerView.m paramm, RecyclerView.q paramq, View paramView, b paramb)
    {
      int i;
      if (eR())
      {
        i = be(paramView);
        if (!eQ()) {
          break label48;
        }
      }
      label48:
      for (int j = be(paramView);; j = 0)
      {
        paramb.k(b.l.a(i, 1, j, 1, false));
        return;
        i = 0;
        break;
      }
    }
    
    public final void a(RecyclerView.p paramp)
    {
      if ((this.Uc != null) && (paramp != this.Uc) && (this.Uc.mRunning)) {
        this.Uc.stop();
      }
      this.Uc = paramp;
      paramp = this.Uc;
      paramp.Ub = this.Ub;
      paramp.SH = this;
      if (paramp.Uw == -1) {
        throw new IllegalArgumentException("Invalid target position");
      }
      paramp.Ub.TC.Uw = paramp.Uw;
      paramp.mRunning = true;
      paramp.Ux = true;
      int i = paramp.Uw;
      paramp.Uy = paramp.Ub.SW.aV(i);
      RecyclerView.x(paramp.Ub).fY();
    }
    
    public void a(RecyclerView paramRecyclerView, int paramInt) {}
    
    public void a(RecyclerView paramRecyclerView, RecyclerView.m paramm) {}
    
    public final void a(View paramView, Rect paramRect)
    {
      if (this.Ub == null)
      {
        paramRect.set(0, 0, 0, 0);
        return;
      }
      paramRect.set(this.Ub.bc(paramView));
    }
    
    public final void a(View paramView, RecyclerView.m paramm)
    {
      s locals = this.SR;
      int i = locals.PC.indexOfChild(paramView);
      if (i >= 0)
      {
        if (locals.PD.aO(i)) {
          locals.aO(paramView);
        }
        locals.PC.removeViewAt(i);
      }
      paramm.bn(paramView);
    }
    
    public boolean a(RecyclerView.LayoutParams paramLayoutParams)
    {
      return paramLayoutParams != null;
    }
    
    final boolean a(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
    {
      return (paramView.isLayoutRequested()) || (!this.Uf) || (!j(paramView.getWidth(), paramInt1, paramLayoutParams.width)) || (!j(paramView.getHeight(), paramInt2, paramLayoutParams.height));
    }
    
    public View aV(int paramInt)
    {
      int j = getChildCount();
      int i = 0;
      while (i < j)
      {
        View localView = getChildAt(i);
        RecyclerView.t localt = RecyclerView.aZ(localView);
        if ((localt != null) && (localt.gb() == paramInt) && (!localt.ga()) && ((this.Ub.TC.UL) || (!localt.isRemoved()))) {
          return localView;
        }
        i += 1;
      }
      return null;
    }
    
    public void aX(int paramInt) {}
    
    public final void aa(int paramInt1, int paramInt2)
    {
      this.Ub.N(paramInt1, paramInt2);
    }
    
    public int b(int paramInt, RecyclerView.m paramm, RecyclerView.q paramq)
    {
      return 0;
    }
    
    public int b(RecyclerView.m paramm, RecyclerView.q paramq)
    {
      if ((this.Ub == null) || (RecyclerView.h(this.Ub) == null)) {}
      while (!eQ()) {
        return 1;
      }
      return RecyclerView.h(this.Ub).getItemCount();
    }
    
    public int b(RecyclerView.q paramq)
    {
      return 0;
    }
    
    public final void b(RecyclerView.m paramm)
    {
      int i = getChildCount() - 1;
      if (i >= 0)
      {
        View localView = getChildAt(i);
        RecyclerView.t localt = RecyclerView.aZ(localView);
        if (!localt.ga())
        {
          if ((!localt.gj()) || (localt.isRemoved()) || (RecyclerView.h(this.Ub).TT)) {
            break label78;
          }
          removeViewAt(i);
          paramm.n(localt);
        }
        for (;;)
        {
          i -= 1;
          break;
          label78:
          bf(i);
          paramm.bp(localView);
          this.Ub.SS.w(localt);
        }
      }
    }
    
    final void b(RecyclerView paramRecyclerView, RecyclerView.m paramm)
    {
      this.gx = false;
      a(paramRecyclerView, paramm);
    }
    
    final void b(View paramView, b paramb)
    {
      RecyclerView.t localt = RecyclerView.aZ(paramView);
      if ((localt != null) && (!localt.isRemoved()) && (!this.SR.aP(localt.UU))) {
        a(this.Ub.SO, this.Ub.TC, paramView, paramb);
      }
    }
    
    public final View bf(View paramView)
    {
      Object localObject;
      if (this.Ub == null) {
        localObject = null;
      }
      do
      {
        return (View)localObject;
        RecyclerView localRecyclerView = this.Ub;
        for (localObject = paramView.getParent(); (localObject != null) && (localObject != localRecyclerView) && ((localObject instanceof View)); localObject = paramView.getParent()) {
          paramView = (View)localObject;
        }
        if (localObject == localRecyclerView) {}
        while (paramView == null)
        {
          return null;
          paramView = null;
        }
        localObject = paramView;
      } while (!this.SR.aP(paramView));
      return null;
    }
    
    public void bg(int paramInt)
    {
      if (this.Ub != null)
      {
        RecyclerView localRecyclerView = this.Ub;
        int j = localRecyclerView.SR.getChildCount();
        int i = 0;
        while (i < j)
        {
          localRecyclerView.SR.getChildAt(i).offsetLeftAndRight(paramInt);
          i += 1;
        }
      }
    }
    
    public void bh(int paramInt)
    {
      if (this.Ub != null)
      {
        RecyclerView localRecyclerView = this.Ub;
        int j = localRecyclerView.SR.getChildCount();
        int i = 0;
        while (i < j)
        {
          localRecyclerView.SR.getChildAt(i).offsetTopAndBottom(paramInt);
          i += 1;
        }
      }
    }
    
    public void bi(int paramInt) {}
    
    public int c(RecyclerView.q paramq)
    {
      return 0;
    }
    
    final void c(RecyclerView.m paramm)
    {
      int j = paramm.Uo.size();
      int i = j - 1;
      while (i >= 0)
      {
        View localView = ((RecyclerView.t)paramm.Uo.get(i)).UU;
        RecyclerView.t localt = RecyclerView.aZ(localView);
        if (!localt.ga())
        {
          localt.U(false);
          if (localt.gl()) {
            this.Ub.removeDetachedView(localView, false);
          }
          if (this.Ub.Ts != null) {
            this.Ub.Ts.d(localt);
          }
          localt.U(true);
          paramm.bo(localView);
        }
        i -= 1;
      }
      paramm.Uo.clear();
      if (paramm.Up != null) {
        paramm.Up.clear();
      }
      if (j > 0) {
        this.Ub.invalidate();
      }
    }
    
    public void c(RecyclerView.m paramm, RecyclerView.q paramq) {}
    
    void c(View paramView, int paramInt, boolean paramBoolean)
    {
      RecyclerView.t localt1 = RecyclerView.aZ(paramView);
      RecyclerView.LayoutParams localLayoutParams1;
      if ((paramBoolean) || (localt1.isRemoved()))
      {
        this.Ub.SS.v(localt1);
        localLayoutParams1 = (RecyclerView.LayoutParams)paramView.getLayoutParams();
        if ((!localt1.gg()) && (!localt1.ge())) {
          break label128;
        }
        if (!localt1.ge()) {
          break label120;
        }
        localt1.gf();
        label68:
        this.SR.a(paramView, paramInt, paramView.getLayoutParams(), false);
      }
      for (;;)
      {
        if (localLayoutParams1.Uk)
        {
          localt1.UU.invalidate();
          localLayoutParams1.Uk = false;
        }
        return;
        this.Ub.SS.w(localt1);
        break;
        label120:
        localt1.gh();
        break label68;
        label128:
        Object localObject;
        if (paramView.getParent() == this.Ub)
        {
          int j = this.SR.indexOfChild(paramView);
          int i = paramInt;
          if (paramInt == -1) {
            i = this.SR.getChildCount();
          }
          if (j == -1) {
            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.Ub.indexOfChild(paramView));
          }
          if (j != i)
          {
            paramView = this.Ub.SW;
            localObject = paramView.getChildAt(j);
            if (localObject == null) {
              throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j);
            }
            paramView.bf(j);
            RecyclerView.LayoutParams localLayoutParams2 = (RecyclerView.LayoutParams)((View)localObject).getLayoutParams();
            RecyclerView.t localt2 = RecyclerView.aZ((View)localObject);
            if (localt2.isRemoved()) {
              paramView.Ub.SS.v(localt2);
            }
            for (;;)
            {
              paramView.SR.a((View)localObject, i, localLayoutParams2, localt2.isRemoved());
              break;
              paramView.Ub.SS.w(localt2);
            }
          }
        }
        else
        {
          this.SR.a(paramView, paramInt, false);
          localLayoutParams1.Uj = true;
          if ((this.Uc != null) && (this.Uc.mRunning))
          {
            localObject = this.Uc;
            if (RecyclerView.bb(paramView) == ((RecyclerView.p)localObject).Uw) {
              ((RecyclerView.p)localObject).Uy = paramView;
            }
          }
        }
      }
    }
    
    public int d(RecyclerView.q paramq)
    {
      return 0;
    }
    
    public final void d(RecyclerView.m paramm)
    {
      int i = getChildCount() - 1;
      while (i >= 0)
      {
        if (!RecyclerView.aZ(getChildAt(i)).ga()) {
          a(i, paramm);
        }
        i -= 1;
      }
    }
    
    public int e(RecyclerView.q paramq)
    {
      return 0;
    }
    
    public RecyclerView.LayoutParams e(ViewGroup.LayoutParams paramLayoutParams)
    {
      if ((paramLayoutParams instanceof RecyclerView.LayoutParams)) {
        return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
      }
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
      }
      return new RecyclerView.LayoutParams(paramLayoutParams);
    }
    
    public void eL() {}
    
    public abstract RecyclerView.LayoutParams eM();
    
    public boolean eP()
    {
      return false;
    }
    
    public boolean eQ()
    {
      return false;
    }
    
    public boolean eR()
    {
      return false;
    }
    
    boolean eW()
    {
      return false;
    }
    
    public int f(RecyclerView.q paramq)
    {
      return 0;
    }
    
    public final boolean fS()
    {
      return (this.Uc != null) && (this.Uc.mRunning);
    }
    
    final void fT()
    {
      if (this.Uc != null) {
        this.Uc.stop();
      }
    }
    
    public int g(RecyclerView.q paramq)
    {
      return 0;
    }
    
    public final View getChildAt(int paramInt)
    {
      if (this.SR != null) {
        return this.SR.getChildAt(paramInt);
      }
      return null;
    }
    
    public final int getChildCount()
    {
      if (this.SR != null) {
        return this.SR.getChildCount();
      }
      return 0;
    }
    
    public final int getPaddingBottom()
    {
      if (this.Ub != null) {
        return this.Ub.getPaddingBottom();
      }
      return 0;
    }
    
    public final int getPaddingLeft()
    {
      if (this.Ub != null) {
        return this.Ub.getPaddingLeft();
      }
      return 0;
    }
    
    public final int getPaddingRight()
    {
      if (this.Ub != null) {
        return this.Ub.getPaddingRight();
      }
      return 0;
    }
    
    public final int getPaddingTop()
    {
      if (this.Ub != null) {
        return this.Ub.getPaddingTop();
      }
      return 0;
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      boolean bool2 = true;
      Object localObject = this.Ub.SO;
      localObject = this.Ub.TC;
      paramAccessibilityEvent = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      if (this.Ub == null) {
        return;
      }
      boolean bool1 = bool2;
      if (!z.h(this.Ub, 1))
      {
        bool1 = bool2;
        if (!z.h(this.Ub, -1))
        {
          bool1 = bool2;
          if (!z.g(this.Ub, -1)) {
            if (!z.g(this.Ub, 1)) {
              break label115;
            }
          }
        }
      }
      label115:
      for (bool1 = bool2;; bool1 = false)
      {
        paramAccessibilityEvent.setScrollable(bool1);
        if (RecyclerView.h(this.Ub) == null) {
          break;
        }
        paramAccessibilityEvent.setItemCount(RecyclerView.h(this.Ub).getItemCount());
        return;
      }
    }
    
    public void onRestoreInstanceState(Parcelable paramParcelable) {}
    
    public Parcelable onSaveInstanceState()
    {
      return null;
    }
    
    public void r(String paramString)
    {
      if (this.Ub != null) {
        this.Ub.r(paramString);
      }
    }
    
    public final boolean removeCallbacks(Runnable paramRunnable)
    {
      if (this.Ub != null) {
        return this.Ub.removeCallbacks(paramRunnable);
      }
      return false;
    }
    
    public final void requestLayout()
    {
      if (this.Ub != null) {
        this.Ub.requestLayout();
      }
    }
    
    public final void setMeasuredDimension(int paramInt1, int paramInt2)
    {
      RecyclerView.b(this.Ub, paramInt1, paramInt2);
    }
    
    public void y(int paramInt1, int paramInt2) {}
    
    final void y(RecyclerView paramRecyclerView)
    {
      if (paramRecyclerView == null)
      {
        this.Ub = null;
        this.SR = null;
        this.mWidth = 0;
      }
      for (this.mHeight = 0;; this.mHeight = paramRecyclerView.getHeight())
      {
        this.Ug = 1073741824;
        this.Uh = 1073741824;
        return;
        this.Ub = paramRecyclerView;
        this.SR = paramRecyclerView.SR;
        this.mWidth = paramRecyclerView.getWidth();
      }
    }
    
    public void z(int paramInt1, int paramInt2) {}
    
    final void z(RecyclerView paramRecyclerView)
    {
      Y(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
    }
  }
  
  public static abstract interface i
  {
    public abstract void bm(View paramView);
  }
  
  public static abstract interface j
  {
    public abstract void T(boolean paramBoolean);
    
    public abstract boolean n(MotionEvent paramMotionEvent);
    
    public abstract void o(MotionEvent paramMotionEvent);
  }
  
  public static abstract class k
  {
    public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
    
    public void e(RecyclerView paramRecyclerView, int paramInt) {}
  }
  
  public static final class l
  {
    SparseArray<ArrayList<RecyclerView.t>> Ul = new SparseArray();
    SparseIntArray Um = new SparseIntArray();
    int Un = 0;
  }
  
  public final class m
  {
    final ArrayList<RecyclerView.t> Uo = new ArrayList();
    public ArrayList<RecyclerView.t> Up = null;
    final ArrayList<RecyclerView.t> Uq = new ArrayList();
    final List<RecyclerView.t> Ur = Collections.unmodifiableList(this.Uo);
    private int Us = 2;
    private RecyclerView.l Ut;
    private RecyclerView.r Uu;
    
    public m() {}
    
    private RecyclerView.t a(long paramLong, int paramInt, boolean paramBoolean)
    {
      int i = this.Uo.size() - 1;
      RecyclerView.t localt;
      while (i >= 0)
      {
        localt = (RecyclerView.t)this.Uo.get(i);
        if ((localt.UW == paramLong) && (!localt.gg()))
        {
          if (paramInt == localt.UX)
          {
            localt.addFlags(32);
            if ((localt.isRemoved()) && (!RecyclerView.this.TC.UL)) {
              localt.setFlags(2, 14);
            }
            return localt;
          }
          this.Uo.remove(i);
          RecyclerView.this.removeDetachedView(localt.UU, false);
          bo(localt.UU);
        }
        i -= 1;
      }
      i = this.Uq.size() - 1;
      while (i >= 0)
      {
        localt = (RecyclerView.t)this.Uq.get(i);
        if (localt.UW == paramLong)
        {
          if (paramInt == localt.UX)
          {
            this.Uq.remove(i);
            return localt;
          }
          bl(i);
        }
        i -= 1;
      }
      return null;
    }
    
    private RecyclerView.t bm(int paramInt)
    {
      int j = 0;
      int k;
      if (this.Up != null)
      {
        k = this.Up.size();
        if (k != 0) {}
      }
      else
      {
        return null;
      }
      int i = 0;
      RecyclerView.t localt;
      while (i < k)
      {
        localt = (RecyclerView.t)this.Up.get(i);
        if ((!localt.gg()) && (localt.gb() == paramInt))
        {
          localt.addFlags(32);
          return localt;
        }
        i += 1;
      }
      if (RecyclerView.h(RecyclerView.this).TT)
      {
        paramInt = RecyclerView.this.SQ.s(paramInt, 0);
        if ((paramInt > 0) && (paramInt < RecyclerView.h(RecyclerView.this).getItemCount()))
        {
          long l = RecyclerView.h(RecyclerView.this).getItemId(paramInt);
          paramInt = j;
          while (paramInt < k)
          {
            localt = (RecyclerView.t)this.Up.get(paramInt);
            if ((!localt.gg()) && (localt.UW == l))
            {
              localt.addFlags(32);
              return localt;
            }
            paramInt += 1;
          }
        }
      }
      return null;
    }
    
    private void c(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      int i = paramViewGroup.getChildCount() - 1;
      while (i >= 0)
      {
        View localView = paramViewGroup.getChildAt(i);
        if ((localView instanceof ViewGroup)) {
          c((ViewGroup)localView, true);
        }
        i -= 1;
      }
      if (!paramBoolean) {
        return;
      }
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
        return;
      }
      i = paramViewGroup.getVisibility();
      paramViewGroup.setVisibility(4);
      paramViewGroup.setVisibility(i);
    }
    
    private RecyclerView.t g(int paramInt, boolean paramBoolean)
    {
      int j = 0;
      int k = this.Uo.size();
      int i = 0;
      Object localObject1;
      while (i < k)
      {
        localObject1 = (RecyclerView.t)this.Uo.get(i);
        if ((!((RecyclerView.t)localObject1).gg()) && (((RecyclerView.t)localObject1).gb() == paramInt) && (!((RecyclerView.t)localObject1).gj()) && ((RecyclerView.this.TC.UL) || (!((RecyclerView.t)localObject1).isRemoved())))
        {
          ((RecyclerView.t)localObject1).addFlags(32);
          return (RecyclerView.t)localObject1;
        }
        i += 1;
      }
      Object localObject2 = RecyclerView.this.SR;
      k = ((s)localObject2).PE.size();
      i = 0;
      Object localObject3;
      if (i < k)
      {
        localObject1 = (View)((s)localObject2).PE.get(i);
        localObject3 = ((s)localObject2).PC.aQ((View)localObject1);
        if ((((RecyclerView.t)localObject3).gb() != paramInt) || (((RecyclerView.t)localObject3).gj()) || (((RecyclerView.t)localObject3).isRemoved())) {}
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          localObject2 = RecyclerView.aZ((View)localObject1);
          localObject3 = RecyclerView.this.SR;
          paramInt = ((s)localObject3).PC.indexOfChild((View)localObject1);
          if (paramInt < 0)
          {
            throw new IllegalArgumentException("view is not a child, cannot hide " + localObject1);
            i += 1;
            break;
            localObject1 = null;
            continue;
          }
          if (!((s)localObject3).PD.get(paramInt)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + localObject1);
          }
          ((s)localObject3).PD.clear(paramInt);
          ((s)localObject3).aO((View)localObject1);
          paramInt = RecyclerView.this.SR.indexOfChild((View)localObject1);
          if (paramInt == -1) {
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localObject2);
          }
          RecyclerView.this.SR.detachViewFromParent(paramInt);
          bp((View)localObject1);
          ((RecyclerView.t)localObject2).addFlags(8224);
          return (RecyclerView.t)localObject2;
        }
      }
      k = this.Uq.size();
      i = j;
      while (i < k)
      {
        localObject1 = (RecyclerView.t)this.Uq.get(i);
        if ((!((RecyclerView.t)localObject1).gj()) && (((RecyclerView.t)localObject1).gb() == paramInt))
        {
          this.Uq.remove(i);
          return (RecyclerView.t)localObject1;
        }
        i += 1;
      }
      return null;
    }
    
    private void o(RecyclerView.t paramt)
    {
      z.a(paramt.UU, null);
      if (RecyclerView.u(RecyclerView.this) != null) {
        RecyclerView.u(RecyclerView.this);
      }
      if (RecyclerView.h(RecyclerView.this) != null) {
        RecyclerView.h(RecyclerView.this).a(paramt);
      }
      if (RecyclerView.this.TC != null) {
        RecyclerView.this.SS.x(paramt);
      }
      paramt.Vi = null;
      RecyclerView.l locall = fV();
      int i = paramt.UX;
      ArrayList localArrayList2 = (ArrayList)locall.Ul.get(i);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null)
      {
        localArrayList2 = new ArrayList();
        locall.Ul.put(i, localArrayList2);
        localArrayList1 = localArrayList2;
        if (locall.Um.indexOfKey(i) < 0)
        {
          locall.Um.put(i, 5);
          localArrayList1 = localArrayList2;
        }
      }
      if (locall.Um.get(i) > localArrayList1.size())
      {
        paramt.go();
        localArrayList1.add(paramt);
      }
    }
    
    public final int bj(int paramInt)
    {
      if ((paramInt < 0) || (paramInt >= RecyclerView.this.TC.getItemCount())) {
        throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + RecyclerView.this.TC.getItemCount());
      }
      if (!RecyclerView.this.TC.UL) {
        return paramInt;
      }
      return RecyclerView.this.SQ.aI(paramInt);
    }
    
    public final View bk(int paramInt)
    {
      boolean bool2 = true;
      if ((paramInt < 0) || (paramInt >= RecyclerView.this.TC.getItemCount())) {
        throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + RecyclerView.this.TC.getItemCount());
      }
      Object localObject2;
      int i;
      if (RecyclerView.this.TC.UL)
      {
        localObject2 = bm(paramInt);
        if (localObject2 != null) {
          i = 1;
        }
      }
      for (int j = i;; j = 0)
      {
        Object localObject1 = localObject2;
        i = j;
        boolean bool1;
        if (localObject2 == null)
        {
          localObject2 = g(paramInt, false);
          localObject1 = localObject2;
          i = j;
          if (localObject2 != null)
          {
            if (!((RecyclerView.t)localObject2).isRemoved()) {
              break label300;
            }
            bool1 = RecyclerView.this.TC.UL;
            label154:
            if (bool1) {
              break label459;
            }
            ((RecyclerView.t)localObject2).addFlags(4);
            if (!((RecyclerView.t)localObject2).ge()) {
              break label443;
            }
            RecyclerView.this.removeDetachedView(((RecyclerView.t)localObject2).UU, false);
            ((RecyclerView.t)localObject2).gf();
            label191:
            n((RecyclerView.t)localObject2);
            localObject1 = null;
            i = j;
          }
        }
        for (;;)
        {
          if (localObject1 == null)
          {
            int k = RecyclerView.this.SQ.aI(paramInt);
            if ((k < 0) || (k >= RecyclerView.h(RecyclerView.this).getItemCount()))
            {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ").state:" + RecyclerView.this.TC.getItemCount());
              i = 0;
              break;
              label300:
              if ((((RecyclerView.t)localObject2).jP < 0) || (((RecyclerView.t)localObject2).jP >= RecyclerView.h(RecyclerView.this).getItemCount())) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject2);
              }
              if ((!RecyclerView.this.TC.UL) && (RecyclerView.h(RecyclerView.this).getItemViewType(((RecyclerView.t)localObject2).jP) != ((RecyclerView.t)localObject2).UX))
              {
                bool1 = false;
                break label154;
              }
              if ((RecyclerView.h(RecyclerView.this).TT) && (((RecyclerView.t)localObject2).UW != RecyclerView.h(RecyclerView.this).getItemId(((RecyclerView.t)localObject2).jP)))
              {
                bool1 = false;
                break label154;
              }
              bool1 = true;
              break label154;
              label443:
              if (!((RecyclerView.t)localObject2).gg()) {
                break label191;
              }
              ((RecyclerView.t)localObject2).gh();
              break label191;
              label459:
              i = 1;
              localObject1 = localObject2;
              continue;
            }
            j = RecyclerView.h(RecyclerView.this).getItemViewType(k);
            if (RecyclerView.h(RecyclerView.this).TT)
            {
              localObject2 = a(RecyclerView.h(RecyclerView.this).getItemId(k), j, false);
              localObject1 = localObject2;
              if (localObject2 != null)
              {
                ((RecyclerView.t)localObject2).jP = k;
                i = 1;
                localObject1 = localObject2;
                if (localObject2 == null)
                {
                  localObject1 = localObject2;
                  if (this.Uu != null)
                  {
                    View localView = this.Uu.fX();
                    localObject1 = localObject2;
                    if (localView != null)
                    {
                      localObject2 = RecyclerView.this.aQ(localView);
                      if (localObject2 == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                      }
                      localObject1 = localObject2;
                      if (((RecyclerView.t)localObject2).ga()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                      }
                    }
                  }
                }
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  localObject2 = (ArrayList)fV().Ul.get(j);
                  if ((localObject2 != null) && (!((ArrayList)localObject2).isEmpty()))
                  {
                    k = ((ArrayList)localObject2).size() - 1;
                    localObject1 = (RecyclerView.t)((ArrayList)localObject2).get(k);
                    ((ArrayList)localObject2).remove(k);
                    if (localObject1 != null)
                    {
                      ((RecyclerView.t)localObject1).go();
                      if ((RecyclerView.fN()) && ((((RecyclerView.t)localObject1).UU instanceof ViewGroup))) {
                        c((ViewGroup)((RecyclerView.t)localObject1).UU, false);
                      }
                    }
                    localObject2 = localObject1;
                  }
                }
                else
                {
                  if (localObject2 != null) {
                    break label1208;
                  }
                  localObject1 = RecyclerView.h(RecyclerView.this).d(RecyclerView.this, j);
                }
              }
            }
          }
        }
        for (;;)
        {
          if ((i != 0) && (!RecyclerView.this.TC.UL) && (((RecyclerView.t)localObject1).bo(8192)))
          {
            ((RecyclerView.t)localObject1).setFlags(0, 8192);
            if (RecyclerView.this.TC.UM)
            {
              j = RecyclerView.e.j((RecyclerView.t)localObject1);
              localObject2 = RecyclerView.this.Ts.a(RecyclerView.this.TC, (RecyclerView.t)localObject1, j | 0x1000, ((RecyclerView.t)localObject1).gn());
              RecyclerView.a(RecyclerView.this, (RecyclerView.t)localObject1, (RecyclerView.e.c)localObject2);
            }
          }
          if ((RecyclerView.this.TC.UL) && (((RecyclerView.t)localObject1).isBound()))
          {
            ((RecyclerView.t)localObject1).UY = paramInt;
            paramInt = 0;
          }
          for (;;)
          {
            label880:
            localObject2 = ((RecyclerView.t)localObject1).UU.getLayoutParams();
            if (localObject2 == null)
            {
              localObject2 = (RecyclerView.LayoutParams)RecyclerView.this.generateDefaultLayoutParams();
              ((RecyclerView.t)localObject1).UU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
              label917:
              ((RecyclerView.LayoutParams)localObject2).Ui = ((RecyclerView.t)localObject1);
              if ((i == 0) || (paramInt == 0)) {
                break label1197;
              }
            }
            label1197:
            for (bool1 = bool2;; bool1 = false)
            {
              ((RecyclerView.LayoutParams)localObject2).Uk = bool1;
              return ((RecyclerView.t)localObject1).UU;
              localObject1 = null;
              break;
              if ((((RecyclerView.t)localObject1).isBound()) && (!((RecyclerView.t)localObject1).gk()) && (!((RecyclerView.t)localObject1).gj())) {
                break label1203;
              }
              j = RecyclerView.this.SQ.aI(paramInt);
              ((RecyclerView.t)localObject1).Vi = RecyclerView.this;
              localObject2 = RecyclerView.h(RecyclerView.this);
              ((RecyclerView.t)localObject1).jP = j;
              if (((RecyclerView.a)localObject2).TT) {
                ((RecyclerView.t)localObject1).UW = ((RecyclerView.a)localObject2).getItemId(j);
              }
              ((RecyclerView.t)localObject1).setFlags(1, 519);
              android.support.v4.os.e.beginSection("RV OnBindView");
              ((RecyclerView.a)localObject2).a((RecyclerView.t)localObject1, j, ((RecyclerView.t)localObject1).gn());
              ((RecyclerView.t)localObject1).gm();
              android.support.v4.os.e.endSection();
              localObject2 = ((RecyclerView.t)localObject1).UU;
              if (RecyclerView.this.fz())
              {
                if (z.G((View)localObject2) == 0) {
                  z.i((View)localObject2, 1);
                }
                if (!z.D((View)localObject2)) {
                  z.a((View)localObject2, RecyclerView.t(RecyclerView.this).Vj);
                }
              }
              if (RecyclerView.this.TC.UL) {
                ((RecyclerView.t)localObject1).UY = paramInt;
              }
              paramInt = 1;
              break label880;
              if (!RecyclerView.this.checkLayoutParams((ViewGroup.LayoutParams)localObject2))
              {
                localObject2 = (RecyclerView.LayoutParams)RecyclerView.this.generateLayoutParams((ViewGroup.LayoutParams)localObject2);
                ((RecyclerView.t)localObject1).UU.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                break label917;
              }
              localObject2 = (RecyclerView.LayoutParams)localObject2;
              break label917;
            }
            label1203:
            paramInt = 0;
          }
          label1208:
          localObject1 = localObject2;
          continue;
          localObject2 = localObject1;
          break;
        }
        localObject2 = null;
      }
    }
    
    final void bl(int paramInt)
    {
      o((RecyclerView.t)this.Uq.get(paramInt));
      this.Uq.remove(paramInt);
    }
    
    public final void bn(View paramView)
    {
      RecyclerView.t localt = RecyclerView.aZ(paramView);
      if (localt.gl()) {
        RecyclerView.this.removeDetachedView(paramView, false);
      }
      if (localt.ge()) {
        localt.gf();
      }
      for (;;)
      {
        n(localt);
        return;
        if (localt.gg()) {
          localt.gh();
        }
      }
    }
    
    final void bo(View paramView)
    {
      paramView = RecyclerView.aZ(paramView);
      paramView.Vf = null;
      paramView.Vg = false;
      paramView.gh();
      n(paramView);
    }
    
    final void bp(View paramView)
    {
      paramView = RecyclerView.aZ(paramView);
      if ((paramView.bo(12)) || (!paramView.gq()) || (RecyclerView.a(RecyclerView.this, paramView)))
      {
        if ((paramView.gj()) && (!paramView.isRemoved()) && (!RecyclerView.h(RecyclerView.this).TT)) {
          throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        }
        paramView.a(this, false);
        this.Uo.add(paramView);
        return;
      }
      if (this.Up == null) {
        this.Up = new ArrayList();
      }
      paramView.a(this, true);
      this.Up.add(paramView);
    }
    
    public final void clear()
    {
      this.Uo.clear();
      fU();
    }
    
    final void fU()
    {
      int i = this.Uq.size() - 1;
      while (i >= 0)
      {
        bl(i);
        i -= 1;
      }
      this.Uq.clear();
    }
    
    final RecyclerView.l fV()
    {
      if (this.Ut == null) {
        this.Ut = new RecyclerView.l();
      }
      return this.Ut;
    }
    
    final void n(RecyclerView.t paramt)
    {
      boolean bool = true;
      int k = 0;
      if ((paramt.ge()) || (paramt.UU.getParent() != null))
      {
        StringBuilder localStringBuilder = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(paramt.ge()).append(" isAttached:");
        if (paramt.UU.getParent() != null) {}
        for (;;)
        {
          throw new IllegalArgumentException(bool);
          bool = false;
        }
      }
      if (paramt.gl()) {
        throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramt);
      }
      if (paramt.ga()) {
        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
      }
      int j;
      int i;
      if (((paramt.tu & 0x10) == 0) && (z.E(paramt.UU)))
      {
        j = 1;
        if ((RecyclerView.h(RecyclerView.this) != null) && (j != 0)) {
          RecyclerView.h(RecyclerView.this);
        }
        if (!paramt.gp()) {
          break label291;
        }
        if (paramt.bo(14)) {
          break label286;
        }
        i = this.Uq.size();
        if ((i == this.Us) && (i > 0)) {
          bl(0);
        }
        if (i >= this.Us) {
          break label286;
        }
        this.Uq.add(paramt);
        i = 1;
        label236:
        if (i != 0) {
          break label283;
        }
        o(paramt);
        k = 1;
      }
      for (;;)
      {
        RecyclerView.this.SS.x(paramt);
        if ((i == 0) && (k == 0) && (j != 0)) {
          paramt.Vi = null;
        }
        return;
        j = 0;
        break;
        label283:
        continue;
        label286:
        i = 0;
        break label236;
        label291:
        i = 0;
      }
    }
    
    final void p(RecyclerView.t paramt)
    {
      if (paramt.Vg) {
        this.Up.remove(paramt);
      }
      for (;;)
      {
        paramt.Vf = null;
        paramt.Vg = false;
        paramt.gh();
        return;
        this.Uo.remove(paramt);
      }
    }
  }
  
  public static abstract interface n {}
  
  private final class o
    extends RecyclerView.c
  {
    public o() {}
    
    private void fW()
    {
      if ((RecyclerView.o(RecyclerView.this)) && (RecyclerView.p(RecyclerView.this)) && (RecyclerView.q(RecyclerView.this)))
      {
        z.a(RecyclerView.this, RecyclerView.r(RecyclerView.this));
        return;
      }
      RecyclerView.s(RecyclerView.this);
      RecyclerView.this.requestLayout();
    }
    
    public final void U(int paramInt1, int paramInt2)
    {
      int i = 1;
      RecyclerView.this.r(null);
      e locale = RecyclerView.this.SQ;
      locale.NS.add(locale.a(1, paramInt1, paramInt2, null));
      locale.NY |= 0x1;
      if (locale.NS.size() == 1) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          fW();
        }
        return;
      }
    }
    
    public final void V(int paramInt1, int paramInt2)
    {
      int i = 1;
      RecyclerView.this.r(null);
      e locale = RecyclerView.this.SQ;
      locale.NS.add(locale.a(2, paramInt1, paramInt2, null));
      locale.NY |= 0x2;
      if (locale.NS.size() == 1) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          fW();
        }
        return;
      }
    }
    
    public final void W(int paramInt1, int paramInt2)
    {
      int i = 1;
      RecyclerView.this.r(null);
      e locale = RecyclerView.this.SQ;
      if (paramInt1 != paramInt2)
      {
        locale.NS.add(locale.a(8, paramInt1, paramInt2, null));
        locale.NY |= 0x8;
        if (locale.NS.size() != 1) {}
      }
      for (paramInt1 = i;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          fW();
        }
        return;
      }
    }
    
    public final void c(int paramInt1, int paramInt2, Object paramObject)
    {
      int i = 1;
      RecyclerView.this.r(null);
      e locale = RecyclerView.this.SQ;
      locale.NS.add(locale.a(4, paramInt1, paramInt2, paramObject));
      locale.NY |= 0x4;
      if (locale.NS.size() == 1) {}
      for (paramInt1 = i;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          fW();
        }
        return;
      }
    }
    
    public final void onChanged()
    {
      RecyclerView.this.r(null);
      boolean bool = RecyclerView.h(RecyclerView.this).TT;
      RecyclerView.this.TC.UK = true;
      RecyclerView.n(RecyclerView.this);
      if (!RecyclerView.this.SQ.es()) {
        RecyclerView.this.requestLayout();
      }
    }
  }
  
  public static abstract class p
  {
    RecyclerView.h SH;
    RecyclerView Ub;
    public int Uw = -1;
    boolean Ux;
    View Uy;
    private final a Uz = new a();
    boolean mRunning;
    
    protected abstract void a(int paramInt1, int paramInt2, a parama);
    
    protected abstract void a(View paramView, a parama);
    
    public final void ab(int paramInt1, int paramInt2)
    {
      int i = 0;
      RecyclerView localRecyclerView = this.Ub;
      if ((!this.mRunning) || (this.Uw == -1) || (localRecyclerView == null)) {
        stop();
      }
      this.Ux = false;
      Object localObject;
      if (this.Uy != null)
      {
        if (RecyclerView.bb(this.Uy) != this.Uw) {
          break label166;
        }
        localObject = this.Uy;
        RecyclerView.q localq = localRecyclerView.TC;
        a((View)localObject, this.Uz);
        this.Uz.A(localRecyclerView);
        stop();
      }
      for (;;)
      {
        if (this.mRunning)
        {
          localObject = localRecyclerView.TC;
          a(paramInt1, paramInt2, this.Uz);
          paramInt1 = i;
          if (this.Uz.UC >= 0) {
            paramInt1 = 1;
          }
          this.Uz.A(localRecyclerView);
          if (paramInt1 != 0)
          {
            if (!this.mRunning) {
              break;
            }
            this.Ux = true;
            RecyclerView.x(localRecyclerView).fY();
          }
        }
        return;
        label166:
        this.Uy = null;
      }
      stop();
    }
    
    protected abstract void onStop();
    
    protected final void stop()
    {
      if (!this.mRunning) {
        return;
      }
      onStop();
      this.Ub.TC.Uw = -1;
      this.Uy = null;
      this.Uw = -1;
      this.Ux = false;
      this.mRunning = false;
      RecyclerView.h localh = this.SH;
      if (localh.Uc == this) {
        localh.Uc = null;
      }
      this.SH = null;
      this.Ub = null;
    }
    
    public static final class a
    {
      private int UA = 0;
      private int UB = 0;
      int UC = -1;
      private boolean UD = false;
      private int UE = 0;
      private int kE = Integer.MIN_VALUE;
      private Interpolator mInterpolator = null;
      
      public a()
      {
        this(0, 0);
      }
      
      private a(int paramInt1, int paramInt2) {}
      
      public final void A(RecyclerView paramRecyclerView)
      {
        if (this.UC >= 0)
        {
          int i = this.UC;
          this.UC = -1;
          RecyclerView.d(paramRecyclerView, i);
          this.UD = false;
          return;
        }
        if (this.UD)
        {
          if ((this.mInterpolator != null) && (this.kE <= 0)) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
          }
          if (this.kE <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
          }
          if (this.mInterpolator == null) {
            if (this.kE == Integer.MIN_VALUE) {
              RecyclerView.x(paramRecyclerView).smoothScrollBy(this.UA, this.UB);
            }
          }
          for (;;)
          {
            this.UE += 1;
            this.UD = false;
            return;
            RecyclerView.x(paramRecyclerView).k(this.UA, this.UB, this.kE);
            continue;
            RecyclerView.x(paramRecyclerView).b(this.UA, this.UB, this.kE, this.mInterpolator);
          }
        }
        this.UE = 0;
      }
      
      public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
      {
        this.UA = paramInt1;
        this.UB = paramInt2;
        this.kE = paramInt3;
        this.mInterpolator = paramInterpolator;
        this.UD = true;
      }
    }
  }
  
  public static final class q
  {
    public int UF = 1;
    private SparseArray<Object> UG;
    int UH = 0;
    public int UI = 0;
    public int UJ = 0;
    public boolean UK = false;
    public boolean UL = false;
    public boolean UM = false;
    public boolean UN = false;
    public boolean UO = false;
    public boolean UP = false;
    public int Uw = -1;
    
    final void bn(int paramInt)
    {
      if ((this.UF & paramInt) == 0) {
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(paramInt) + " but it is " + Integer.toBinaryString(this.UF));
      }
    }
    
    public final int getItemCount()
    {
      if (this.UL) {
        return this.UI - this.UJ;
      }
      return this.UH;
    }
    
    public final String toString()
    {
      return "State{mTargetPosition=" + this.Uw + ", mData=" + this.UG + ", mItemCount=" + this.UH + ", mPreviousLayoutItemCount=" + this.UI + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.UJ + ", mStructureChanged=" + this.UK + ", mInPreLayout=" + this.UL + ", mRunSimpleAnimations=" + this.UM + ", mRunPredictiveAnimations=" + this.UN + '}';
    }
  }
  
  public static abstract class r
  {
    public abstract View fX();
  }
  
  private final class s
    implements Runnable
  {
    int UQ;
    int UR;
    private boolean US = false;
    private boolean UT = false;
    android.support.v4.widget.q hN = android.support.v4.widget.q.a(RecyclerView.this.getContext(), RecyclerView.fM());
    private Interpolator mInterpolator = RecyclerView.fM();
    
    public s() {}
    
    public final void b(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
    {
      if (this.mInterpolator != paramInterpolator)
      {
        this.mInterpolator = paramInterpolator;
        this.hN = android.support.v4.widget.q.a(RecyclerView.this.getContext(), paramInterpolator);
      }
      RecyclerView.c(RecyclerView.this, 2);
      this.UR = 0;
      this.UQ = 0;
      this.hN.startScroll(0, 0, paramInt1, paramInt2, paramInt3);
      fY();
    }
    
    final void fY()
    {
      if (this.US)
      {
        this.UT = true;
        return;
      }
      RecyclerView.this.removeCallbacks(this);
      z.a(RecyclerView.this, this);
    }
    
    public final void k(int paramInt1, int paramInt2, int paramInt3)
    {
      b(paramInt1, paramInt2, paramInt3, RecyclerView.fM());
    }
    
    public final void run()
    {
      if (RecyclerView.this.SW == null)
      {
        stop();
        return;
      }
      this.UT = false;
      this.US = true;
      RecyclerView.d(RecyclerView.this);
      android.support.v4.widget.q localq = this.hN;
      RecyclerView.p localp = RecyclerView.this.SW.Uc;
      int i6;
      int i7;
      int i4;
      int i5;
      int i1;
      int i;
      int m;
      int i3;
      int j;
      int n;
      int k;
      if (localq.computeScrollOffset())
      {
        i6 = localq.getCurrX();
        i7 = localq.getCurrY();
        i4 = i6 - this.UQ;
        i5 = i7 - this.UR;
        i1 = 0;
        i = 0;
        i2 = 0;
        m = 0;
        this.UQ = i6;
        this.UR = i7;
        i3 = 0;
        j = 0;
        n = 0;
        k = 0;
        if (RecyclerView.h(RecyclerView.this) == null) {
          break label768;
        }
        RecyclerView.this.fn();
        RecyclerView.i(RecyclerView.this);
        android.support.v4.os.e.beginSection("RV Scroll");
        if (i4 != 0)
        {
          i = RecyclerView.this.SW.a(i4, RecyclerView.this.SO, RecyclerView.this.TC);
          j = i4 - i;
        }
        if (i5 != 0)
        {
          m = RecyclerView.this.SW.b(i5, RecyclerView.this.SO, RecyclerView.this.TC);
          k = i5 - m;
        }
        android.support.v4.os.e.endSection();
        RecyclerView.j(RecyclerView.this);
        RecyclerView.k(RecyclerView.this);
        RecyclerView.this.R(false);
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (localp == null) {
          break label768;
        }
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (localp.Ux) {
          break label768;
        }
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (!localp.mRunning) {
          break label768;
        }
        n = RecyclerView.this.TC.getItemCount();
        if (n != 0) {
          break label723;
        }
        localp.stop();
        i1 = i;
        label338:
        if (!RecyclerView.l(RecyclerView.this).isEmpty()) {
          RecyclerView.this.invalidate();
        }
        if (z.C(RecyclerView.this) != 2) {
          RecyclerView.a(RecyclerView.this, i4, i5);
        }
        if ((j != 0) || (k != 0))
        {
          n = (int)localq.getCurrVelocity();
          if (j == i6) {
            break label881;
          }
          if (j >= 0) {
            break label781;
          }
          i = -n;
        }
      }
      label410:
      label427:
      label466:
      label486:
      label607:
      label634:
      label654:
      label723:
      label768:
      label781:
      label808:
      label832:
      label859:
      label864:
      label869:
      label881:
      for (int i2 = i;; i2 = 0)
      {
        if (k != i7) {
          if (k < 0) {
            i = -n;
          }
        }
        for (;;)
        {
          RecyclerView localRecyclerView;
          if (z.C(RecyclerView.this) != 2)
          {
            localRecyclerView = RecyclerView.this;
            if (i2 >= 0) {
              break label808;
            }
            localRecyclerView.fq();
            localRecyclerView.To.ag(-i2);
            if (i >= 0) {
              break label832;
            }
            localRecyclerView.fs();
            localRecyclerView.Tp.ag(-i);
            if ((i2 != 0) || (i != 0)) {
              z.F(localRecyclerView);
            }
          }
          if (((i2 != 0) || (j == i6) || (localq.getFinalX() == 0)) && ((i != 0) || (k == i7) || (localq.getFinalY() == 0))) {
            localq.abortAnimation();
          }
          if ((i1 != 0) || (m != 0)) {
            RecyclerView.this.O(i1, m);
          }
          if (!RecyclerView.m(RecyclerView.this)) {
            RecyclerView.this.invalidate();
          }
          if ((i5 != 0) && (RecyclerView.this.SW.eR()) && (m == i5))
          {
            i = 1;
            if ((i4 == 0) || (!RecyclerView.this.SW.eQ()) || (i1 != i4)) {
              break label859;
            }
            j = 1;
            if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0)) {
              break label864;
            }
            i = 1;
            if ((!localq.isFinished()) && (i != 0)) {
              break label869;
            }
            RecyclerView.c(RecyclerView.this, 0);
          }
          for (;;)
          {
            if (localp != null)
            {
              if (localp.Ux) {
                localp.ab(0, 0);
              }
              if (!this.UT) {
                localp.stop();
              }
            }
            this.US = false;
            if (!this.UT) {
              break;
            }
            fY();
            return;
            if (localp.Uw >= n) {
              localp.Uw = (n - 1);
            }
            localp.ab(i4 - j, i5 - k);
            i1 = i;
            i3 = j;
            i2 = m;
            n = k;
            m = i2;
            j = i3;
            k = n;
            break label338;
            if (j > 0)
            {
              i = n;
              break label410;
            }
            i = 0;
            break label410;
            i = n;
            if (k > 0) {
              break label427;
            }
            i = 0;
            break label427;
            if (i2 <= 0) {
              break label466;
            }
            localRecyclerView.fr();
            localRecyclerView.Tq.ag(i2);
            break label466;
            if (i <= 0) {
              break label486;
            }
            localRecyclerView.ft();
            localRecyclerView.Tr.ag(i);
            break label486;
            i = 0;
            break label607;
            j = 0;
            break label634;
            i = 0;
            break label654;
            fY();
          }
          i = 0;
        }
      }
    }
    
    public final void smoothScrollBy(int paramInt1, int paramInt2)
    {
      int k = Math.abs(paramInt1);
      int m = Math.abs(paramInt2);
      int n;
      int i1;
      if (k > m)
      {
        j = 1;
        n = (int)Math.sqrt(0.0D);
        i1 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
        if (j == 0) {
          break label157;
        }
      }
      label157:
      for (int i = RecyclerView.this.getWidth();; i = RecyclerView.this.getHeight())
      {
        int i2 = i / 2;
        float f3 = Math.min(1.0F, i1 * 1.0F / i);
        float f1 = i2;
        float f2 = i2;
        f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
        if (n <= 0) {
          break label169;
        }
        i = Math.round(1000.0F * Math.abs((f3 * f2 + f1) / n)) * 4;
        k(paramInt1, paramInt2, Math.min(i, 2000));
        return;
        j = 0;
        break;
      }
      label169:
      if (j != 0) {}
      for (int j = k;; j = m)
      {
        i = (int)((j / i + 1.0F) * 300.0F);
        break;
      }
    }
    
    public final void stop()
    {
      RecyclerView.this.removeCallbacks(this);
      this.hN.abortAnimation();
    }
  }
  
  public static abstract class t
  {
    private static final List<Object> Vb = Collections.EMPTY_LIST;
    public final View UU;
    int UV = -1;
    public long UW = -1L;
    public int UX = -1;
    int UY = -1;
    t UZ = null;
    t Va = null;
    List<Object> Vc = null;
    List<Object> Vd = null;
    private int Ve = 0;
    public RecyclerView.m Vf = null;
    public boolean Vg = false;
    int Vh = 0;
    RecyclerView Vi;
    int jP = -1;
    public int tu;
    
    public t(View paramView)
    {
      if (paramView == null) {
        throw new IllegalArgumentException("itemView may not be null");
      }
      this.UU = paramView;
    }
    
    final void R(Object paramObject)
    {
      if (paramObject == null) {
        addFlags(1024);
      }
      while ((this.tu & 0x400) != 0) {
        return;
      }
      if (this.Vc == null)
      {
        this.Vc = new ArrayList();
        this.Vd = Collections.unmodifiableList(this.Vc);
      }
      this.Vc.add(paramObject);
    }
    
    public final void U(boolean paramBoolean)
    {
      int i;
      if (paramBoolean)
      {
        i = this.Ve - 1;
        this.Ve = i;
        if (this.Ve >= 0) {
          break label53;
        }
        this.Ve = 0;
        new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this);
      }
      label53:
      do
      {
        return;
        i = this.Ve + 1;
        break;
        if ((!paramBoolean) && (this.Ve == 1))
        {
          this.tu |= 0x10;
          return;
        }
      } while ((!paramBoolean) || (this.Ve != 0));
      this.tu &= 0xFFFFFFEF;
    }
    
    final void a(RecyclerView.m paramm, boolean paramBoolean)
    {
      this.Vf = paramm;
      this.Vg = paramBoolean;
    }
    
    final void addFlags(int paramInt)
    {
      this.tu |= paramInt;
    }
    
    final boolean bo(int paramInt)
    {
      return (this.tu & paramInt) != 0;
    }
    
    final void fZ()
    {
      this.UV = -1;
      this.UY = -1;
    }
    
    final boolean ga()
    {
      return (this.tu & 0x80) != 0;
    }
    
    public final int gb()
    {
      if (this.UY == -1) {
        return this.jP;
      }
      return this.UY;
    }
    
    public final int gd()
    {
      if (this.Vi == null) {
        return -1;
      }
      return RecyclerView.b(this.Vi, this);
    }
    
    final boolean ge()
    {
      return this.Vf != null;
    }
    
    @Deprecated
    public final int getPosition()
    {
      if (this.UY == -1) {
        return this.jP;
      }
      return this.UY;
    }
    
    final void gf()
    {
      this.Vf.p(this);
    }
    
    final boolean gg()
    {
      return (this.tu & 0x20) != 0;
    }
    
    final void gh()
    {
      this.tu &= 0xFFFFFFDF;
    }
    
    final void gi()
    {
      this.tu &= 0xFEFF;
    }
    
    final boolean gj()
    {
      return (this.tu & 0x4) != 0;
    }
    
    final boolean gk()
    {
      return (this.tu & 0x2) != 0;
    }
    
    final boolean gl()
    {
      return (this.tu & 0x100) != 0;
    }
    
    final void gm()
    {
      if (this.Vc != null) {
        this.Vc.clear();
      }
      this.tu &= 0xFBFF;
    }
    
    final List<Object> gn()
    {
      if ((this.tu & 0x400) == 0)
      {
        if ((this.Vc == null) || (this.Vc.size() == 0)) {
          return Vb;
        }
        return this.Vd;
      }
      return Vb;
    }
    
    final void go()
    {
      this.tu = 0;
      this.jP = -1;
      this.UV = -1;
      this.UW = -1L;
      this.UY = -1;
      this.Ve = 0;
      this.UZ = null;
      this.Va = null;
      gm();
      this.Vh = 0;
    }
    
    public final boolean gp()
    {
      return ((this.tu & 0x10) == 0) && (!z.E(this.UU));
    }
    
    final boolean gq()
    {
      return (this.tu & 0x2) != 0;
    }
    
    final void h(int paramInt, boolean paramBoolean)
    {
      if (this.UV == -1) {
        this.UV = this.jP;
      }
      if (this.UY == -1) {
        this.UY = this.jP;
      }
      if (paramBoolean) {
        this.UY += paramInt;
      }
      this.jP += paramInt;
      if (this.UU.getLayoutParams() != null) {
        ((RecyclerView.LayoutParams)this.UU.getLayoutParams()).Uj = true;
      }
    }
    
    final boolean isBound()
    {
      return (this.tu & 0x1) != 0;
    }
    
    final boolean isRemoved()
    {
      return (this.tu & 0x8) != 0;
    }
    
    final void setFlags(int paramInt1, int paramInt2)
    {
      this.tu = (this.tu & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.jP + " id=" + this.UW + ", oldPos=" + this.UV + ", pLpos:" + this.UY);
      String str;
      if (ge())
      {
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" scrap ");
        if (this.Vg)
        {
          str = "[changeScrap]";
          localStringBuilder2.append(str);
        }
      }
      else
      {
        if (gj()) {
          localStringBuilder1.append(" invalid");
        }
        if (!isBound()) {
          localStringBuilder1.append(" unbound");
        }
        if (gk()) {
          localStringBuilder1.append(" update");
        }
        if (isRemoved()) {
          localStringBuilder1.append(" removed");
        }
        if (ga()) {
          localStringBuilder1.append(" ignored");
        }
        if (gl()) {
          localStringBuilder1.append(" tmpDetached");
        }
        if (!gp()) {
          localStringBuilder1.append(" not recyclable(" + this.Ve + ")");
        }
        if (((this.tu & 0x200) == 0) && (!gj())) {
          break label301;
        }
      }
      label301:
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          localStringBuilder1.append(" undefined adapter position");
        }
        if (this.UU.getParent() == null) {
          localStringBuilder1.append(" no parent");
        }
        localStringBuilder1.append("}");
        return localStringBuilder1.toString();
        str = "[attachedScrap]";
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */