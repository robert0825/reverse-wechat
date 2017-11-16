package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;

public class EnterpriseFullHeightListView
  extends ListView
{
  private int jJp;
  public boolean wYn;
  private View wYo;
  
  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3391145115648L, 25266);
    this.wYn = true;
    this.jJp = 0;
    GMTrace.o(3391145115648L, 25266);
  }
  
  public EnterpriseFullHeightListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3391279333376L, 25267);
    this.wYn = true;
    this.jJp = 0;
    GMTrace.o(3391279333376L, 25267);
  }
  
  /* Error */
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    // Byte code:
    //   0: ldc2_w 40
    //   3: sipush 25268
    //   6: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: iload_1
    //   11: iload_2
    //   12: iload_3
    //   13: iload 4
    //   15: invokespecial 43	android/widget/ListView:onSizeChanged	(IIII)V
    //   18: aload_0
    //   19: getfield 24	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYn	Z
    //   22: ifeq +13 -> 35
    //   25: ldc2_w 40
    //   28: sipush 25268
    //   31: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: return
    //   35: aload_0
    //   36: getfield 24	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYn	Z
    //   39: ifne +222 -> 261
    //   42: aload_0
    //   43: invokevirtual 47	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getHeaderViewsCount	()I
    //   46: istore_1
    //   47: aload_0
    //   48: invokevirtual 51	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getAdapter	()Landroid/widget/ListAdapter;
    //   51: invokeinterface 56 1 0
    //   56: istore 4
    //   58: aload_0
    //   59: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   62: ifnull +209 -> 271
    //   65: iconst_0
    //   66: istore_3
    //   67: iload 4
    //   69: iconst_1
    //   70: isub
    //   71: istore 4
    //   73: iload_1
    //   74: iload 4
    //   76: if_icmpge +121 -> 197
    //   79: aload_0
    //   80: getfield 26	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:jJp	I
    //   83: istore 5
    //   85: iload 5
    //   87: ifgt +41 -> 128
    //   90: aload_0
    //   91: invokevirtual 51	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getAdapter	()Landroid/widget/ListAdapter;
    //   94: iload_1
    //   95: aconst_null
    //   96: aload_0
    //   97: invokeinterface 62 4 0
    //   102: astore 6
    //   104: aload 6
    //   106: iconst_0
    //   107: iconst_0
    //   108: invokestatic 68	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   111: iconst_0
    //   112: iconst_0
    //   113: invokestatic 68	android/view/View$MeasureSpec:makeMeasureSpec	(II)I
    //   116: invokevirtual 74	android/view/View:measure	(II)V
    //   119: aload_0
    //   120: aload 6
    //   122: invokevirtual 77	android/view/View:getMeasuredHeight	()I
    //   125: putfield 26	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:jJp	I
    //   128: iload_3
    //   129: aload_0
    //   130: getfield 26	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:jJp	I
    //   133: iadd
    //   134: istore 5
    //   136: iload 5
    //   138: istore_3
    //   139: iload 5
    //   141: iload_2
    //   142: if_icmple +48 -> 190
    //   145: aload_0
    //   146: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   149: ifnull +17 -> 166
    //   152: aload_0
    //   153: aload_0
    //   154: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   157: invokevirtual 81	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:removeFooterView	(Landroid/view/View;)Z
    //   160: pop
    //   161: aload_0
    //   162: aconst_null
    //   163: putfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   166: ldc2_w 40
    //   169: sipush 25268
    //   172: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   175: return
    //   176: astore 6
    //   178: ldc2_w 40
    //   181: sipush 25268
    //   184: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   187: return
    //   188: astore 6
    //   190: iload_1
    //   191: iconst_1
    //   192: iadd
    //   193: istore_1
    //   194: goto -121 -> 73
    //   197: iload_3
    //   198: iload_2
    //   199: if_icmpge +62 -> 261
    //   202: aload_0
    //   203: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   206: ifnonnull +18 -> 224
    //   209: aload_0
    //   210: new 70	android/view/View
    //   213: dup
    //   214: aload_0
    //   215: invokevirtual 85	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:getContext	()Landroid/content/Context;
    //   218: invokespecial 88	android/view/View:<init>	(Landroid/content/Context;)V
    //   221: putfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   224: aload_0
    //   225: aload_0
    //   226: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   229: invokevirtual 81	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:removeFooterView	(Landroid/view/View;)Z
    //   232: pop
    //   233: aload_0
    //   234: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   237: new 90	android/widget/AbsListView$LayoutParams
    //   240: dup
    //   241: iconst_m1
    //   242: iload_2
    //   243: iload_3
    //   244: isub
    //   245: invokespecial 92	android/widget/AbsListView$LayoutParams:<init>	(II)V
    //   248: invokevirtual 96	android/view/View:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   251: aload_0
    //   252: aload_0
    //   253: getfield 58	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:wYo	Landroid/view/View;
    //   256: aconst_null
    //   257: iconst_0
    //   258: invokevirtual 100	com/tencent/mm/ui/conversation/EnterpriseFullHeightListView:addFooterView	(Landroid/view/View;Ljava/lang/Object;Z)V
    //   261: ldc2_w 40
    //   264: sipush 25268
    //   267: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   270: return
    //   271: iconst_0
    //   272: istore_3
    //   273: goto -200 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	this	EnterpriseFullHeightListView
    //   0	276	1	paramInt1	int
    //   0	276	2	paramInt2	int
    //   0	276	3	paramInt3	int
    //   0	276	4	paramInt4	int
    //   83	60	5	i	int
    //   102	19	6	localView	View
    //   176	1	6	localException1	Exception
    //   188	1	6	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   35	65	176	java/lang/Exception
    //   79	85	176	java/lang/Exception
    //   128	136	176	java/lang/Exception
    //   145	166	176	java/lang/Exception
    //   166	175	176	java/lang/Exception
    //   202	224	176	java/lang/Exception
    //   224	261	176	java/lang/Exception
    //   90	128	188	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\conversation\EnterpriseFullHeightListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */