package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bqp
  extends com.tencent.mm.bm.a
{
  public String tVe;
  public String tVf;
  public azp tVi;
  public String vaA;
  
  public bqp()
  {
    GMTrace.i(13584042033152L, 101209);
    GMTrace.o(13584042033152L, 101209);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13584176250880L, 101210);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVi == null) {
        throw new b("Not all required fields were included: KSid");
      }
      if (this.tVe != null) {
        paramVarArgs.e(1, this.tVe);
      }
      if (this.tVf != null) {
        paramVarArgs.e(2, this.tVf);
      }
      if (this.vaA != null) {
        paramVarArgs.e(3, this.vaA);
      }
      if (this.tVi != null)
      {
        paramVarArgs.fm(4, this.tVi.aYq());
        this.tVi.a(paramVarArgs);
      }
      GMTrace.o(13584176250880L, 101210);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tVe != null) {
        i = b.a.a.b.b.a.f(1, this.tVe) + 0;
      }
      paramInt = i;
      if (this.tVf != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVf);
      }
      i = paramInt;
      if (this.vaA != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.vaA);
      }
      paramInt = i;
      if (this.tVi != null) {
        paramInt = i + b.a.a.a.fj(4, this.tVi.aYq());
      }
      GMTrace.o(13584176250880L, 101210);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tVi == null) {
        throw new b("Not all required fields were included: KSid");
      }
      GMTrace.o(13584176250880L, 101210);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bqp localbqp = (bqp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13584176250880L, 101210);
        return -1;
      case 1: 
        localbqp.tVe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584176250880L, 101210);
        return 0;
      case 2: 
        localbqp.tVf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584176250880L, 101210);
        return 0;
      case 3: 
        localbqp.vaA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13584176250880L, 101210);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbqp.tVi = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13584176250880L, 101210);
      return 0;
    }
    GMTrace.o(13584176250880L, 101210);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */