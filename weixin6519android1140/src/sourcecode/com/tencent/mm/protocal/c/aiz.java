package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aiz
  extends ayx
{
  public String eSd;
  public int jWv;
  public int scene;
  public String url;
  public String uyg;
  public String uyh;
  
  public aiz()
  {
    GMTrace.i(3679847448576L, 27417);
    GMTrace.o(3679847448576L, 27417);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3679981666304L, 27418);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eSd != null) {
        paramVarArgs.e(2, this.eSd);
      }
      if (this.uyg != null) {
        paramVarArgs.e(3, this.uyg);
      }
      paramVarArgs.fk(4, this.scene);
      if (this.url != null) {
        paramVarArgs.e(5, this.url);
      }
      if (this.uyh != null) {
        paramVarArgs.e(6, this.uyh);
      }
      paramVarArgs.fk(7, this.jWv);
      GMTrace.o(3679981666304L, 27418);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.eSd != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eSd);
      }
      i = paramInt;
      if (this.uyg != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uyg);
      }
      i += b.a.a.a.fh(4, this.scene);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.url);
      }
      i = paramInt;
      if (this.uyh != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uyh);
      }
      paramInt = b.a.a.a.fh(7, this.jWv);
      GMTrace.o(3679981666304L, 27418);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3679981666304L, 27418);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aiz localaiz = (aiz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3679981666304L, 27418);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localaiz.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3679981666304L, 27418);
        return 0;
      case 2: 
        localaiz.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3679981666304L, 27418);
        return 0;
      case 3: 
        localaiz.uyg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3679981666304L, 27418);
        return 0;
      case 4: 
        localaiz.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3679981666304L, 27418);
        return 0;
      case 5: 
        localaiz.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3679981666304L, 27418);
        return 0;
      case 6: 
        localaiz.uyh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3679981666304L, 27418);
        return 0;
      }
      localaiz.jWv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3679981666304L, 27418);
      return 0;
    }
    GMTrace.o(3679981666304L, 27418);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aiz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */