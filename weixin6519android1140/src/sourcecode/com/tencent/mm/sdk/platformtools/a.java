package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;

public final class a
{
  /* Error */
  @android.annotation.TargetApi(17)
  public static void cX(View paramView)
  {
    // Byte code:
    //   0: ldc2_w 18
    //   3: ldc 20
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnonnull +12 -> 21
    //   12: ldc2_w 18
    //   15: ldc 20
    //   17: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: return
    //   21: aload_0
    //   22: aconst_null
    //   23: invokevirtual 35	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   26: aload_0
    //   27: aconst_null
    //   28: invokevirtual 39	android/view/View:setOnCreateContextMenuListener	(Landroid/view/View$OnCreateContextMenuListener;)V
    //   31: aload_0
    //   32: aconst_null
    //   33: invokevirtual 43	android/view/View:setOnFocusChangeListener	(Landroid/view/View$OnFocusChangeListener;)V
    //   36: aload_0
    //   37: aconst_null
    //   38: invokevirtual 47	android/view/View:setOnKeyListener	(Landroid/view/View$OnKeyListener;)V
    //   41: aload_0
    //   42: aconst_null
    //   43: invokevirtual 51	android/view/View:setOnLongClickListener	(Landroid/view/View$OnLongClickListener;)V
    //   46: aload_0
    //   47: aconst_null
    //   48: invokevirtual 35	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   51: aload_0
    //   52: aconst_null
    //   53: invokevirtual 55	android/view/View:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   56: aload_0
    //   57: invokevirtual 59	android/view/View:getBackground	()Landroid/graphics/drawable/Drawable;
    //   60: ifnull +16 -> 76
    //   63: aload_0
    //   64: invokevirtual 59	android/view/View:getBackground	()Landroid/graphics/drawable/Drawable;
    //   67: aconst_null
    //   68: invokevirtual 65	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   71: aload_0
    //   72: aconst_null
    //   73: invokevirtual 69	android/view/View:setBackgroundDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   76: aload_0
    //   77: instanceof 71
    //   80: ifeq +35 -> 115
    //   83: aload_0
    //   84: checkcast 71	android/widget/ImageView
    //   87: astore_3
    //   88: aload_3
    //   89: invokevirtual 74	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   92: astore 4
    //   94: aload 4
    //   96: ifnull +9 -> 105
    //   99: aload 4
    //   101: aconst_null
    //   102: invokevirtual 65	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   105: aload_3
    //   106: aconst_null
    //   107: invokevirtual 77	android/widget/ImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   110: aload_3
    //   111: aconst_null
    //   112: invokevirtual 81	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   115: aload_0
    //   116: instanceof 83
    //   119: ifeq +14 -> 133
    //   122: aload_0
    //   123: checkcast 83	android/widget/TextView
    //   126: aconst_null
    //   127: aconst_null
    //   128: aconst_null
    //   129: aconst_null
    //   130: invokevirtual 87	android/widget/TextView:setCompoundDrawables	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   133: aload_0
    //   134: instanceof 83
    //   137: ifeq +32 -> 169
    //   140: aload_0
    //   141: checkcast 83	android/widget/TextView
    //   144: astore_3
    //   145: aload_3
    //   146: aconst_null
    //   147: aconst_null
    //   148: aconst_null
    //   149: aconst_null
    //   150: invokevirtual 87	android/widget/TextView:setCompoundDrawables	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   153: getstatic 93	android/os/Build$VERSION:SDK_INT	I
    //   156: bipush 17
    //   158: if_icmplt +11 -> 169
    //   161: aload_3
    //   162: aconst_null
    //   163: aconst_null
    //   164: aconst_null
    //   165: aconst_null
    //   166: invokevirtual 96	android/widget/TextView:setCompoundDrawablesRelative	(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   169: aload_0
    //   170: instanceof 98
    //   173: ifeq +35 -> 208
    //   176: aload_0
    //   177: checkcast 98	android/widget/ImageButton
    //   180: astore_3
    //   181: aload_3
    //   182: invokevirtual 99	android/widget/ImageButton:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   185: astore 4
    //   187: aload 4
    //   189: ifnull +9 -> 198
    //   192: aload 4
    //   194: aconst_null
    //   195: invokevirtual 65	android/graphics/drawable/Drawable:setCallback	(Landroid/graphics/drawable/Drawable$Callback;)V
    //   198: aload_3
    //   199: aconst_null
    //   200: invokevirtual 100	android/widget/ImageButton:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   203: aload_3
    //   204: aconst_null
    //   205: invokevirtual 101	android/widget/ImageButton:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   208: aload_0
    //   209: instanceof 103
    //   212: ifeq +304 -> 516
    //   215: aload_0
    //   216: checkcast 103	android/widget/ListView
    //   219: astore_3
    //   220: aload_0
    //   221: instanceof 105
    //   224: ifeq +267 -> 491
    //   227: aload_0
    //   228: checkcast 105	android/view/ViewGroup
    //   231: invokevirtual 109	android/view/ViewGroup:getChildCount	()I
    //   234: istore_2
    //   235: iconst_0
    //   236: istore_1
    //   237: iload_1
    //   238: iload_2
    //   239: if_icmpge +252 -> 491
    //   242: aload_0
    //   243: checkcast 105	android/view/ViewGroup
    //   246: iload_1
    //   247: invokevirtual 113	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   250: invokestatic 115	com/tencent/mm/sdk/platformtools/a:cX	(Landroid/view/View;)V
    //   253: iload_1
    //   254: iconst_1
    //   255: iadd
    //   256: istore_1
    //   257: goto -20 -> 237
    //   260: astore_0
    //   261: ldc 117
    //   263: aload_0
    //   264: ldc 119
    //   266: iconst_0
    //   267: anewarray 4	java/lang/Object
    //   270: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: new 11	java/lang/IncompatibleClassChangeError
    //   276: dup
    //   277: ldc 119
    //   279: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   282: aload_0
    //   283: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   286: checkcast 11	java/lang/IncompatibleClassChangeError
    //   289: checkcast 11	java/lang/IncompatibleClassChangeError
    //   292: athrow
    //   293: astore_0
    //   294: ldc 117
    //   296: aload_0
    //   297: ldc 119
    //   299: iconst_0
    //   300: anewarray 4	java/lang/Object
    //   303: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: new 11	java/lang/IncompatibleClassChangeError
    //   309: dup
    //   310: ldc 119
    //   312: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   315: aload_0
    //   316: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   319: checkcast 11	java/lang/IncompatibleClassChangeError
    //   322: checkcast 11	java/lang/IncompatibleClassChangeError
    //   325: athrow
    //   326: astore_0
    //   327: ldc 117
    //   329: aload_0
    //   330: ldc 119
    //   332: iconst_0
    //   333: anewarray 4	java/lang/Object
    //   336: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   339: new 11	java/lang/IncompatibleClassChangeError
    //   342: dup
    //   343: ldc 119
    //   345: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   348: aload_0
    //   349: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   352: checkcast 11	java/lang/IncompatibleClassChangeError
    //   355: checkcast 11	java/lang/IncompatibleClassChangeError
    //   358: athrow
    //   359: astore_0
    //   360: ldc 117
    //   362: aload_0
    //   363: ldc 119
    //   365: iconst_0
    //   366: anewarray 4	java/lang/Object
    //   369: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: new 11	java/lang/IncompatibleClassChangeError
    //   375: dup
    //   376: ldc 119
    //   378: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   381: aload_0
    //   382: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   385: checkcast 11	java/lang/IncompatibleClassChangeError
    //   388: checkcast 11	java/lang/IncompatibleClassChangeError
    //   391: athrow
    //   392: astore_0
    //   393: ldc 117
    //   395: aload_0
    //   396: ldc 119
    //   398: iconst_0
    //   399: anewarray 4	java/lang/Object
    //   402: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   405: new 11	java/lang/IncompatibleClassChangeError
    //   408: dup
    //   409: ldc 119
    //   411: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   414: aload_0
    //   415: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   418: checkcast 11	java/lang/IncompatibleClassChangeError
    //   421: checkcast 11	java/lang/IncompatibleClassChangeError
    //   424: athrow
    //   425: astore_0
    //   426: ldc 117
    //   428: aload_0
    //   429: ldc 119
    //   431: iconst_0
    //   432: anewarray 4	java/lang/Object
    //   435: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: new 11	java/lang/IncompatibleClassChangeError
    //   441: dup
    //   442: ldc 119
    //   444: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   447: aload_0
    //   448: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   451: checkcast 11	java/lang/IncompatibleClassChangeError
    //   454: checkcast 11	java/lang/IncompatibleClassChangeError
    //   457: athrow
    //   458: astore_0
    //   459: ldc 117
    //   461: aload_0
    //   462: ldc 119
    //   464: iconst_0
    //   465: anewarray 4	java/lang/Object
    //   468: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   471: new 11	java/lang/IncompatibleClassChangeError
    //   474: dup
    //   475: ldc 119
    //   477: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   480: aload_0
    //   481: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   484: checkcast 11	java/lang/IncompatibleClassChangeError
    //   487: checkcast 11	java/lang/IncompatibleClassChangeError
    //   490: athrow
    //   491: aload_3
    //   492: aconst_null
    //   493: invokevirtual 137	android/widget/ListView:setAdapter	(Landroid/widget/ListAdapter;)V
    //   496: aload_3
    //   497: aconst_null
    //   498: invokevirtual 141	android/widget/ListView:setOnScrollListener	(Landroid/widget/AbsListView$OnScrollListener;)V
    //   501: aload_3
    //   502: aconst_null
    //   503: invokevirtual 145	android/widget/ListView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   506: aload_3
    //   507: aconst_null
    //   508: invokevirtual 149	android/widget/ListView:setOnItemLongClickListener	(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    //   511: aload_3
    //   512: aconst_null
    //   513: invokevirtual 153	android/widget/ListView:setOnItemSelectedListener	(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   516: aload_0
    //   517: invokevirtual 157	android/view/View:destroyDrawingCache	()V
    //   520: aload_0
    //   521: instanceof 105
    //   524: ifeq +201 -> 725
    //   527: aload_0
    //   528: checkcast 105	android/view/ViewGroup
    //   531: invokevirtual 109	android/view/ViewGroup:getChildCount	()I
    //   534: istore_2
    //   535: iconst_0
    //   536: istore_1
    //   537: iload_1
    //   538: iload_2
    //   539: if_icmpge +186 -> 725
    //   542: aload_0
    //   543: checkcast 105	android/view/ViewGroup
    //   546: iload_1
    //   547: invokevirtual 113	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   550: invokestatic 115	com/tencent/mm/sdk/platformtools/a:cX	(Landroid/view/View;)V
    //   553: iload_1
    //   554: iconst_1
    //   555: iadd
    //   556: istore_1
    //   557: goto -20 -> 537
    //   560: astore_0
    //   561: ldc 117
    //   563: aload_0
    //   564: ldc 119
    //   566: iconst_0
    //   567: anewarray 4	java/lang/Object
    //   570: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   573: new 11	java/lang/IncompatibleClassChangeError
    //   576: dup
    //   577: ldc 119
    //   579: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   582: aload_0
    //   583: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   586: checkcast 11	java/lang/IncompatibleClassChangeError
    //   589: checkcast 11	java/lang/IncompatibleClassChangeError
    //   592: athrow
    //   593: astore_0
    //   594: ldc 117
    //   596: aload_0
    //   597: ldc 119
    //   599: iconst_0
    //   600: anewarray 4	java/lang/Object
    //   603: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   606: new 11	java/lang/IncompatibleClassChangeError
    //   609: dup
    //   610: ldc 119
    //   612: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   615: aload_0
    //   616: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: checkcast 11	java/lang/IncompatibleClassChangeError
    //   622: checkcast 11	java/lang/IncompatibleClassChangeError
    //   625: athrow
    //   626: astore_0
    //   627: ldc 117
    //   629: aload_0
    //   630: ldc 119
    //   632: iconst_0
    //   633: anewarray 4	java/lang/Object
    //   636: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   639: new 11	java/lang/IncompatibleClassChangeError
    //   642: dup
    //   643: ldc 119
    //   645: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   648: aload_0
    //   649: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   652: checkcast 11	java/lang/IncompatibleClassChangeError
    //   655: checkcast 11	java/lang/IncompatibleClassChangeError
    //   658: athrow
    //   659: astore_0
    //   660: ldc 117
    //   662: aload_0
    //   663: ldc 119
    //   665: iconst_0
    //   666: anewarray 4	java/lang/Object
    //   669: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   672: new 11	java/lang/IncompatibleClassChangeError
    //   675: dup
    //   676: ldc 119
    //   678: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   681: aload_0
    //   682: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   685: checkcast 11	java/lang/IncompatibleClassChangeError
    //   688: checkcast 11	java/lang/IncompatibleClassChangeError
    //   691: athrow
    //   692: astore_0
    //   693: ldc 117
    //   695: aload_0
    //   696: ldc 119
    //   698: iconst_0
    //   699: anewarray 4	java/lang/Object
    //   702: invokestatic 125	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   705: new 11	java/lang/IncompatibleClassChangeError
    //   708: dup
    //   709: ldc 119
    //   711: invokespecial 129	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   714: aload_0
    //   715: invokevirtual 133	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   718: checkcast 11	java/lang/IncompatibleClassChangeError
    //   721: checkcast 11	java/lang/IncompatibleClassChangeError
    //   724: athrow
    //   725: ldc2_w 18
    //   728: ldc 20
    //   730: invokestatic 29	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   733: return
    //   734: astore_3
    //   735: goto -709 -> 26
    //   738: astore_3
    //   739: goto -708 -> 31
    //   742: astore_3
    //   743: goto -707 -> 36
    //   746: astore_3
    //   747: goto -706 -> 41
    //   750: astore_3
    //   751: goto -705 -> 46
    //   754: astore_3
    //   755: goto -704 -> 51
    //   758: astore_3
    //   759: goto -703 -> 56
    //   762: astore 4
    //   764: goto -268 -> 496
    //   767: astore 4
    //   769: goto -268 -> 501
    //   772: astore 4
    //   774: goto -268 -> 506
    //   777: astore 4
    //   779: goto -268 -> 511
    //   782: astore_3
    //   783: goto -267 -> 516
    //   786: astore_3
    //   787: goto -618 -> 169
    //   790: astore_3
    //   791: goto -622 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	794	0	paramView	View
    //   236	321	1	i	int
    //   234	306	2	j	int
    //   87	425	3	localObject	Object
    //   734	1	3	localThrowable1	Throwable
    //   738	1	3	localThrowable2	Throwable
    //   742	1	3	localThrowable3	Throwable
    //   746	1	3	localThrowable4	Throwable
    //   750	1	3	localThrowable5	Throwable
    //   754	1	3	localThrowable6	Throwable
    //   758	1	3	localThrowable7	Throwable
    //   782	1	3	localThrowable8	Throwable
    //   786	1	3	localError	Error
    //   790	1	3	localException	Exception
    //   92	101	4	localDrawable	android.graphics.drawable.Drawable
    //   762	1	4	localThrowable9	Throwable
    //   767	1	4	localThrowable10	Throwable
    //   772	1	4	localThrowable11	Throwable
    //   777	1	4	localThrowable12	Throwable
    // Exception table:
    //   from	to	target	type
    //   21	26	260	java/lang/IncompatibleClassChangeError
    //   26	31	293	java/lang/IncompatibleClassChangeError
    //   31	36	326	java/lang/IncompatibleClassChangeError
    //   36	41	359	java/lang/IncompatibleClassChangeError
    //   41	46	392	java/lang/IncompatibleClassChangeError
    //   46	51	425	java/lang/IncompatibleClassChangeError
    //   51	56	458	java/lang/IncompatibleClassChangeError
    //   491	496	560	java/lang/IncompatibleClassChangeError
    //   496	501	593	java/lang/IncompatibleClassChangeError
    //   501	506	626	java/lang/IncompatibleClassChangeError
    //   506	511	659	java/lang/IncompatibleClassChangeError
    //   511	516	692	java/lang/IncompatibleClassChangeError
    //   21	26	734	java/lang/Throwable
    //   26	31	738	java/lang/Throwable
    //   31	36	742	java/lang/Throwable
    //   36	41	746	java/lang/Throwable
    //   41	46	750	java/lang/Throwable
    //   46	51	754	java/lang/Throwable
    //   51	56	758	java/lang/Throwable
    //   491	496	762	java/lang/Throwable
    //   496	501	767	java/lang/Throwable
    //   501	506	772	java/lang/Throwable
    //   506	511	777	java/lang/Throwable
    //   511	516	782	java/lang/Throwable
    //   153	169	786	java/lang/Error
    //   153	169	790	java/lang/Exception
  }
  
  public static void ek(Context paramContext)
  {
    GMTrace.i(13747787661312L, 102429);
    if (paramContext == null)
    {
      GMTrace.o(13747787661312L, 102429);
      return;
    }
    InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    if (localInputMethodManager == null)
    {
      GMTrace.o(13747787661312L, 102429);
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < 3)
      {
        Object localObject1 = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
        try
        {
          localObject1 = localInputMethodManager.getClass().getDeclaredField((String)localObject1);
          if (!((Field)localObject1).isAccessible()) {
            ((Field)localObject1).setAccessible(true);
          }
          Object localObject2 = ((Field)localObject1).get(localInputMethodManager);
          if ((localObject2 == null) || (!(localObject2 instanceof View))) {
            break label207;
          }
          localObject2 = (View)localObject2;
          if (((View)localObject2).getContext() == paramContext)
          {
            ((Field)localObject1).set(localInputMethodManager, null);
            break label207;
          }
          w.d("MicroMsg.ActivityResourceRecycler", "fixInputMethodManagerLeak break, context is not suitable, get_context=" + ((View)localObject2).getContext() + " dest_context=" + paramContext);
          GMTrace.o(13747787661312L, 102429);
          return;
        }
        catch (Throwable localThrowable)
        {
          w.printErrStackTrace("MicroMsg.ActivityResourceRecycler", localThrowable, "", new Object[0]);
        }
      }
      GMTrace.o(13747787661312L, 102429);
      return;
      label207:
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */