package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

class d
  extends DataSetObservable
{
  private static final String Dj = d.class.getSimpleName();
  private static final Object Nf = new Object();
  private static final Map<String, d> Ng = new HashMap();
  private Intent Jt;
  final Object Nh;
  final List<a> Ni;
  private final List<c> Nj;
  private final String Nk;
  private b Nl;
  private int Nm;
  private boolean Nn;
  private boolean No;
  private boolean Np;
  private boolean Nq;
  private d Nr;
  private final Context mContext;
  
  private boolean eh()
  {
    if ((this.Nl != null) && (this.Jt != null) && (!this.Ni.isEmpty()) && (!this.Nj.isEmpty()))
    {
      Collections.unmodifiableList(this.Nj);
      return true;
    }
    return false;
  }
  
  private void ei()
  {
    int j = this.Nj.size() - this.Nm;
    if (j <= 0) {}
    for (;;)
    {
      return;
      this.Np = true;
      int i = 0;
      while (i < j)
      {
        this.Nj.remove(0);
        i += 1;
      }
    }
  }
  
  /* Error */
  private void ej()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 74	android/support/v7/widget/d:mContext	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 77	android/support/v7/widget/d:Nk	Ljava/lang/String;
    //   8: invokevirtual 127	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 133	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore_3
    //   16: aload_3
    //   17: aload_2
    //   18: ldc -121
    //   20: invokeinterface 141 3 0
    //   25: iconst_0
    //   26: istore_1
    //   27: iload_1
    //   28: iconst_1
    //   29: if_icmpeq +18 -> 47
    //   32: iload_1
    //   33: iconst_2
    //   34: if_icmpeq +13 -> 47
    //   37: aload_3
    //   38: invokeinterface 144 1 0
    //   43: istore_1
    //   44: goto -17 -> 27
    //   47: ldc -110
    //   49: aload_3
    //   50: invokeinterface 149 1 0
    //   55: invokevirtual 155	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne +40 -> 98
    //   61: new 119	org/xmlpull/v1/XmlPullParserException
    //   64: dup
    //   65: ldc -99
    //   67: invokespecial 160	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_3
    //   72: new 162	java/lang/StringBuilder
    //   75: dup
    //   76: ldc -92
    //   78: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield 77	android/support/v7/widget/d:Nk	Ljava/lang/String;
    //   85: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_2
    //   90: ifnull +7 -> 97
    //   93: aload_2
    //   94: invokevirtual 174	java/io/FileInputStream:close	()V
    //   97: return
    //   98: aload_0
    //   99: getfield 95	android/support/v7/widget/d:Nj	Ljava/util/List;
    //   102: astore 4
    //   104: aload 4
    //   106: invokeinterface 177 1 0
    //   111: aload_3
    //   112: invokeinterface 144 1 0
    //   117: istore_1
    //   118: iload_1
    //   119: iconst_1
    //   120: if_icmpeq +128 -> 248
    //   123: iload_1
    //   124: iconst_3
    //   125: if_icmpeq -14 -> 111
    //   128: iload_1
    //   129: iconst_4
    //   130: if_icmpeq -19 -> 111
    //   133: ldc -77
    //   135: aload_3
    //   136: invokeinterface 149 1 0
    //   141: invokevirtual 155	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifne +42 -> 186
    //   147: new 119	org/xmlpull/v1/XmlPullParserException
    //   150: dup
    //   151: ldc -75
    //   153: invokespecial 160	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   156: athrow
    //   157: astore_3
    //   158: new 162	java/lang/StringBuilder
    //   161: dup
    //   162: ldc -92
    //   164: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_0
    //   168: getfield 77	android/support/v7/widget/d:Nk	Ljava/lang/String;
    //   171: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_2
    //   176: ifnull -79 -> 97
    //   179: aload_2
    //   180: invokevirtual 174	java/io/FileInputStream:close	()V
    //   183: return
    //   184: astore_2
    //   185: return
    //   186: aload 4
    //   188: new 12	android/support/v7/widget/d$c
    //   191: dup
    //   192: aload_3
    //   193: aconst_null
    //   194: ldc -73
    //   196: invokeinterface 187 3 0
    //   201: aload_3
    //   202: aconst_null
    //   203: ldc -67
    //   205: invokeinterface 187 3 0
    //   210: invokestatic 195	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   213: aload_3
    //   214: aconst_null
    //   215: ldc -59
    //   217: invokeinterface 187 3 0
    //   222: invokestatic 203	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   225: invokespecial 206	android/support/v7/widget/d$c:<init>	(Ljava/lang/String;JF)V
    //   228: invokeinterface 209 2 0
    //   233: pop
    //   234: goto -123 -> 111
    //   237: astore_3
    //   238: aload_2
    //   239: ifnull +7 -> 246
    //   242: aload_2
    //   243: invokevirtual 174	java/io/FileInputStream:close	()V
    //   246: aload_3
    //   247: athrow
    //   248: aload_2
    //   249: ifnull -152 -> 97
    //   252: aload_2
    //   253: invokevirtual 174	java/io/FileInputStream:close	()V
    //   256: return
    //   257: astore_2
    //   258: return
    //   259: astore_2
    //   260: return
    //   261: astore_2
    //   262: goto -16 -> 246
    //   265: astore_2
    //   266: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	d
    //   26	105	1	i	int
    //   11	169	2	localFileInputStream	java.io.FileInputStream
    //   184	69	2	localIOException1	IOException
    //   257	1	2	localIOException2	IOException
    //   259	1	2	localIOException3	IOException
    //   261	1	2	localIOException4	IOException
    //   265	1	2	localFileNotFoundException	FileNotFoundException
    //   15	35	3	localXmlPullParser	org.xmlpull.v1.XmlPullParser
    //   71	65	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   157	57	3	localIOException5	IOException
    //   237	10	3	localObject	Object
    //   102	85	4	localList	List
    // Exception table:
    //   from	to	target	type
    //   12	25	71	org/xmlpull/v1/XmlPullParserException
    //   37	44	71	org/xmlpull/v1/XmlPullParserException
    //   47	71	71	org/xmlpull/v1/XmlPullParserException
    //   98	111	71	org/xmlpull/v1/XmlPullParserException
    //   111	118	71	org/xmlpull/v1/XmlPullParserException
    //   133	157	71	org/xmlpull/v1/XmlPullParserException
    //   186	234	71	org/xmlpull/v1/XmlPullParserException
    //   12	25	157	java/io/IOException
    //   37	44	157	java/io/IOException
    //   47	71	157	java/io/IOException
    //   98	111	157	java/io/IOException
    //   111	118	157	java/io/IOException
    //   133	157	157	java/io/IOException
    //   186	234	157	java/io/IOException
    //   179	183	184	java/io/IOException
    //   12	25	237	finally
    //   37	44	237	finally
    //   47	71	237	finally
    //   72	89	237	finally
    //   98	111	237	finally
    //   111	118	237	finally
    //   133	157	237	finally
    //   158	175	237	finally
    //   186	234	237	finally
    //   252	256	257	java/io/IOException
    //   93	97	259	java/io/IOException
    //   242	246	261	java/io/IOException
    //   0	12	265	java/io/FileNotFoundException
  }
  
  public final int a(ResolveInfo paramResolveInfo)
  {
    for (;;)
    {
      int i;
      synchronized (this.Nh)
      {
        eg();
        List localList = this.Ni;
        int j = localList.size();
        i = 0;
        if (i < j)
        {
          if (((a)localList.get(i)).resolveInfo == paramResolveInfo) {
            return i;
          }
        }
        else {
          return -1;
        }
      }
      i += 1;
    }
  }
  
  final boolean a(c paramc)
  {
    boolean bool = this.Nj.add(paramc);
    Object[] arrayOfObject;
    if (bool)
    {
      this.Np = true;
      ei();
      if (!this.No) {
        throw new IllegalStateException("No preceding call to #readHistoricalData");
      }
      if (this.Np)
      {
        this.Np = false;
        if (!TextUtils.isEmpty(this.Nk))
        {
          paramc = new e((byte)0);
          arrayOfObject = new Object[2];
          arrayOfObject[0] = new ArrayList(this.Nj);
          arrayOfObject[1] = this.Nk;
          if (Build.VERSION.SDK_INT < 11) {
            break label127;
          }
          paramc.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, arrayOfObject);
        }
      }
    }
    for (;;)
    {
      eh();
      notifyChanged();
      return bool;
      label127:
      paramc.execute(arrayOfObject);
    }
  }
  
  public final ResolveInfo aC(int paramInt)
  {
    synchronized (this.Nh)
    {
      eg();
      ResolveInfo localResolveInfo = ((a)this.Ni.get(paramInt)).resolveInfo;
      return localResolveInfo;
    }
  }
  
  public final Intent aD(int paramInt)
  {
    synchronized (this.Nh)
    {
      if (this.Jt == null) {
        return null;
      }
      eg();
      Object localObject2 = (a)this.Ni.get(paramInt);
      localObject2 = new ComponentName(((a)localObject2).resolveInfo.activityInfo.packageName, ((a)localObject2).resolveInfo.activityInfo.name);
      Intent localIntent = new Intent(this.Jt);
      localIntent.setComponent((ComponentName)localObject2);
      if (this.Nr != null)
      {
        new Intent(localIntent);
        if (this.Nr.el()) {
          return null;
        }
      }
      a(new c((ComponentName)localObject2, System.currentTimeMillis(), 1.0F));
      return localIntent;
    }
  }
  
  public final int ee()
  {
    synchronized (this.Nh)
    {
      eg();
      int i = this.Ni.size();
      return i;
    }
  }
  
  public final ResolveInfo ef()
  {
    synchronized (this.Nh)
    {
      eg();
      if (!this.Ni.isEmpty())
      {
        ResolveInfo localResolveInfo = ((a)this.Ni.get(0)).resolveInfo;
        return localResolveInfo;
      }
      return null;
    }
  }
  
  final void eg()
  {
    int j = 1;
    int i;
    if ((this.Nq) && (this.Jt != null))
    {
      this.Nq = false;
      this.Ni.clear();
      List localList = this.mContext.getPackageManager().queryIntentActivities(this.Jt, 0);
      int k = localList.size();
      i = 0;
      while (i < k)
      {
        ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i);
        this.Ni.add(new a(localResolveInfo));
        i += 1;
      }
      i = 1;
      if ((!this.Nn) || (!this.Np) || (TextUtils.isEmpty(this.Nk))) {
        break label167;
      }
      this.Nn = false;
      this.No = true;
      ej();
    }
    for (;;)
    {
      ei();
      if ((i | j) != 0)
      {
        eh();
        notifyChanged();
      }
      return;
      i = 0;
      break;
      label167:
      j = 0;
    }
  }
  
  public final int getHistorySize()
  {
    synchronized (this.Nh)
    {
      eg();
      int i = this.Nj.size();
      return i;
    }
  }
  
  public final class a
    implements Comparable<a>
  {
    public final ResolveInfo resolveInfo;
    public float weight;
    
    public a(ResolveInfo paramResolveInfo)
    {
      this.resolveInfo = paramResolveInfo;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (a)paramObject;
      } while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(((a)paramObject).weight));
      return false;
    }
    
    public final int hashCode()
    {
      return Float.floatToIntBits(this.weight) + 31;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("resolveInfo:").append(this.resolveInfo.toString());
      localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface b {}
  
  public static final class c
  {
    public final ComponentName Nt;
    public final long time;
    public final float weight;
    
    public c(ComponentName paramComponentName, long paramLong, float paramFloat)
    {
      this.Nt = paramComponentName;
      this.time = paramLong;
      this.weight = paramFloat;
    }
    
    public c(String paramString, long paramLong, float paramFloat)
    {
      this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (c)paramObject;
        if (this.Nt == null)
        {
          if (((c)paramObject).Nt != null) {
            return false;
          }
        }
        else if (!this.Nt.equals(((c)paramObject).Nt)) {
          return false;
        }
        if (this.time != ((c)paramObject).time) {
          return false;
        }
      } while (Float.floatToIntBits(this.weight) == Float.floatToIntBits(((c)paramObject).weight));
      return false;
    }
    
    public final int hashCode()
    {
      if (this.Nt == null) {}
      for (int i = 0;; i = this.Nt.hashCode()) {
        return ((i + 31) * 31 + (int)(this.time ^ this.time >>> 32)) * 31 + Float.floatToIntBits(this.weight);
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("[");
      localStringBuilder.append("; activity:").append(this.Nt);
      localStringBuilder.append("; time:").append(this.time);
      localStringBuilder.append("; weight:").append(new BigDecimal(this.weight));
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean el();
  }
  
  private final class e
    extends AsyncTask<Object, Void, Void>
  {
    private e() {}
    
    private Void b(Object... paramVarArgs)
    {
      int i = 0;
      List localList = (List)paramVarArgs[0];
      paramVarArgs = (String)paramVarArgs[1];
      for (;;)
      {
        try
        {
          paramVarArgs = d.a(d.this).openFileOutput(paramVarArgs, 0);
          localXmlSerializer = Xml.newSerializer();
          int j;
          d.c localc;
          localXmlSerializer.endTag(null, "historical-records");
        }
        catch (FileNotFoundException paramVarArgs)
        {
          try
          {
            localXmlSerializer.setOutput(paramVarArgs, null);
            localXmlSerializer.startDocument("UTF-8", Boolean.valueOf(true));
            localXmlSerializer.startTag(null, "historical-records");
            j = localList.size();
            if (i >= j) {
              break label187;
            }
            localc = (d.c)localList.remove(0);
            localXmlSerializer.startTag(null, "historical-record");
            localXmlSerializer.attribute(null, "activity", localc.Nt.flattenToString());
            localXmlSerializer.attribute(null, "time", String.valueOf(localc.time));
            localXmlSerializer.attribute(null, "weight", String.valueOf(localc.weight));
            localXmlSerializer.endTag(null, "historical-record");
            i += 1;
            continue;
            paramVarArgs = paramVarArgs;
            d.ek();
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            XmlSerializer localXmlSerializer;
            d.ek();
            new StringBuilder("Error writing historical recrod file: ").append(d.b(d.this));
            d.c(d.this);
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          catch (IllegalStateException localIllegalStateException)
          {
            d.ek();
            new StringBuilder("Error writing historical recrod file: ").append(d.b(d.this));
            d.c(d.this);
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          catch (IOException localIOException)
          {
            d.ek();
            new StringBuilder("Error writing historical recrod file: ").append(d.b(d.this));
            d.c(d.this);
            if (paramVarArgs == null) {
              continue;
            }
            try
            {
              paramVarArgs.close();
              return null;
            }
            catch (IOException paramVarArgs)
            {
              return null;
            }
          }
          finally
          {
            d.c(d.this);
            if (paramVarArgs == null) {
              break label385;
            }
          }
          return null;
        }
        label187:
        localXmlSerializer.endDocument();
        d.c(d.this);
        if (paramVarArgs != null) {
          try
          {
            paramVarArgs.close();
            return null;
          }
          catch (IOException paramVarArgs)
          {
            return null;
          }
        }
      }
      try
      {
        paramVarArgs.close();
        label385:
        throw ((Throwable)localObject);
      }
      catch (IOException paramVarArgs)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v7\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */