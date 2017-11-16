package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class h
  extends BaseAdapter
  implements f
{
  private final Context context;
  private final SharedPreferences ghC;
  private Preference.a wjv;
  private final j wkG;
  private final LinkedList<String> wkH;
  private final HashMap<String, Preference> wkI;
  private final HashSet<String> wkJ;
  private final LinkedList<String> wkK;
  private final HashMap<String, Integer> wkL;
  private final HashMap<String, String> wkM;
  private int[] wkN;
  private boolean wkO;
  private boolean wkP;
  
  public h(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(3229546971136L, 24062);
    this.wkH = new LinkedList();
    this.wkI = new HashMap();
    this.wkJ = new HashSet();
    this.wkK = new LinkedList();
    this.wkL = new HashMap();
    this.wkM = new HashMap();
    this.wkN = new int[0];
    this.wkO = false;
    this.wkP = false;
    this.wkG = new j(paramContext);
    this.context = paramContext;
    this.ghC = paramSharedPreferences;
    GMTrace.o(3229546971136L, 24062);
  }
  
  private static boolean Ct(int paramInt)
  {
    GMTrace.i(3231694454784L, 24078);
    if ((paramInt == a.h.cBA) || (paramInt == a.h.gfD) || (paramInt == a.h.gfF))
    {
      GMTrace.o(3231694454784L, 24078);
      return true;
    }
    GMTrace.o(3231694454784L, 24078);
    return false;
  }
  
  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    GMTrace.i(3231962890240L, 24080);
    Object localObject;
    if ((paramPreference instanceof CheckBoxPreference))
    {
      localObject = (CheckBoxPreference)paramPreference;
      if (((Preference)localObject).wlc) {
        ((CheckBoxPreference)localObject).sdM = paramSharedPreferences.getBoolean(paramPreference.hiu, ((CheckBoxPreference)paramPreference).isChecked());
      }
    }
    if ((paramPreference instanceof DialogPreference))
    {
      localObject = (DialogPreference)paramPreference;
      if (((Preference)localObject).wlc) {
        ((DialogPreference)localObject).setValue(paramSharedPreferences.getString(paramPreference.hiu, null));
      }
    }
    if ((paramPreference instanceof EditPreference))
    {
      localObject = (EditPreference)paramPreference;
      if (((Preference)localObject).wlc)
      {
        ((EditPreference)localObject).value = paramSharedPreferences.getString(paramPreference.hiu, null);
        ((EditPreference)localObject).setSummary(((EditPreference)localObject).value);
      }
    }
    GMTrace.o(3231962890240L, 24080);
  }
  
  private void b(Preference paramPreference, int paramInt)
  {
    GMTrace.i(3230486495232L, 24069);
    String str = e(paramPreference);
    this.wkI.put(str, paramPreference);
    LinkedList localLinkedList = this.wkH;
    int i = paramInt;
    if (paramInt == -1) {
      i = this.wkH.size();
    }
    localLinkedList.add(i, str);
    if ((!this.wkL.containsKey(d(paramPreference))) && (!this.wkP)) {
      this.wkL.put(d(paramPreference), Integer.valueOf(this.wkL.size()));
    }
    if (paramPreference.wld != null) {
      this.wkM.put(paramPreference.wld + "|" + paramPreference.hiu, paramPreference.hiu);
    }
    GMTrace.o(3230486495232L, 24069);
  }
  
  private void cba()
  {
    GMTrace.i(3231560237056L, 24077);
    HashSet localHashSet = new HashSet();
    int i = 0;
    if (i < this.wkK.size())
    {
      Preference localPreference1 = (Preference)this.wkI.get(this.wkK.get(i));
      if (((localPreference1 instanceof PreferenceCategory)) && (bg.nm(localPreference1.hiu)) && (i != 0))
      {
        Preference localPreference2 = (Preference)this.wkI.get(this.wkK.get(i - 1));
        if ((localPreference2 instanceof PreferenceCategory))
        {
          if ((!bg.nm(localPreference2.hiu)) || ((localPreference2.getTitle() != null) && (localPreference2.getTitle().toString().trim().length() > 0))) {
            break label157;
          }
          localHashSet.add(e(localPreference2));
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label157:
        if ((bg.nm(localPreference1.hiu)) && ((localPreference1.getTitle() == null) || (localPreference1.getTitle().toString().trim().length() <= 0))) {
          localHashSet.add(e(localPreference1));
        }
      }
    }
    this.wkK.removeAll(localHashSet);
    GMTrace.o(3231560237056L, 24077);
  }
  
  private static String d(Preference paramPreference)
  {
    GMTrace.i(3229681188864L, 24063);
    paramPreference = paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.wli;
    GMTrace.o(3229681188864L, 24063);
    return paramPreference;
  }
  
  private static String e(Preference paramPreference)
  {
    GMTrace.i(3229815406592L, 24064);
    if ((paramPreference.hiu != null) && (paramPreference.hiu.length() > 0))
    {
      paramPreference = paramPreference.hiu;
      GMTrace.o(3229815406592L, 24064);
      return paramPreference;
    }
    paramPreference = "_anonymous_pref@" + paramPreference.hashCode();
    GMTrace.o(3229815406592L, 24064);
    return paramPreference;
  }
  
  public final Preference VG(String paramString)
  {
    GMTrace.i(3230620712960L, 24070);
    paramString = (Preference)this.wkI.get(paramString);
    GMTrace.o(3230620712960L, 24070);
    return paramString;
  }
  
  public final boolean VH(String paramString)
  {
    GMTrace.i(3231023366144L, 24073);
    boolean bool = c(VG(paramString));
    GMTrace.o(3231023366144L, 24073);
    return bool;
  }
  
  public final int VI(String paramString)
  {
    GMTrace.i(3230083842048L, 24066);
    if (this.wkK == null)
    {
      GMTrace.o(3230083842048L, 24066);
      return -1;
    }
    int i = this.wkK.indexOf(paramString);
    GMTrace.o(3230083842048L, 24066);
    return i;
  }
  
  public final void a(Preference paramPreference)
  {
    GMTrace.i(3230218059776L, 24067);
    a(paramPreference, -1);
    GMTrace.o(3230218059776L, 24067);
  }
  
  public final void a(Preference paramPreference, int paramInt)
  {
    GMTrace.i(3230352277504L, 24068);
    b(paramPreference, paramInt);
    if (!this.wkO) {
      notifyDataSetChanged();
    }
    GMTrace.o(3230352277504L, 24068);
  }
  
  /* Error */
  public final void addPreferencesFromResource(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 319
    //   3: sipush 24075
    //   6: invokestatic 46	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 71	com/tencent/mm/ui/base/preference/h:wkO	Z
    //   14: aload_0
    //   15: getfield 80	com/tencent/mm/ui/base/preference/h:wkG	Lcom/tencent/mm/ui/base/preference/j;
    //   18: astore 4
    //   20: aload 4
    //   22: getfield 323	com/tencent/mm/ui/base/preference/j:mContext	Landroid/content/Context;
    //   25: invokevirtual 329	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   28: iload_1
    //   29: invokevirtual 335	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   32: astore_2
    //   33: aload 4
    //   35: getfield 339	com/tencent/mm/ui/base/preference/j:GS	[Ljava/lang/Object;
    //   38: astore_3
    //   39: aload_3
    //   40: monitorenter
    //   41: aload_2
    //   42: invokestatic 345	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   45: astore 5
    //   47: aload 4
    //   49: getfield 339	com/tencent/mm/ui/base/preference/j:GS	[Ljava/lang/Object;
    //   52: iconst_0
    //   53: aload 4
    //   55: getfield 323	com/tencent/mm/ui/base/preference/j:mContext	Landroid/content/Context;
    //   58: aastore
    //   59: aload_2
    //   60: invokeinterface 350 1 0
    //   65: istore_1
    //   66: iload_1
    //   67: iconst_2
    //   68: if_icmpeq +18 -> 86
    //   71: iload_1
    //   72: iconst_1
    //   73: if_icmpeq +13 -> 86
    //   76: aload_2
    //   77: invokeinterface 350 1 0
    //   82: istore_1
    //   83: goto -17 -> 66
    //   86: iload_1
    //   87: iconst_2
    //   88: if_icmpeq +57 -> 145
    //   91: new 314	android/view/InflateException
    //   94: dup
    //   95: new 190	java/lang/StringBuilder
    //   98: dup
    //   99: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   102: aload_2
    //   103: invokeinterface 353 1 0
    //   108: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: ldc_w 355
    //   114: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokespecial 356	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   123: athrow
    //   124: astore 4
    //   126: aload 4
    //   128: athrow
    //   129: astore 4
    //   131: aload_3
    //   132: monitorexit
    //   133: aload 4
    //   135: athrow
    //   136: astore_3
    //   137: aload_2
    //   138: invokeinterface 361 1 0
    //   143: aload_3
    //   144: athrow
    //   145: aload 4
    //   147: aload_2
    //   148: invokeinterface 362 1 0
    //   153: aload 5
    //   155: invokevirtual 365	com/tencent/mm/ui/base/preference/j:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/tencent/mm/ui/base/preference/Preference;
    //   158: pop
    //   159: aload 4
    //   161: aload_2
    //   162: aload_0
    //   163: aload 5
    //   165: invokevirtual 368	com/tencent/mm/ui/base/preference/j:a	(Lorg/xmlpull/v1/XmlPullParser;Lcom/tencent/mm/ui/base/preference/f;Landroid/util/AttributeSet;)V
    //   168: aload_3
    //   169: monitorexit
    //   170: aload_2
    //   171: invokeinterface 361 1 0
    //   176: aload_0
    //   177: iconst_0
    //   178: putfield 71	com/tencent/mm/ui/base/preference/h:wkO	Z
    //   181: aload_0
    //   182: invokevirtual 310	com/tencent/mm/ui/base/preference/h:notifyDataSetChanged	()V
    //   185: ldc2_w 319
    //   188: sipush 24075
    //   191: invokestatic 87	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   194: return
    //   195: astore 4
    //   197: new 314	android/view/InflateException
    //   200: dup
    //   201: aload 4
    //   203: invokevirtual 371	org/xmlpull/v1/XmlPullParserException:getMessage	()Ljava/lang/String;
    //   206: invokespecial 356	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   209: astore 5
    //   211: aload 5
    //   213: aload 4
    //   215: invokevirtual 375	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   218: pop
    //   219: aload 5
    //   221: athrow
    //   222: astore 4
    //   224: new 314	android/view/InflateException
    //   227: dup
    //   228: new 190	java/lang/StringBuilder
    //   231: dup
    //   232: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   235: aload_2
    //   236: invokeinterface 353 1 0
    //   241: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: ldc_w 377
    //   247: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: aload 4
    //   252: invokevirtual 378	java/io/IOException:getMessage	()Ljava/lang/String;
    //   255: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokespecial 356	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   264: astore 5
    //   266: aload 5
    //   268: aload 4
    //   270: invokevirtual 375	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   273: pop
    //   274: aload 5
    //   276: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	277	0	this	h
    //   0	277	1	paramInt	int
    //   32	204	2	localXmlResourceParser	android.content.res.XmlResourceParser
    //   136	33	3	localObject1	Object
    //   18	36	4	localj	j
    //   124	3	4	localInflateException	android.view.InflateException
    //   129	31	4	localObject2	Object
    //   195	19	4	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   222	47	4	localIOException	java.io.IOException
    //   45	230	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   59	66	124	android/view/InflateException
    //   76	83	124	android/view/InflateException
    //   91	124	124	android/view/InflateException
    //   145	168	124	android/view/InflateException
    //   41	59	129	finally
    //   59	66	129	finally
    //   76	83	129	finally
    //   91	124	129	finally
    //   126	129	129	finally
    //   131	133	129	finally
    //   145	168	129	finally
    //   168	170	129	finally
    //   197	222	129	finally
    //   224	277	129	finally
    //   33	41	136	finally
    //   133	136	136	finally
    //   59	66	195	org/xmlpull/v1/XmlPullParserException
    //   76	83	195	org/xmlpull/v1/XmlPullParserException
    //   91	124	195	org/xmlpull/v1/XmlPullParserException
    //   145	168	195	org/xmlpull/v1/XmlPullParserException
    //   59	66	222	java/io/IOException
    //   76	83	222	java/io/IOException
    //   91	124	222	java/io/IOException
    //   145	168	222	java/io/IOException
  }
  
  public final void b(Preference.a parama)
  {
    GMTrace.i(3231426019328L, 24076);
    this.wjv = parama;
    notifyDataSetChanged();
    GMTrace.o(3231426019328L, 24076);
  }
  
  public final void b(Preference paramPreference)
  {
    GMTrace.i(17513668673536L, 130487);
    b(paramPreference, -1);
    GMTrace.o(17513668673536L, 130487);
  }
  
  public final void bc(String paramString, boolean paramBoolean)
  {
    GMTrace.i(3230754930688L, 24071);
    if (paramBoolean) {
      if (!this.wkJ.contains(paramString)) {
        this.wkJ.add(paramString);
      }
    }
    while (this.wkJ.remove(paramString))
    {
      notifyDataSetChanged();
      GMTrace.o(3230754930688L, 24071);
      return;
      GMTrace.o(3230754930688L, 24071);
      return;
    }
    GMTrace.o(3230754930688L, 24071);
  }
  
  public final boolean c(Preference paramPreference)
  {
    GMTrace.i(3230889148416L, 24072);
    if (paramPreference == null)
    {
      GMTrace.o(3230889148416L, 24072);
      return false;
    }
    String str = e(paramPreference);
    this.wkH.remove(str);
    this.wkI.remove(str);
    this.wkJ.remove(paramPreference.hiu);
    notifyDataSetChanged();
    GMTrace.o(3230889148416L, 24072);
    return true;
  }
  
  public int getCount()
  {
    GMTrace.i(3232097107968L, 24081);
    int i = this.wkK.size();
    GMTrace.o(3232097107968L, 24081);
    return i;
  }
  
  public Object getItem(int paramInt)
  {
    GMTrace.i(3232231325696L, 24082);
    Object localObject = this.wkI.get(this.wkK.get(paramInt));
    GMTrace.o(3232231325696L, 24082);
    return localObject;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(3232365543424L, 24083);
    GMTrace.o(3232365543424L, 24083);
    return 0L;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(3232633978880L, 24085);
    if (paramInt > this.wkK.size())
    {
      GMTrace.o(3232633978880L, 24085);
      return -1;
    }
    Object localObject = (Preference)this.wkI.get(this.wkK.get(paramInt));
    localObject = (Integer)this.wkL.get(d((Preference)localObject));
    if (localObject == null)
    {
      GMTrace.o(3232633978880L, 24085);
      return -1;
    }
    paramInt = ((Integer)localObject).intValue();
    GMTrace.o(3232633978880L, 24085);
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3232768196608L, 24086);
    if (paramInt > this.wkK.size())
    {
      GMTrace.o(3232768196608L, 24086);
      return paramView;
    }
    Object localObject = (Preference)this.wkI.get(this.wkK.get(paramInt));
    if ((localObject instanceof CheckBoxPreference)) {
      ((Preference)localObject).a(this.wjv);
    }
    if (!this.wkL.containsKey(d((Preference)localObject))) {
      paramView = null;
    }
    paramView = ((Preference)localObject).getView(paramView, paramViewGroup);
    int i7 = this.wkN[paramInt];
    paramViewGroup = paramView.findViewById(a.g.content);
    if (paramViewGroup == null)
    {
      w.d("MicroMsg.MMPreferenceAdapter", "find content view error");
      GMTrace.o(3232768196608L, 24086);
      return paramView;
    }
    localObject = paramView.findViewById(16908312);
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int j;
    int i3;
    int i4;
    int i5;
    int i6;
    int i;
    if ((i7 & 0x4) == 0)
    {
      k = 0;
      m = paramViewGroup.getPaddingLeft();
      n = paramViewGroup.getPaddingRight();
      i1 = paramViewGroup.getPaddingTop();
      i2 = paramViewGroup.getPaddingBottom();
      j = a.f.gcJ;
      i3 = paramView.getPaddingLeft();
      i4 = paramView.getPaddingRight();
      i5 = paramView.getPaddingTop();
      i6 = paramView.getPaddingBottom();
      if ((i7 & 0x8) == 0) {
        break label345;
      }
      if ((paramInt != this.wkK.size() - 1) && ((paramInt != this.wkK.size() - 2) || (!(getItem(this.wkK.size() - 1) instanceof PreferenceCategory)))) {
        break label324;
      }
      paramInt = a.f.aXW;
      i = a.d.white;
    }
    for (;;)
    {
      paramViewGroup.setBackgroundResource(paramInt);
      paramViewGroup.setPadding(m, i1, n, i2);
      if (localObject != null) {
        ((View)localObject).setBackgroundResource(paramInt);
      }
      paramView.setBackgroundResource(i);
      paramView.setPadding(i3, i5, i4, i6);
      GMTrace.o(3232768196608L, 24086);
      return paramView;
      label324:
      if ((i7 & 0x2) != 0)
      {
        paramInt = a.f.aXW;
        break;
      }
      paramInt = a.f.aXC;
      break;
      label345:
      if ((i7 & 0x10) == 0)
      {
        i = j;
        paramInt = k;
        if ((i7 & 0x2) != 0) {}
      }
      else
      {
        paramInt = a.f.aXC;
        i = j;
      }
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(3232499761152L, 24084);
    if (!this.wkP) {
      this.wkP = true;
    }
    int i = Math.max(1, this.wkL.size());
    GMTrace.o(3232499761152L, 24084);
    return i;
  }
  
  public final int indexOf(String paramString)
  {
    GMTrace.i(3229949624320L, 24065);
    int i = this.wkH.indexOf(paramString);
    GMTrace.o(3229949624320L, 24065);
    return i;
  }
  
  public void notifyDataSetChanged()
  {
    int i = 0;
    GMTrace.i(3231828672512L, 24079);
    this.wkK.clear();
    Object localObject = this.wkH.iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!this.wkJ.contains(str)) {
        if (this.wkI.get(str) == null) {
          w.e("MicroMsg.MMPreferenceAdapter", "not found pref by key " + str);
        } else {
          this.wkK.add(str);
        }
      }
    }
    if ((!this.wkK.isEmpty()) && (Ct(((Preference)this.wkI.get(this.wkK.get(0))).getLayoutResource()))) {
      b(new PreferenceSmallCategory(this.context), 0);
    }
    cba();
    this.wkN = new int[this.wkK.size()];
    if (this.wkN.length <= 0)
    {
      GMTrace.o(3231828672512L, 24079);
      return;
    }
    if (this.wkN.length == 1)
    {
      i = ((Preference)this.wkI.get(this.wkK.get(0))).getLayoutResource();
      localObject = (Preference)this.wkI.get(this.wkK.get(0));
      if (Ct(i)) {
        if ((localObject instanceof CheckBoxPreference))
        {
          localObject = this.wkN;
          localObject[0] |= 0x8;
        }
      }
      for (;;)
      {
        a((Preference)this.wkI.get(this.wkK.get(0)), this.ghC);
        super.notifyDataSetChanged();
        GMTrace.o(3231828672512L, 24079);
        return;
        this.wkN[0] = 3;
        continue;
        this.wkN[0] = 4;
      }
    }
    if (i < this.wkK.size())
    {
      a((Preference)this.wkI.get(this.wkK.get(i)), this.ghC);
      localObject = (Preference)this.wkI.get(this.wkK.get(i));
      int j = ((Preference)localObject).getLayoutResource();
      if (Ct(j)) {
        if ((localObject instanceof CheckBoxPreference))
        {
          localObject = this.wkN;
          localObject[i] |= 0x8;
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (i == 0)
        {
          localObject = this.wkN;
          localObject[i] |= 0x1;
        }
        else
        {
          if (i == this.wkK.size() - 1)
          {
            localObject = this.wkN;
            localObject[i] |= 0x2;
          }
          j = ((Preference)this.wkI.get(this.wkK.get(i - 1))).getLayoutResource();
          if ((j != a.h.cBA) || (j == a.h.gfD) || (j == a.h.gfF))
          {
            localObject = this.wkN;
            localObject[i] |= 0x1;
            continue;
            if (j == a.h.cCc)
            {
              if (i == 0)
              {
                localObject = this.wkN;
                localObject[i] |= 0x4;
              }
              else
              {
                localObject = this.wkN;
                localObject[i] |= 0x10;
                j = ((Preference)this.wkI.get(this.wkK.get(i - 1))).getLayoutResource();
                if ((j == a.h.cBA) || (j == a.h.gfD) || (j == a.h.gfF))
                {
                  localObject = this.wkN;
                  j = i - 1;
                  localObject[j] |= 0x2;
                }
              }
            }
            else
            {
              localObject = this.wkN;
              localObject[i] |= 0x4;
              if (i != 0)
              {
                j = ((Preference)this.wkI.get(this.wkK.get(i - 1))).getLayoutResource();
                if ((Ct(j)) || (j == a.h.cCc))
                {
                  localObject = this.wkN;
                  j = i - 1;
                  localObject[j] |= 0x2;
                }
              }
            }
          }
        }
      }
    }
    super.notifyDataSetChanged();
    GMTrace.o(3231828672512L, 24079);
  }
  
  public final void removeAll()
  {
    GMTrace.i(3231157583872L, 24074);
    this.wkK.clear();
    this.wkI.clear();
    this.wkH.clear();
    this.wkJ.clear();
    notifyDataSetChanged();
    GMTrace.o(3231157583872L, 24074);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\preference\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */