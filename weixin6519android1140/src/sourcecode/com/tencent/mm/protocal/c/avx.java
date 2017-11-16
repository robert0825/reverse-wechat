package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avx
  extends azh
{
  public int jzH;
  public String jzI;
  public int uLe;
  public String uLf;
  public String uLg;
  
  public avx()
  {
    GMTrace.i(17875653885952L, 133184);
    GMTrace.o(17875653885952L, 133184);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17875788103680L, 133185);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      paramVarArgs.fk(4, this.uLe);
      if (this.uLf != null) {
        paramVarArgs.e(5, this.uLf);
      }
      if (this.uLg != null) {
        paramVarArgs.e(6, this.uLg);
      }
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt + b.a.a.a.fh(4, this.uLe);
      paramInt = i;
      if (this.uLf != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uLf);
      }
      i = paramInt;
      if (this.uLg != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uLg);
      }
      GMTrace.o(17875788103680L, 133185);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avx localavx = (avx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(17875788103680L, 133185);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localavx.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 2: 
        localavx.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 3: 
        localavx.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 4: 
        localavx.uLe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      case 5: 
        localavx.uLf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17875788103680L, 133185);
        return 0;
      }
      localavx.uLg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17875788103680L, 133185);
      return 0;
    }
    GMTrace.o(17875788103680L, 133185);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */