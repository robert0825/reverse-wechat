package com.tencent.mm.plugin.appbrand.jsapi.j;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.o;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  /* Error */
  public static void a(android.widget.TextView paramTextView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +7 -> 16
    //   12: aload_1
    //   13: ifnonnull +12 -> 25
    //   16: ldc2_w 9
    //   19: ldc 11
    //   21: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   24: return
    //   25: aload_1
    //   26: ldc 22
    //   28: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: invokestatic 34	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   36: ifne +11 -> 47
    //   39: aload_0
    //   40: aload_3
    //   41: invokestatic 40	com/tencent/mm/plugin/appbrand/n/c:su	(Ljava/lang/String;)I
    //   44: invokevirtual 46	android/widget/TextView:setTextColor	(I)V
    //   47: aload_0
    //   48: iconst_0
    //   49: aload_1
    //   50: ldc 48
    //   52: invokevirtual 52	org/json/JSONObject:getDouble	(Ljava/lang/String;)D
    //   55: d2f
    //   56: invokestatic 56	com/tencent/mm/plugin/appbrand/n/c:W	(F)F
    //   59: invokevirtual 60	android/widget/TextView:setTextSize	(IF)V
    //   62: aload_1
    //   63: ldc 62
    //   65: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   68: astore_3
    //   69: ldc 64
    //   71: aload_3
    //   72: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: ifeq +147 -> 222
    //   78: aload_0
    //   79: iconst_3
    //   80: invokevirtual 73	android/widget/TextView:setGravity	(I)V
    //   83: aload_1
    //   84: ldc 75
    //   86: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   89: astore_3
    //   90: ldc 77
    //   92: aload_3
    //   93: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq +160 -> 256
    //   99: aload_0
    //   100: invokevirtual 81	android/widget/TextView:getPaint	()Landroid/text/TextPaint;
    //   103: iconst_1
    //   104: invokevirtual 87	android/text/TextPaint:setFakeBoldText	(Z)V
    //   107: aload_1
    //   108: ldc 89
    //   110: aload_0
    //   111: invokevirtual 93	android/widget/TextView:getTextSize	()F
    //   114: ldc 94
    //   116: fmul
    //   117: invokestatic 100	java/lang/Math:round	(F)I
    //   120: invokevirtual 104	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   123: invokestatic 108	com/tencent/mm/plugin/appbrand/n/c:jM	(I)I
    //   126: istore_2
    //   127: aload_0
    //   128: instanceof 110
    //   131: ifeq +44 -> 175
    //   134: aload_0
    //   135: checkcast 110	com/tencent/mm/plugin/appbrand/widget/h
    //   138: astore_3
    //   139: aload_3
    //   140: getfield 114	com/tencent/mm/plugin/appbrand/widget/h:iJM	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   143: ifnonnull +16 -> 159
    //   146: aload_3
    //   147: new 116	com/tencent/mm/plugin/appbrand/widget/f/a
    //   150: dup
    //   151: iload_2
    //   152: i2f
    //   153: invokespecial 120	com/tencent/mm/plugin/appbrand/widget/f/a:<init>	(F)V
    //   156: putfield 114	com/tencent/mm/plugin/appbrand/widget/h:iJM	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   159: aload_3
    //   160: getfield 114	com/tencent/mm/plugin/appbrand/widget/h:iJM	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   163: iload_2
    //   164: i2f
    //   165: invokevirtual 124	com/tencent/mm/plugin/appbrand/widget/f/a:X	(F)Z
    //   168: ifeq +7 -> 175
    //   171: aload_3
    //   172: invokevirtual 128	com/tencent/mm/plugin/appbrand/widget/h:invalidate	()V
    //   175: aload_1
    //   176: ldc -126
    //   178: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   181: astore_3
    //   182: ldc -124
    //   184: aload_3
    //   185: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   188: ifeq +92 -> 280
    //   191: aload_0
    //   192: getstatic 138	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   195: invokevirtual 142	android/widget/TextView:setEllipsize	(Landroid/text/TextUtils$TruncateAt;)V
    //   198: aload_0
    //   199: iconst_1
    //   200: invokevirtual 145	android/widget/TextView:setSingleLine	(Z)V
    //   203: aload_0
    //   204: aload_1
    //   205: ldc -109
    //   207: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   210: invokevirtual 151	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   213: ldc2_w 9
    //   216: ldc 11
    //   218: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   221: return
    //   222: ldc -103
    //   224: aload_3
    //   225: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifeq +11 -> 239
    //   231: aload_0
    //   232: iconst_1
    //   233: invokevirtual 73	android/widget/TextView:setGravity	(I)V
    //   236: goto -153 -> 83
    //   239: ldc -101
    //   241: aload_3
    //   242: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   245: ifeq -162 -> 83
    //   248: aload_0
    //   249: iconst_5
    //   250: invokevirtual 73	android/widget/TextView:setGravity	(I)V
    //   253: goto -170 -> 83
    //   256: ldc -99
    //   258: aload_3
    //   259: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   262: ifeq -155 -> 107
    //   265: aload_0
    //   266: invokevirtual 81	android/widget/TextView:getPaint	()Landroid/text/TextPaint;
    //   269: iconst_0
    //   270: invokevirtual 87	android/text/TextPaint:setFakeBoldText	(Z)V
    //   273: goto -166 -> 107
    //   276: astore_3
    //   277: goto -170 -> 107
    //   280: ldc -97
    //   282: aload_3
    //   283: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   286: ifeq +11 -> 297
    //   289: aload_0
    //   290: iconst_1
    //   291: invokevirtual 145	android/widget/TextView:setSingleLine	(Z)V
    //   294: goto -91 -> 203
    //   297: ldc -95
    //   299: aload_3
    //   300: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   303: ifeq +11 -> 314
    //   306: aload_0
    //   307: iconst_0
    //   308: invokevirtual 145	android/widget/TextView:setSingleLine	(Z)V
    //   311: goto -108 -> 203
    //   314: ldc -93
    //   316: aload_3
    //   317: invokevirtual 70	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   320: ifeq -117 -> 203
    //   323: aload_0
    //   324: iconst_0
    //   325: invokevirtual 145	android/widget/TextView:setSingleLine	(Z)V
    //   328: goto -125 -> 203
    //   331: astore_0
    //   332: ldc2_w 9
    //   335: ldc 11
    //   337: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   340: return
    //   341: astore_3
    //   342: goto -280 -> 62
    //   345: astore_3
    //   346: goto -299 -> 47
    //   349: astore_3
    //   350: goto -267 -> 83
    //   353: astore_3
    //   354: goto -151 -> 203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	paramTextView	android.widget.TextView
    //   0	357	1	paramJSONObject	JSONObject
    //   126	38	2	i	int
    //   31	228	3	localObject	Object
    //   276	41	3	localJSONException1	JSONException
    //   341	1	3	localJSONException2	JSONException
    //   345	1	3	localJSONException3	JSONException
    //   349	1	3	localJSONException4	JSONException
    //   353	1	3	localJSONException5	JSONException
    // Exception table:
    //   from	to	target	type
    //   83	107	276	org/json/JSONException
    //   256	273	276	org/json/JSONException
    //   203	213	331	org/json/JSONException
    //   47	62	341	org/json/JSONException
    //   25	47	345	org/json/JSONException
    //   62	83	349	org/json/JSONException
    //   222	236	349	org/json/JSONException
    //   239	253	349	org/json/JSONException
    //   175	203	353	org/json/JSONException
    //   280	294	353	org/json/JSONException
    //   297	311	353	org/json/JSONException
    //   314	328	353	org/json/JSONException
  }
  
  public static void a(AppBrandPageView paramAppBrandPageView, ImageView paramImageView, JSONObject paramJSONObject)
  {
    Object localObject = null;
    GMTrace.i(17675401035776L, 131692);
    if ((paramImageView == null) || (paramJSONObject == null))
    {
      GMTrace.o(17675401035776L, 131692);
      return;
    }
    for (;;)
    {
      String str;
      try
      {
        str = paramJSONObject.getString("iconPath");
        if (TextUtils.isEmpty(str)) {
          break label227;
        }
        if (str.startsWith("wxfile://"))
        {
          paramJSONObject = c.aJ(paramAppBrandPageView.hyD, str);
          paramAppBrandPageView = (AppBrandPageView)localObject;
          if (paramJSONObject != null)
          {
            paramAppBrandPageView = (AppBrandPageView)localObject;
            if (!TextUtils.isEmpty(paramJSONObject.gpy))
            {
              paramJSONObject = paramJSONObject.gpy;
              paramAppBrandPageView = paramJSONObject;
              if (!paramJSONObject.startsWith("file://")) {
                paramAppBrandPageView = "file://" + paramJSONObject;
              }
              paramAppBrandPageView = b.CT().hx(paramAppBrandPageView);
            }
          }
          if ((paramAppBrandPageView != null) && (!paramAppBrandPageView.isRecycled())) {
            break;
          }
          paramImageView.setImageBitmap(null);
          GMTrace.o(17675401035776L, 131692);
          return;
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        GMTrace.o(17675401035776L, 131692);
        return;
      }
      if ((str.startsWith("https://")) || (str.startsWith("http://")))
      {
        paramJSONObject = b.CT().hx(str);
        paramAppBrandPageView = paramJSONObject;
        if (paramJSONObject == null)
        {
          b.CT().a(paramImageView, str, null, null);
          paramAppBrandPageView = paramJSONObject;
        }
      }
      else
      {
        paramAppBrandPageView = o.g(paramAppBrandPageView.hzM, str);
      }
    }
    paramImageView.setImageBitmap(paramAppBrandPageView);
    label227:
    GMTrace.o(17675401035776L, 131692);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\j\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */