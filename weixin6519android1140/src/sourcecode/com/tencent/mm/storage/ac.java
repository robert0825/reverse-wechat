package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.rv;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ac
  extends i<z>
  implements f.a
{
  public static final String[] fTX;
  private e fTZ;
  private HashMap<String, int[]> vAb;
  public HashMap<Integer, ArrayList<String>> vAc;
  
  static
  {
    GMTrace.i(1575447691264L, 11738);
    fTX = new String[] { i.a(z.fTp, "ContactLabel") };
    GMTrace.o(1575447691264L, 11738);
  }
  
  public ac(e parame)
  {
    this(parame, z.fTp, "ContactLabel");
    GMTrace.i(1571152723968L, 11706);
    GMTrace.o(1571152723968L, 11706);
  }
  
  private ac(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1571286941696L, 11707);
    this.vAb = null;
    this.vAc = null;
    this.fTZ = parame;
    parame.eZ("ContactLabel", "CREATE INDEX IF NOT EXISTS  contact_label_createtime_index ON ContactLabel ( createTime )");
    GMTrace.o(1571286941696L, 11707);
  }
  
  private static String a(String paramString, z paramz)
  {
    GMTrace.i(1574239731712L, 11729);
    if (paramz != null)
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramz);
      paramString = o(paramString, localArrayList);
      GMTrace.o(1574239731712L, 11729);
      return paramString;
    }
    GMTrace.o(1574239731712L, 11729);
    return null;
  }
  
  private boolean a(boolean paramBoolean, z paramz)
  {
    GMTrace.i(1572629118976L, 11717);
    boolean bool = super.b(paramz);
    if ((bool) && (paramBoolean)) {
      SS(a("insert", paramz));
    }
    GMTrace.o(1572629118976L, 11717);
    return bool;
  }
  
  private int b(z paramz)
  {
    GMTrace.i(1573971296256L, 11727);
    localObject2 = null;
    localObject1 = null;
    Object localObject3 = paramz.field_labelID;
    try
    {
      localObject3 = this.fTZ.a("select * from ContactLabel where labelID=?", new String[] { localObject3 }, 2);
      if (localObject3 != null)
      {
        localObject1 = localObject3;
        localObject2 = localObject3;
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject1 = localObject3;
          localObject2 = localObject3;
          String str = bg.aq(((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndex("labelName")), "");
          localObject1 = localObject3;
          localObject2 = localObject3;
          if (paramz.field_labelName.equalsIgnoreCase(str))
          {
            localObject1 = localObject3;
            localObject2 = localObject3;
            i = a.vAe;
            if (localObject3 != null) {
              ((Cursor)localObject3).close();
            }
            GMTrace.o(1573971296256L, 11727);
            return i;
          }
          localObject1 = localObject3;
          localObject2 = localObject3;
          i = a.vAf;
          if (localObject3 != null) {
            ((Cursor)localObject3).close();
          }
          GMTrace.o(1573971296256L, 11727);
          return i;
        }
      }
    }
    catch (Exception paramz)
    {
      for (;;)
      {
        int i;
        localObject2 = localObject1;
        w.w("MicroMsg.Label.ContactLabelStorage", "cpan[checkEqualsName] exception %s", new Object[] { paramz.toString() });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject2 == null) {
        break label270;
      }
      ((Cursor)localObject2).close();
    }
    i = a.vAg;
    GMTrace.o(1573971296256L, 11727);
    return i;
  }
  
  private static void bSJ()
  {
    GMTrace.i(1574508167168L, 11731);
    w.i("MicroMsg.Label.ContactLabelStorage", "cpan[publishUpdateSearchIndexEvent]");
    rv localrv = new rv();
    localrv.eWF.eCX = 3000L;
    com.tencent.mm.sdk.b.a.vgX.m(localrv);
    GMTrace.o(1574508167168L, 11731);
  }
  
  private String c(z paramz)
  {
    GMTrace.i(1574105513984L, 11728);
    localObject2 = null;
    localObject1 = null;
    Object localObject3 = paramz.field_labelName;
    try
    {
      localObject3 = this.fTZ.a("select * from ContactLabel where labelName=? and isTemporary =?", new String[] { localObject3, "1" }, 2);
      if (localObject3 != null)
      {
        localObject1 = localObject3;
        localObject2 = localObject3;
        if (((Cursor)localObject3).moveToFirst())
        {
          localObject1 = localObject3;
          localObject2 = localObject3;
          String str = bg.aq(((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndex("labelName")), "");
          localObject1 = localObject3;
          localObject2 = localObject3;
          boolean bool = paramz.field_labelName.equalsIgnoreCase(str);
          localObject1 = localObject3;
          localObject2 = localObject3;
          w.i("MicroMsg.Label.ContactLabelStorage", "cpan[checkEqualsName] itemname:%s dbname:%s", new Object[] { paramz.field_labelName, str });
          if (bool)
          {
            localObject1 = localObject3;
            localObject2 = localObject3;
            paramz = ((Cursor)localObject3).getString(((Cursor)localObject3).getColumnIndex("labelID"));
            if (localObject3 != null) {
              ((Cursor)localObject3).close();
            }
            GMTrace.o(1574105513984L, 11728);
            return paramz;
          }
        }
      }
    }
    catch (Exception paramz)
    {
      for (;;)
      {
        localObject2 = localObject1;
        w.w("MicroMsg.Label.ContactLabelStorage", "cpan[checkEqualsName] exception %s", new Object[] { paramz.toString() });
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      if (localObject2 == null) {
        break label295;
      }
      ((Cursor)localObject2).close();
    }
    GMTrace.o(1574105513984L, 11728);
    return null;
  }
  
  private static String o(String paramString, List<z> paramList)
  {
    GMTrace.i(1574373949440L, 11730);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" ");
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        paramString = (z)paramList.get(i);
        if (paramString != null)
        {
          localStringBuilder.append(paramString.field_labelID);
          if (i < j - 1) {
            localStringBuilder.append(" ");
          }
        }
        i += 1;
      }
      w.i("MicroMsg.Label.ContactLabelStorage", "cpan[genNotifyString] event:%s", new Object[] { localStringBuilder.toString() });
      paramString = localStringBuilder.toString();
      GMTrace.o(1574373949440L, 11730);
      return paramString;
    }
    GMTrace.o(1574373949440L, 11730);
    return null;
  }
  
  /* Error */
  public final String AU(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 258
    //   3: sipush 11723
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc 41
    //   15: iconst_1
    //   16: anewarray 33	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc -116
    //   23: aastore
    //   24: ldc_w 261
    //   27: iconst_1
    //   28: anewarray 33	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: aload_1
    //   34: aastore
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: iconst_2
    //   39: invokeinterface 264 9 0
    //   44: astore_2
    //   45: aload_2
    //   46: ifnull +70 -> 116
    //   49: aload_2
    //   50: astore_1
    //   51: aload_2
    //   52: invokeinterface 138 1 0
    //   57: ifeq +59 -> 116
    //   60: aload_2
    //   61: astore_1
    //   62: aload_2
    //   63: aload_2
    //   64: ldc -116
    //   66: invokeinterface 144 2 0
    //   71: invokeinterface 148 2 0
    //   76: astore_3
    //   77: aload_2
    //   78: astore_1
    //   79: ldc -78
    //   81: ldc_w 266
    //   84: iconst_1
    //   85: anewarray 182	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_3
    //   91: aastore
    //   92: invokestatic 237	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 170 1 0
    //   105: ldc2_w 258
    //   108: sipush 11723
    //   111: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: aload_3
    //   115: areturn
    //   116: aload_2
    //   117: ifnull +9 -> 126
    //   120: aload_2
    //   121: invokeinterface 170 1 0
    //   126: ldc2_w 258
    //   129: sipush 11723
    //   132: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   135: aconst_null
    //   136: areturn
    //   137: astore_3
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_2
    //   141: astore_1
    //   142: ldc -78
    //   144: ldc_w 268
    //   147: iconst_1
    //   148: anewarray 182	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_3
    //   154: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_2
    //   162: ifnull -36 -> 126
    //   165: aload_2
    //   166: invokeinterface 170 1 0
    //   171: goto -45 -> 126
    //   174: astore_2
    //   175: aconst_null
    //   176: astore_1
    //   177: aload_1
    //   178: ifnull +9 -> 187
    //   181: aload_1
    //   182: invokeinterface 170 1 0
    //   187: aload_2
    //   188: athrow
    //   189: astore_2
    //   190: goto -13 -> 177
    //   193: astore_3
    //   194: goto -54 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	ac
    //   0	197	1	paramString	String
    //   44	122	2	localCursor	Cursor
    //   174	14	2	localObject1	Object
    //   189	1	2	localObject2	Object
    //   76	39	3	str	String
    //   137	17	3	localException1	Exception
    //   193	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	45	137	java/lang/Exception
    //   9	45	174	finally
    //   51	60	189	finally
    //   62	77	189	finally
    //   79	95	189	finally
    //   142	161	189	finally
    //   51	60	193	java/lang/Exception
    //   62	77	193	java/lang/Exception
    //   79	95	193	java/lang/Exception
  }
  
  /* Error */
  public final String AV(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 270
    //   3: sipush 11724
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   13: ldc 41
    //   15: iconst_1
    //   16: anewarray 33	java/lang/String
    //   19: dup
    //   20: iconst_0
    //   21: ldc -17
    //   23: aastore
    //   24: ldc_w 273
    //   27: iconst_1
    //   28: anewarray 33	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: aload_1
    //   34: aastore
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: iconst_2
    //   39: invokeinterface 264 9 0
    //   44: astore_2
    //   45: aload_2
    //   46: ifnull +70 -> 116
    //   49: aload_2
    //   50: astore_1
    //   51: aload_2
    //   52: invokeinterface 138 1 0
    //   57: ifeq +59 -> 116
    //   60: aload_2
    //   61: astore_1
    //   62: aload_2
    //   63: aload_2
    //   64: ldc -17
    //   66: invokeinterface 144 2 0
    //   71: invokeinterface 148 2 0
    //   76: astore_3
    //   77: aload_2
    //   78: astore_1
    //   79: ldc -78
    //   81: ldc_w 275
    //   84: iconst_1
    //   85: anewarray 182	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_3
    //   91: aastore
    //   92: invokestatic 237	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_2
    //   96: ifnull +9 -> 105
    //   99: aload_2
    //   100: invokeinterface 170 1 0
    //   105: ldc2_w 270
    //   108: sipush 11724
    //   111: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: aload_3
    //   115: areturn
    //   116: aload_2
    //   117: ifnull +9 -> 126
    //   120: aload_2
    //   121: invokeinterface 170 1 0
    //   126: ldc2_w 270
    //   129: sipush 11724
    //   132: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   135: aconst_null
    //   136: areturn
    //   137: astore_3
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_2
    //   141: astore_1
    //   142: ldc -78
    //   144: ldc_w 277
    //   147: iconst_1
    //   148: anewarray 182	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_3
    //   154: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_2
    //   162: ifnull -36 -> 126
    //   165: aload_2
    //   166: invokeinterface 170 1 0
    //   171: goto -45 -> 126
    //   174: astore_2
    //   175: aconst_null
    //   176: astore_1
    //   177: aload_1
    //   178: ifnull +9 -> 187
    //   181: aload_1
    //   182: invokeinterface 170 1 0
    //   187: aload_2
    //   188: athrow
    //   189: astore_2
    //   190: goto -13 -> 177
    //   193: astore_3
    //   194: goto -54 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	ac
    //   0	197	1	paramString	String
    //   44	122	2	localCursor	Cursor
    //   174	14	2	localObject1	Object
    //   189	1	2	localObject2	Object
    //   76	39	3	str	String
    //   137	17	3	localException1	Exception
    //   193	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	45	137	java/lang/Exception
    //   9	45	174	finally
    //   51	60	189	finally
    //   62	77	189	finally
    //   79	95	189	finally
    //   142	161	189	finally
    //   51	60	193	java/lang/Exception
    //   62	77	193	java/lang/Exception
    //   79	95	193	java/lang/Exception
  }
  
  /* Error */
  public final ArrayList<String> F(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: ldc2_w 280
    //   3: sipush 11715
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnull +8 -> 18
    //   13: aload_1
    //   14: arraylength
    //   15: ifgt +14 -> 29
    //   18: ldc2_w 280
    //   21: sipush 11715
    //   24: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aconst_null
    //   28: areturn
    //   29: aload_1
    //   30: arraylength
    //   31: istore_3
    //   32: new 114	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   39: astore 4
    //   41: aload 4
    //   43: ldc_w 283
    //   46: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: aload 4
    //   52: ldc_w 285
    //   55: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: iconst_0
    //   60: istore_2
    //   61: iload_2
    //   62: iload_3
    //   63: if_icmpge +57 -> 120
    //   66: aload 4
    //   68: new 114	java/lang/StringBuilder
    //   71: dup
    //   72: ldc_w 287
    //   75: invokespecial 289	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: aload_1
    //   79: iload_2
    //   80: aaload
    //   81: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: ldc_w 287
    //   87: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: iload_2
    //   98: iload_3
    //   99: iconst_1
    //   100: isub
    //   101: if_icmpge +12 -> 113
    //   104: aload 4
    //   106: ldc_w 291
    //   109: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: iload_2
    //   114: iconst_1
    //   115: iadd
    //   116: istore_2
    //   117: goto -56 -> 61
    //   120: aload 4
    //   122: ldc_w 293
    //   125: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload 4
    //   131: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: astore_1
    //   135: ldc -78
    //   137: ldc_w 295
    //   140: iconst_1
    //   141: anewarray 182	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_1
    //   147: aastore
    //   148: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   155: aload_1
    //   156: aconst_null
    //   157: iconst_2
    //   158: invokeinterface 132 4 0
    //   163: astore 4
    //   165: aload 4
    //   167: astore_1
    //   168: aload 4
    //   170: ldc -116
    //   172: invokeinterface 144 2 0
    //   177: istore_2
    //   178: aload 4
    //   180: astore_1
    //   181: aload 4
    //   183: invokeinterface 138 1 0
    //   188: ifeq +95 -> 283
    //   191: aload 4
    //   193: astore_1
    //   194: new 81	java/util/ArrayList
    //   197: dup
    //   198: invokespecial 83	java/util/ArrayList:<init>	()V
    //   201: astore 5
    //   203: aload 4
    //   205: astore_1
    //   206: aload 5
    //   208: aload 4
    //   210: iload_2
    //   211: invokeinterface 148 2 0
    //   216: invokevirtual 299	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   219: pop
    //   220: aload 4
    //   222: astore_1
    //   223: aload 4
    //   225: invokeinterface 302 1 0
    //   230: ifne -27 -> 203
    //   233: aload 4
    //   235: astore_1
    //   236: ldc -78
    //   238: ldc_w 304
    //   241: iconst_1
    //   242: anewarray 182	java/lang/Object
    //   245: dup
    //   246: iconst_0
    //   247: aload 5
    //   249: invokevirtual 305	java/util/ArrayList:size	()I
    //   252: invokestatic 311	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   255: aastore
    //   256: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: aload 4
    //   261: ifnull +10 -> 271
    //   264: aload 4
    //   266: invokeinterface 170 1 0
    //   271: ldc2_w 280
    //   274: sipush 11715
    //   277: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   280: aload 5
    //   282: areturn
    //   283: aload 4
    //   285: ifnull +10 -> 295
    //   288: aload 4
    //   290: invokeinterface 170 1 0
    //   295: ldc2_w 280
    //   298: sipush 11715
    //   301: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   304: aconst_null
    //   305: areturn
    //   306: astore 5
    //   308: aconst_null
    //   309: astore 4
    //   311: aload 4
    //   313: astore_1
    //   314: ldc -78
    //   316: ldc_w 313
    //   319: iconst_1
    //   320: anewarray 182	java/lang/Object
    //   323: dup
    //   324: iconst_0
    //   325: aload 5
    //   327: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   330: aastore
    //   331: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   334: aload 4
    //   336: ifnull -41 -> 295
    //   339: aload 4
    //   341: invokeinterface 170 1 0
    //   346: goto -51 -> 295
    //   349: astore 4
    //   351: aconst_null
    //   352: astore_1
    //   353: aload_1
    //   354: ifnull +9 -> 363
    //   357: aload_1
    //   358: invokeinterface 170 1 0
    //   363: aload 4
    //   365: athrow
    //   366: astore 4
    //   368: goto -15 -> 353
    //   371: astore 5
    //   373: goto -62 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	376	0	this	ac
    //   0	376	1	paramArrayOfString	String[]
    //   60	151	2	i	int
    //   31	70	3	j	int
    //   39	301	4	localObject1	Object
    //   349	15	4	localObject2	Object
    //   366	1	4	localObject3	Object
    //   201	80	5	localArrayList	ArrayList
    //   306	20	5	localException1	Exception
    //   371	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   151	165	306	java/lang/Exception
    //   151	165	349	finally
    //   168	178	366	finally
    //   181	191	366	finally
    //   194	203	366	finally
    //   206	220	366	finally
    //   223	233	366	finally
    //   236	259	366	finally
    //   314	334	366	finally
    //   168	178	371	java/lang/Exception
    //   181	191	371	java/lang/Exception
    //   194	203	371	java/lang/Exception
    //   206	220	371	java/lang/Exception
    //   223	233	371	java/lang/Exception
    //   236	259	371	java/lang/Exception
  }
  
  public final ArrayList<String> Tu(String paramString)
  {
    int i = -1;
    GMTrace.i(1572092248064L, 11713);
    long l = bg.Pv();
    int j = bg.getInt(paramString, -1);
    if (j == -1)
    {
      w.e("MicroMsg.Label.ContactLabelStorage", "getUserNameListById  failed id:%s", new Object[] { paramString });
      GMTrace.o(1572092248064L, 11713);
      return null;
    }
    bSI();
    ArrayList localArrayList = (ArrayList)this.vAc.get(Integer.valueOf(j));
    l = bg.aH(l);
    if (localArrayList == null) {}
    for (;;)
    {
      w.i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById time:%s id:%s count:%s stack:%s", new Object[] { Long.valueOf(l), paramString, Integer.valueOf(i), bg.bQW() });
      GMTrace.o(1572092248064L, 11713);
      return localArrayList;
      i = localArrayList.size();
    }
  }
  
  /* Error */
  public final z Tv(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 358
    //   5: sipush 11725
    //   8: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   15: ldc 41
    //   17: bipush 6
    //   19: anewarray 33	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc -17
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc_w 361
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: ldc_w 363
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: ldc -116
    //   43: aastore
    //   44: dup
    //   45: iconst_4
    //   46: ldc_w 365
    //   49: aastore
    //   50: dup
    //   51: iconst_5
    //   52: ldc_w 367
    //   55: aastore
    //   56: ldc_w 273
    //   59: iconst_1
    //   60: anewarray 33	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: aastore
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: iconst_2
    //   71: invokeinterface 264 9 0
    //   76: astore_1
    //   77: aload_1
    //   78: astore_2
    //   79: aload_2
    //   80: ifnull +52 -> 132
    //   83: aload_2
    //   84: astore_1
    //   85: aload_2
    //   86: invokeinterface 138 1 0
    //   91: ifeq +41 -> 132
    //   94: aload_2
    //   95: astore_1
    //   96: new 35	com/tencent/mm/storage/z
    //   99: dup
    //   100: invokespecial 368	com/tencent/mm/storage/z:<init>	()V
    //   103: astore_3
    //   104: aload_2
    //   105: astore_1
    //   106: aload_3
    //   107: aload_2
    //   108: invokevirtual 371	com/tencent/mm/storage/z:b	(Landroid/database/Cursor;)V
    //   111: aload_2
    //   112: ifnull +9 -> 121
    //   115: aload_2
    //   116: invokeinterface 170 1 0
    //   121: ldc2_w 358
    //   124: sipush 11725
    //   127: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   130: aload_3
    //   131: areturn
    //   132: aload_2
    //   133: ifnull +9 -> 142
    //   136: aload_2
    //   137: invokeinterface 170 1 0
    //   142: ldc2_w 358
    //   145: sipush 11725
    //   148: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   151: aconst_null
    //   152: areturn
    //   153: astore_3
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_2
    //   157: astore_1
    //   158: ldc -78
    //   160: ldc_w 277
    //   163: iconst_1
    //   164: anewarray 182	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_3
    //   170: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   173: aastore
    //   174: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload_2
    //   178: ifnull -36 -> 142
    //   181: aload_2
    //   182: invokeinterface 170 1 0
    //   187: goto -45 -> 142
    //   190: astore_1
    //   191: aload_2
    //   192: ifnull +9 -> 201
    //   195: aload_2
    //   196: invokeinterface 170 1 0
    //   201: aload_1
    //   202: athrow
    //   203: astore_3
    //   204: aload_1
    //   205: astore_2
    //   206: aload_3
    //   207: astore_1
    //   208: goto -17 -> 191
    //   211: astore_3
    //   212: goto -56 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	this	ac
    //   0	215	1	paramString	String
    //   1	205	2	str	String
    //   103	28	3	localz	z
    //   153	17	3	localException1	Exception
    //   203	4	3	localObject	Object
    //   211	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   11	77	153	java/lang/Exception
    //   11	77	190	finally
    //   85	94	203	finally
    //   96	104	203	finally
    //   106	111	203	finally
    //   158	177	203	finally
    //   85	94	211	java/lang/Exception
    //   96	104	211	java/lang/Exception
    //   106	111	211	java/lang/Exception
  }
  
  /* Error */
  public final z Tw(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 373
    //   5: sipush 11726
    //   8: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   15: ldc 41
    //   17: bipush 6
    //   19: anewarray 33	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc -17
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc_w 361
    //   32: aastore
    //   33: dup
    //   34: iconst_2
    //   35: ldc_w 363
    //   38: aastore
    //   39: dup
    //   40: iconst_3
    //   41: ldc -116
    //   43: aastore
    //   44: dup
    //   45: iconst_4
    //   46: ldc_w 365
    //   49: aastore
    //   50: dup
    //   51: iconst_5
    //   52: ldc_w 367
    //   55: aastore
    //   56: ldc_w 261
    //   59: iconst_1
    //   60: anewarray 33	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: aastore
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: iconst_2
    //   71: invokeinterface 264 9 0
    //   76: astore_1
    //   77: aload_1
    //   78: astore_2
    //   79: aload_2
    //   80: ifnull +52 -> 132
    //   83: aload_2
    //   84: astore_1
    //   85: aload_2
    //   86: invokeinterface 138 1 0
    //   91: ifeq +41 -> 132
    //   94: aload_2
    //   95: astore_1
    //   96: new 35	com/tencent/mm/storage/z
    //   99: dup
    //   100: invokespecial 368	com/tencent/mm/storage/z:<init>	()V
    //   103: astore_3
    //   104: aload_2
    //   105: astore_1
    //   106: aload_3
    //   107: aload_2
    //   108: invokevirtual 371	com/tencent/mm/storage/z:b	(Landroid/database/Cursor;)V
    //   111: aload_2
    //   112: ifnull +9 -> 121
    //   115: aload_2
    //   116: invokeinterface 170 1 0
    //   121: ldc2_w 373
    //   124: sipush 11726
    //   127: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   130: aload_3
    //   131: areturn
    //   132: aload_2
    //   133: ifnull +9 -> 142
    //   136: aload_2
    //   137: invokeinterface 170 1 0
    //   142: ldc2_w 373
    //   145: sipush 11726
    //   148: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   151: aconst_null
    //   152: areturn
    //   153: astore_3
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_2
    //   157: astore_1
    //   158: ldc -78
    //   160: ldc_w 376
    //   163: iconst_1
    //   164: anewarray 182	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_3
    //   170: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   173: aastore
    //   174: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload_2
    //   178: ifnull -36 -> 142
    //   181: aload_2
    //   182: invokeinterface 170 1 0
    //   187: goto -45 -> 142
    //   190: astore_1
    //   191: aload_2
    //   192: ifnull +9 -> 201
    //   195: aload_2
    //   196: invokeinterface 170 1 0
    //   201: aload_1
    //   202: athrow
    //   203: astore_3
    //   204: aload_1
    //   205: astore_2
    //   206: aload_3
    //   207: astore_1
    //   208: goto -17 -> 191
    //   211: astore_3
    //   212: goto -56 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	215	0	this	ac
    //   0	215	1	paramString	String
    //   1	205	2	str	String
    //   103	28	3	localz	z
    //   153	17	3	localException1	Exception
    //   203	4	3	localObject	Object
    //   211	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   11	77	153	java/lang/Exception
    //   11	77	190	finally
    //   85	94	203	finally
    //   96	104	203	finally
    //   106	111	203	finally
    //   158	177	203	finally
    //   85	94	211	java/lang/Exception
    //   96	104	211	java/lang/Exception
    //   106	111	211	java/lang/Exception
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1571421159424L, 11708);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1571421159424L, 11708);
    return 0;
  }
  
  public boolean a(boolean paramBoolean, z paramz, String... paramVarArgs)
  {
    GMTrace.i(1572897554432L, 11719);
    boolean bool = super.a(paramz, paramVarArgs);
    if ((bool) && (paramBoolean))
    {
      SS(a("delete", paramz));
      bSJ();
    }
    aJJ();
    GMTrace.o(1572897554432L, 11719);
    return bool;
  }
  
  public final void aJJ()
  {
    GMTrace.i(1571823812608L, 11711);
    w.v("MicroMsg.Label.ContactLabelStorage", "cleanCache %s", new Object[] { bg.bQW() });
    this.vAb = null;
    this.vAc = null;
    GMTrace.o(1571823812608L, 11711);
  }
  
  /* Error */
  public final ArrayList<String> ae(ArrayList<String> paramArrayList)
  {
    // Byte code:
    //   0: ldc2_w 412
    //   3: sipush 11716
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnull +10 -> 20
    //   13: aload_1
    //   14: invokevirtual 305	java/util/ArrayList:size	()I
    //   17: ifgt +14 -> 31
    //   20: ldc2_w 412
    //   23: sipush 11716
    //   26: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: aconst_null
    //   30: areturn
    //   31: aload_1
    //   32: invokevirtual 305	java/util/ArrayList:size	()I
    //   35: istore_3
    //   36: new 114	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   43: astore 4
    //   45: aload 4
    //   47: ldc_w 415
    //   50: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload 4
    //   56: ldc_w 285
    //   59: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: iconst_0
    //   64: istore_2
    //   65: iload_2
    //   66: iload_3
    //   67: if_icmpge +62 -> 129
    //   70: aload 4
    //   72: new 114	java/lang/StringBuilder
    //   75: dup
    //   76: ldc_w 417
    //   79: invokespecial 289	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload_1
    //   83: iload_2
    //   84: invokevirtual 418	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   87: checkcast 33	java/lang/String
    //   90: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc_w 417
    //   96: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: iload_2
    //   107: iload_3
    //   108: iconst_1
    //   109: isub
    //   110: if_icmpge +12 -> 122
    //   113: aload 4
    //   115: ldc_w 291
    //   118: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: iload_2
    //   123: iconst_1
    //   124: iadd
    //   125: istore_2
    //   126: goto -61 -> 65
    //   129: aload 4
    //   131: ldc_w 293
    //   134: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload 4
    //   140: ldc_w 420
    //   143: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload 4
    //   149: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: astore_1
    //   153: ldc -78
    //   155: ldc_w 422
    //   158: iconst_1
    //   159: anewarray 182	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: aload_1
    //   165: aastore
    //   166: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_0
    //   170: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   173: aload_1
    //   174: aconst_null
    //   175: iconst_2
    //   176: invokeinterface 132 4 0
    //   181: astore 4
    //   183: aload 4
    //   185: astore_1
    //   186: aload 4
    //   188: ldc -17
    //   190: invokeinterface 144 2 0
    //   195: istore_2
    //   196: aload 4
    //   198: astore_1
    //   199: aload 4
    //   201: invokeinterface 138 1 0
    //   206: ifeq +95 -> 301
    //   209: aload 4
    //   211: astore_1
    //   212: new 81	java/util/ArrayList
    //   215: dup
    //   216: invokespecial 83	java/util/ArrayList:<init>	()V
    //   219: astore 5
    //   221: aload 4
    //   223: astore_1
    //   224: aload 5
    //   226: aload 4
    //   228: iload_2
    //   229: invokeinterface 148 2 0
    //   234: invokevirtual 299	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   237: pop
    //   238: aload 4
    //   240: astore_1
    //   241: aload 4
    //   243: invokeinterface 302 1 0
    //   248: ifne -27 -> 221
    //   251: aload 4
    //   253: astore_1
    //   254: ldc -78
    //   256: ldc_w 424
    //   259: iconst_1
    //   260: anewarray 182	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload 5
    //   267: invokevirtual 305	java/util/ArrayList:size	()I
    //   270: invokestatic 311	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: aload 4
    //   279: ifnull +10 -> 289
    //   282: aload 4
    //   284: invokeinterface 170 1 0
    //   289: ldc2_w 412
    //   292: sipush 11716
    //   295: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   298: aload 5
    //   300: areturn
    //   301: aload 4
    //   303: ifnull +10 -> 313
    //   306: aload 4
    //   308: invokeinterface 170 1 0
    //   313: ldc2_w 412
    //   316: sipush 11716
    //   319: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   322: aconst_null
    //   323: areturn
    //   324: astore 5
    //   326: aconst_null
    //   327: astore 4
    //   329: aload 4
    //   331: astore_1
    //   332: ldc -78
    //   334: ldc_w 426
    //   337: iconst_1
    //   338: anewarray 182	java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: aload 5
    //   345: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   348: aastore
    //   349: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   352: aload 4
    //   354: ifnull -41 -> 313
    //   357: aload 4
    //   359: invokeinterface 170 1 0
    //   364: goto -51 -> 313
    //   367: astore 4
    //   369: aconst_null
    //   370: astore_1
    //   371: aload_1
    //   372: ifnull +9 -> 381
    //   375: aload_1
    //   376: invokeinterface 170 1 0
    //   381: aload 4
    //   383: athrow
    //   384: astore 4
    //   386: goto -15 -> 371
    //   389: astore 5
    //   391: goto -62 -> 329
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	394	0	this	ac
    //   0	394	1	paramArrayList	ArrayList<String>
    //   64	165	2	i	int
    //   35	75	3	j	int
    //   43	315	4	localObject1	Object
    //   367	15	4	localObject2	Object
    //   384	1	4	localObject3	Object
    //   219	80	5	localArrayList	ArrayList
    //   324	20	5	localException1	Exception
    //   389	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   169	183	324	java/lang/Exception
    //   169	183	367	finally
    //   186	196	384	finally
    //   199	209	384	finally
    //   212	221	384	finally
    //   224	238	384	finally
    //   241	251	384	finally
    //   254	277	384	finally
    //   332	352	384	finally
    //   186	196	389	java/lang/Exception
    //   199	209	389	java/lang/Exception
    //   212	221	389	java/lang/Exception
    //   224	238	389	java/lang/Exception
    //   241	251	389	java/lang/Exception
    //   254	277	389	java/lang/Exception
  }
  
  public boolean b(boolean paramBoolean, z paramz, String... paramVarArgs)
  {
    GMTrace.i(1573031772160L, 11720);
    boolean bool = super.c(paramz, paramVarArgs);
    if ((bool) && (paramBoolean)) {
      SS(a("update", paramz));
    }
    aJJ();
    GMTrace.o(1573031772160L, 11720);
    return bool;
  }
  
  public final ArrayList<String> bSG()
  {
    GMTrace.i(1571555377152L, 11709);
    long l = bg.Pv();
    Cursor localCursor = this.fTZ.a("ContactLabel", new String[] { "labelName" }, null, null, null, null, "createTime ASC ", 2);
    if (localCursor == null)
    {
      GMTrace.o(1571555377152L, 11709);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(localCursor.getString(0));
    }
    localCursor.close();
    w.i("MicroMsg.Label.ContactLabelStorage", "getAllLabel time:%s count:%s stack:%s", new Object[] { Long.valueOf(bg.aH(l)), Integer.valueOf(localArrayList.size()), bg.bQW() });
    GMTrace.o(1571555377152L, 11709);
    return localArrayList;
  }
  
  public final ArrayList<z> bSH()
  {
    GMTrace.i(1571689594880L, 11710);
    long l = bg.Pv();
    Cursor localCursor = this.fTZ.a("select * from ContactLabel order by createTime ASC ", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(1571689594880L, 11710);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      z localz = new z();
      localz.b(localCursor);
      localArrayList.add(localz);
    }
    localCursor.close();
    w.i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", new Object[] { Long.valueOf(bg.aH(l)), Integer.valueOf(localArrayList.size()), bg.bQW() });
    GMTrace.o(1571689594880L, 11710);
    return localArrayList;
  }
  
  public final void bSI()
  {
    GMTrace.i(1571958030336L, 11712);
    if ((this.vAb != null) && (this.vAc != null))
    {
      GMTrace.o(1571958030336L, 11712);
      return;
    }
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    long l = bg.Pv();
    Object localObject1 = "select username , contactLabelIds from rcontact where (type & " + com.tencent.mm.l.a.uR() + " !=0 ) and ( contactLabelIds != '') ;";
    localObject1 = this.fTZ.a((String)localObject1, null, 2);
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      this.vAb = localHashMap1;
      this.vAc = localHashMap2;
      GMTrace.o(1571958030336L, 11712);
      return;
      localHashMap1.put(localObject2, localObject3);
    }
    while (((Cursor)localObject1).moveToNext())
    {
      localObject2 = ((Cursor)localObject1).getString(0);
      if (!bg.nm((String)localObject2))
      {
        String[] arrayOfString = bg.nl(((Cursor)localObject1).getString(1)).split(",");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          localObject3 = new int[arrayOfString.length];
          int i = 0;
          label201:
          if (i < arrayOfString.length)
          {
            localObject3[i] = bg.getInt(arrayOfString[i], -1);
            if (!localHashMap2.containsKey(Integer.valueOf(localObject3[i]))) {
              break label263;
            }
            ((ArrayList)localHashMap2.get(Integer.valueOf(localObject3[i]))).add(localObject2);
          }
          for (;;)
          {
            i += 1;
            break label201;
            break;
            label263:
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(localObject2);
            localHashMap2.put(Integer.valueOf(localObject3[i]), localArrayList);
          }
        }
      }
    }
    ((Cursor)localObject1).close();
    w.i("MicroMsg.Label.ContactLabelStorage", "checkRebuildCache time:%s user:%s label:%s stack:%s", new Object[] { Long.valueOf(bg.aH(l)), Integer.valueOf(localHashMap1.size()), Integer.valueOf(localHashMap2.size()), bg.bQW() });
    this.vAb = localHashMap1;
    this.vAc = localHashMap2;
    GMTrace.o(1571958030336L, 11712);
  }
  
  public final boolean cf(List<z> paramList)
  {
    GMTrace.i(1573165989888L, 11721);
    if (paramList.size() <= 0)
    {
      w.i("MicroMsg.Label.ContactLabelStorage", "cpan[insertAddLabel] list is null.");
      GMTrace.o(1573165989888L, 11721);
      return false;
    }
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.Label.ContactLabelStorage", "begin insertOrUpdateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int j = paramList.size();
      new ArrayList();
      int i = 0;
      while (i < j)
      {
        String str = c((z)paramList.get(i));
        if (!bg.nm(str)) {
          hB(str);
        }
        i += 1;
      }
      if (localg != null)
      {
        localg.aL(l);
        w.i("MicroMsg.Label.ContactLabelStorage", "end deleteLocalLabel transaction");
      }
      aJJ();
      GMTrace.o(1573165989888L, 11721);
      return false;
      localg = null;
      l = -1L;
    }
  }
  
  public final boolean cg(List<z> paramList)
  {
    GMTrace.i(1573300207616L, 11722);
    if (paramList.size() <= 0)
    {
      w.i("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] list is null.");
      GMTrace.o(1573300207616L, 11722);
      return false;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.Label.ContactLabelStorage", "begin insertOrUpdateList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int j = paramList.size();
      int i = 0;
      if (i < j)
      {
        z localz = (z)paramList.get(i);
        if (localz != null)
        {
          int k = b(localz);
          switch (1.vAd[(k - 1)])
          {
          default: 
            w.w("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] unknow result.");
          }
        }
        for (;;)
        {
          i += 1;
          break;
          b(false, localz, new String[] { "labelID" });
          localArrayList2.add(localz);
          continue;
          localz.field_createTime = System.currentTimeMillis();
          a(false, localz);
          localArrayList1.add(localz);
        }
      }
      if (localg != null)
      {
        localg.aL(l);
        w.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
      }
      if (localArrayList1.size() > 0) {
        SS(o("insert", localArrayList1));
      }
      if (localArrayList2.size() > 0) {
        SS(o("update", localArrayList2));
      }
      aJJ();
      GMTrace.o(1573300207616L, 11722);
      return false;
      localg = null;
      l = -1L;
    }
  }
  
  public final boolean ch(List<z> paramList)
  {
    GMTrace.i(1574642384896L, 11732);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.w("MicroMsg.Label.ContactLabelStorage", "cpan[deleteList] list is null.");
      GMTrace.o(1574642384896L, 11732);
      return false;
    }
    g localg;
    long l;
    if ((this.fTZ instanceof g))
    {
      localg = (g)this.fTZ;
      l = localg.cE(Thread.currentThread().getId());
      w.i("MicroMsg.Label.ContactLabelStorage", "begin deleteList in a transaction, ticket = %d", new Object[] { Long.valueOf(l) });
    }
    for (;;)
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        a(false, (z)paramList.get(i), new String[] { "labelID" });
        i += 1;
      }
      if (localg != null)
      {
        localg.aL(l);
        w.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
      }
      SS(o("delete", paramList));
      bSJ();
      GMTrace.o(1574642384896L, 11732);
      return true;
      localg = null;
      l = -1L;
    }
  }
  
  /* Error */
  public final ArrayList<z> ci(List<z> paramList)
  {
    // Byte code:
    //   0: ldc2_w 561
    //   3: sipush 11733
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: invokeinterface 247 1 0
    //   15: ifgt +14 -> 29
    //   18: ldc2_w 561
    //   21: sipush 11733
    //   24: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   27: aconst_null
    //   28: areturn
    //   29: aload_1
    //   30: invokeinterface 247 1 0
    //   35: istore_3
    //   36: new 114	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   43: astore 4
    //   45: aload 4
    //   47: ldc_w 283
    //   50: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload 4
    //   56: ldc_w 564
    //   59: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: iconst_0
    //   64: istore_2
    //   65: iload_2
    //   66: iload_3
    //   67: if_icmpge +67 -> 134
    //   70: aload 4
    //   72: new 114	java/lang/StringBuilder
    //   75: dup
    //   76: ldc_w 287
    //   79: invokespecial 289	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload_1
    //   83: iload_2
    //   84: invokeinterface 251 2 0
    //   89: checkcast 35	com/tencent/mm/storage/z
    //   92: getfield 119	com/tencent/mm/storage/z:field_labelID	I
    //   95: invokevirtual 123	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   98: ldc_w 287
    //   101: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: iload_2
    //   112: iload_3
    //   113: iconst_1
    //   114: isub
    //   115: if_icmpge +12 -> 127
    //   118: aload 4
    //   120: ldc_w 291
    //   123: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: iload_2
    //   128: iconst_1
    //   129: iadd
    //   130: istore_2
    //   131: goto -66 -> 65
    //   134: aload 4
    //   136: ldc_w 293
    //   139: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload 4
    //   145: ldc_w 420
    //   148: invokevirtual 229	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload 4
    //   154: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: astore_1
    //   158: ldc -78
    //   160: ldc_w 566
    //   163: iconst_1
    //   164: anewarray 182	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_1
    //   170: aastore
    //   171: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: aload_0
    //   175: getfield 68	com/tencent/mm/storage/ac:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   178: aload_1
    //   179: aconst_null
    //   180: iconst_2
    //   181: invokeinterface 132 4 0
    //   186: astore 4
    //   188: aload 4
    //   190: astore_1
    //   191: aload 4
    //   193: invokeinterface 138 1 0
    //   198: ifeq +111 -> 309
    //   201: aload 4
    //   203: astore_1
    //   204: new 81	java/util/ArrayList
    //   207: dup
    //   208: invokespecial 83	java/util/ArrayList:<init>	()V
    //   211: astore 5
    //   213: aload 4
    //   215: astore_1
    //   216: new 35	com/tencent/mm/storage/z
    //   219: dup
    //   220: invokespecial 368	com/tencent/mm/storage/z:<init>	()V
    //   223: astore 6
    //   225: aload 4
    //   227: astore_1
    //   228: aload 6
    //   230: aload 4
    //   232: invokevirtual 371	com/tencent/mm/storage/z:b	(Landroid/database/Cursor;)V
    //   235: aload 4
    //   237: astore_1
    //   238: aload 5
    //   240: aload 6
    //   242: invokevirtual 299	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   245: pop
    //   246: aload 4
    //   248: astore_1
    //   249: aload 4
    //   251: invokeinterface 302 1 0
    //   256: ifne -43 -> 213
    //   259: aload 4
    //   261: astore_1
    //   262: ldc -78
    //   264: ldc_w 568
    //   267: iconst_1
    //   268: anewarray 182	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload 5
    //   275: invokevirtual 305	java/util/ArrayList:size	()I
    //   278: invokestatic 311	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   281: aastore
    //   282: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload 4
    //   287: ifnull +10 -> 297
    //   290: aload 4
    //   292: invokeinterface 170 1 0
    //   297: ldc2_w 561
    //   300: sipush 11733
    //   303: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   306: aload 5
    //   308: areturn
    //   309: aload 4
    //   311: ifnull +10 -> 321
    //   314: aload 4
    //   316: invokeinterface 170 1 0
    //   321: ldc2_w 561
    //   324: sipush 11733
    //   327: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   330: aconst_null
    //   331: areturn
    //   332: astore 5
    //   334: aconst_null
    //   335: astore 4
    //   337: aload 4
    //   339: astore_1
    //   340: ldc -78
    //   342: ldc_w 570
    //   345: iconst_1
    //   346: anewarray 182	java/lang/Object
    //   349: dup
    //   350: iconst_0
    //   351: aload 5
    //   353: invokevirtual 183	java/lang/Exception:toString	()Ljava/lang/String;
    //   356: aastore
    //   357: invokestatic 189	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: aload 4
    //   362: ifnull -41 -> 321
    //   365: aload 4
    //   367: invokeinterface 170 1 0
    //   372: goto -51 -> 321
    //   375: astore 4
    //   377: aconst_null
    //   378: astore_1
    //   379: aload_1
    //   380: ifnull +9 -> 389
    //   383: aload_1
    //   384: invokeinterface 170 1 0
    //   389: aload 4
    //   391: athrow
    //   392: astore 4
    //   394: goto -15 -> 379
    //   397: astore 5
    //   399: goto -62 -> 337
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	402	0	this	ac
    //   0	402	1	paramList	List<z>
    //   64	67	2	i	int
    //   35	80	3	j	int
    //   43	323	4	localObject1	Object
    //   375	15	4	localObject2	Object
    //   392	1	4	localObject3	Object
    //   211	96	5	localArrayList	ArrayList
    //   332	20	5	localException1	Exception
    //   397	1	5	localException2	Exception
    //   223	18	6	localz	z
    // Exception table:
    //   from	to	target	type
    //   174	188	332	java/lang/Exception
    //   174	188	375	finally
    //   191	201	392	finally
    //   204	213	392	finally
    //   216	225	392	finally
    //   228	235	392	finally
    //   238	246	392	finally
    //   249	259	392	finally
    //   262	285	392	finally
    //   340	360	392	finally
    //   191	201	397	java/lang/Exception
    //   204	213	397	java/lang/Exception
    //   216	225	397	java/lang/Exception
    //   228	235	397	java/lang/Exception
    //   238	246	397	java/lang/Exception
    //   249	259	397	java/lang/Exception
    //   262	285	397	java/lang/Exception
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(1572763336704L, 11718);
    w.i("MicroMsg.Label.ContactLabelStorage", "cpan[delete] labelID:%s", new Object[] { paramString });
    w.d("MicroMsg.Label.ContactLabelStorage", "cpan[query] SQL:%s", new Object[] { "labelID =? " });
    try
    {
      i = this.fTZ.delete("ContactLabel", "labelID =? ", new String[] { paramString });
      if (i > 0)
      {
        GMTrace.o(1572763336704L, 11718);
        return true;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.w("MicroMsg.Label.ContactLabelStorage", "cpan[delete] exception %s", new Object[] { paramString.toString() });
        int i = -1;
      }
      GMTrace.o(1572763336704L, 11718);
    }
    return false;
  }
  
  public final ArrayList<String> n(String paramString, List<String> paramList)
  {
    GMTrace.i(1572226465792L, 11714);
    w.d("MicroMsg.Label.ContactLabelStorage", "cpan[query] SQL:%s", new Object[] { "select labelName from ContactLabel where labelName like ? or labelPYFull like ? or labelPYShort like ?  order by createTime ASC " });
    Object localObject2 = "%" + paramString + "%";
    Object localObject3 = "%" + paramString + "%";
    String str = "%" + paramString + "%";
    localObject1 = null;
    paramString = null;
    try
    {
      localObject2 = this.fTZ.a("select labelName from ContactLabel where labelName like ? or labelPYFull like ? or labelPYShort like ?  order by createTime ASC ", new String[] { localObject2, localObject3, str }, 2);
      paramString = (String)localObject2;
      localObject1 = localObject2;
      int i = ((Cursor)localObject2).getColumnIndex("labelName");
      paramString = (String)localObject2;
      localObject1 = localObject2;
      if (((Cursor)localObject2).moveToFirst())
      {
        paramString = (String)localObject2;
        localObject1 = localObject2;
        localObject3 = new ArrayList();
        label261:
        boolean bool;
        do
        {
          paramString = (String)localObject2;
          localObject1 = localObject2;
          str = ((Cursor)localObject2).getString(i);
          if (paramList != null)
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (paramList.size() > 0)
            {
              paramString = (String)localObject2;
              localObject1 = localObject2;
              if (paramList.contains(str)) {
                break label261;
              }
            }
          }
          paramString = (String)localObject2;
          localObject1 = localObject2;
          ((ArrayList)localObject3).add(str);
          paramString = (String)localObject2;
          localObject1 = localObject2;
          bool = ((Cursor)localObject2).moveToNext();
        } while (bool);
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        GMTrace.o(1572226465792L, 11714);
        return (ArrayList<String>)localObject3;
      }
    }
    catch (Exception paramList)
    {
      for (;;)
      {
        localObject1 = paramString;
        w.w("MicroMsg.Label.ContactLabelStorage", "cpan[query] exception %s", new Object[] { paramList.toString() });
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (localObject1 == null) {
        break label378;
      }
      ((Cursor)localObject1).close();
    }
    GMTrace.o(1572226465792L, 11714);
    return null;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1589674770432L, 11844);
      vAe = 1;
      vAf = 2;
      vAg = 3;
      vAh = new int[] { vAe, vAf, vAg };
      GMTrace.o(1589674770432L, 11844);
    }
    
    public static int[] bSK()
    {
      GMTrace.i(1589540552704L, 11843);
      int[] arrayOfInt = (int[])vAh.clone();
      GMTrace.o(1589540552704L, 11843);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */