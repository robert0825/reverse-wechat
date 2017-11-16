package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends a
{
  public l()
  {
    GMTrace.i(9204651786240L, 68580);
    GMTrace.o(9204651786240L, 68580);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9204786003968L, 68581);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11032));
    localArrayList.add(Integer.valueOf(11034));
    GMTrace.o(9204786003968L, 68581);
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 48
    //   3: ldc 50
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_1
    //   9: tableswitch	default:+27->36, 11032:+39->48, 11033:+27->36, 11034:+334->343
    //   36: ldc2_w 48
    //   39: ldc 50
    //   41: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   44: iconst_0
    //   45: newarray <illegal type>
    //   47: areturn
    //   48: new 52	com/tencent/mm/protocal/c/bsq
    //   51: dup
    //   52: invokespecial 53	com/tencent/mm/protocal/c/bsq:<init>	()V
    //   55: astore_2
    //   56: invokestatic 59	com/tencent/mm/k/g:ut	()Lcom/tencent/mm/k/e;
    //   59: ldc 61
    //   61: iconst_0
    //   62: invokevirtual 67	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   65: ifeq +37 -> 102
    //   68: aload_2
    //   69: ldc 68
    //   71: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   74: aload_2
    //   75: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   78: getstatic 83	com/tencent/mm/R$l:ejF	I
    //   81: invokevirtual 89	android/content/Context:getString	(I)Ljava/lang/String;
    //   84: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   87: aload_2
    //   88: invokevirtual 97	com/tencent/mm/protocal/c/bsq:toByteArray	()[B
    //   91: astore_2
    //   92: ldc2_w 48
    //   95: ldc 50
    //   97: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: aload_2
    //   101: areturn
    //   102: bipush 13
    //   104: iconst_0
    //   105: invokestatic 103	com/tencent/mm/plugin/wear/model/c/a:dC	(II)V
    //   108: bipush 15
    //   110: invokestatic 107	com/tencent/mm/plugin/wear/model/c/a:xi	(I)V
    //   113: new 109	com/tencent/mm/g/a/tc
    //   116: dup
    //   117: invokespecial 110	com/tencent/mm/g/a/tc:<init>	()V
    //   120: astore_3
    //   121: aload_3
    //   122: getfield 114	com/tencent/mm/g/a/tc:eYy	Lcom/tencent/mm/g/a/tc$a;
    //   125: iconst_3
    //   126: putfield 119	com/tencent/mm/g/a/tc$a:action	I
    //   129: getstatic 125	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   132: aload_3
    //   133: invokevirtual 128	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   136: pop
    //   137: aload_3
    //   138: getfield 132	com/tencent/mm/g/a/tc:eYz	Lcom/tencent/mm/g/a/tc$b;
    //   141: getfield 137	com/tencent/mm/g/a/tc$b:eYA	I
    //   144: tableswitch	default:+36->180, 1:+39->183, 2:+155->299, 3:+111->255, 4:+133->277, 5:+177->321
    //   180: goto -93 -> 87
    //   183: aload_2
    //   184: iconst_0
    //   185: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   188: aload_2
    //   189: ldc -117
    //   191: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   194: aload_2
    //   195: new 141	com/tencent/mm/bm/b
    //   198: dup
    //   199: aload_3
    //   200: getfield 132	com/tencent/mm/g/a/tc:eYz	Lcom/tencent/mm/g/a/tc$b;
    //   203: getfield 145	com/tencent/mm/g/a/tc$b:eYE	[B
    //   206: invokespecial 148	com/tencent/mm/bm/b:<init>	([B)V
    //   209: putfield 152	com/tencent/mm/protocal/c/bsq:vbL	Lcom/tencent/mm/bm/b;
    //   212: aload_2
    //   213: new 141	com/tencent/mm/bm/b
    //   216: dup
    //   217: aload_3
    //   218: getfield 132	com/tencent/mm/g/a/tc:eYz	Lcom/tencent/mm/g/a/tc$b;
    //   221: getfield 155	com/tencent/mm/g/a/tc$b:eYF	[B
    //   224: invokespecial 148	com/tencent/mm/bm/b:<init>	([B)V
    //   227: putfield 158	com/tencent/mm/protocal/c/bsq:vbM	Lcom/tencent/mm/bm/b;
    //   230: aload_2
    //   231: aload_3
    //   232: getfield 132	com/tencent/mm/g/a/tc:eYz	Lcom/tencent/mm/g/a/tc$b;
    //   235: getfield 161	com/tencent/mm/g/a/tc$b:eYG	Ljava/lang/String;
    //   238: putfield 164	com/tencent/mm/protocal/c/bsq:vbN	Ljava/lang/String;
    //   241: aload_2
    //   242: aload_3
    //   243: getfield 132	com/tencent/mm/g/a/tc:eYz	Lcom/tencent/mm/g/a/tc$b;
    //   246: getfield 167	com/tencent/mm/g/a/tc$b:eYH	Ljava/lang/String;
    //   249: putfield 170	com/tencent/mm/protocal/c/bsq:vbO	Ljava/lang/String;
    //   252: goto -165 -> 87
    //   255: aload_2
    //   256: ldc -85
    //   258: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   261: aload_2
    //   262: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   265: getstatic 174	com/tencent/mm/R$l:ejC	I
    //   268: invokevirtual 89	android/content/Context:getString	(I)Ljava/lang/String;
    //   271: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   274: goto -187 -> 87
    //   277: aload_2
    //   278: ldc -81
    //   280: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   283: aload_2
    //   284: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   287: getstatic 178	com/tencent/mm/R$l:ejG	I
    //   290: invokevirtual 89	android/content/Context:getString	(I)Ljava/lang/String;
    //   293: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   296: goto -209 -> 87
    //   299: aload_2
    //   300: ldc -77
    //   302: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   305: aload_2
    //   306: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   309: getstatic 182	com/tencent/mm/R$l:ejD	I
    //   312: invokevirtual 89	android/content/Context:getString	(I)Ljava/lang/String;
    //   315: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   318: goto -231 -> 87
    //   321: aload_2
    //   322: ldc -73
    //   324: putfield 72	com/tencent/mm/protocal/c/bsq:uTi	I
    //   327: aload_2
    //   328: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   331: getstatic 186	com/tencent/mm/R$l:ejE	I
    //   334: invokevirtual 89	android/content/Context:getString	(I)Ljava/lang/String;
    //   337: putfield 93	com/tencent/mm/protocal/c/bsq:vaw	Ljava/lang/String;
    //   340: goto -253 -> 87
    //   343: new 188	com/tencent/mm/protocal/c/btb
    //   346: dup
    //   347: invokespecial 189	com/tencent/mm/protocal/c/btb:<init>	()V
    //   350: astore_3
    //   351: aload_3
    //   352: aload_2
    //   353: invokevirtual 193	com/tencent/mm/protocal/c/btb:aD	([B)Lcom/tencent/mm/bm/a;
    //   356: pop
    //   357: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   360: aload_3
    //   361: getfield 196	com/tencent/mm/protocal/c/btb:vbS	Ljava/lang/String;
    //   364: aload_3
    //   365: getfield 199	com/tencent/mm/protocal/c/btb:vbT	Ljava/lang/String;
    //   368: invokestatic 205	com/tencent/mm/bj/d:x	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   371: goto -335 -> 36
    //   374: astore_2
    //   375: goto -339 -> 36
    //   378: astore_2
    //   379: goto -22 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	382	0	this	l
    //   0	382	1	paramInt	int
    //   0	382	2	paramArrayOfByte	byte[]
    //   120	245	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   87	92	374	java/io/IOException
    //   351	357	378	java/io/IOException
  }
  
  protected final boolean xj(int paramInt)
  {
    GMTrace.i(9204920221696L, 68582);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9204920221696L, 68582);
      return false;
    }
    GMTrace.o(9204920221696L, 68582);
    return true;
  }
  
  public final boolean xl(int paramInt)
  {
    GMTrace.i(9205188657152L, 68584);
    switch (paramInt)
    {
    default: 
      GMTrace.o(9205188657152L, 68584);
      return false;
    }
    GMTrace.o(9205188657152L, 68584);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */