package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class amr
  extends azh
{
  public String rEm;
  public String rEn;
  public String rEo;
  public int rEp;
  public String sign;
  
  public amr()
  {
    GMTrace.i(3643742879744L, 27148);
    GMTrace.o(3643742879744L, 27148);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3643877097472L, 27149);
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
      if (this.rEm != null) {
        paramVarArgs.e(2, this.rEm);
      }
      if (this.rEo != null) {
        paramVarArgs.e(3, this.rEo);
      }
      if (this.rEn != null) {
        paramVarArgs.e(4, this.rEn);
      }
      if (this.sign != null) {
        paramVarArgs.e(5, this.sign);
      }
      paramVarArgs.fk(6, this.rEp);
      GMTrace.o(3643877097472L, 27149);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.rEm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.rEm);
      }
      i = paramInt;
      if (this.rEo != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.rEo);
      }
      paramInt = i;
      if (this.rEn != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.rEn);
      }
      i = paramInt;
      if (this.sign != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.sign);
      }
      paramInt = b.a.a.a.fh(6, this.rEp);
      GMTrace.o(3643877097472L, 27149);
      return i + paramInt;
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
      GMTrace.o(3643877097472L, 27149);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      amr localamr = (amr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3643877097472L, 27149);
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
          localamr.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3643877097472L, 27149);
        return 0;
      case 2: 
        localamr.rEm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643877097472L, 27149);
        return 0;
      case 3: 
        localamr.rEo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643877097472L, 27149);
        return 0;
      case 4: 
        localamr.rEn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643877097472L, 27149);
        return 0;
      case 5: 
        localamr.sign = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643877097472L, 27149);
        return 0;
      }
      localamr.rEp = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3643877097472L, 27149);
      return 0;
    }
    GMTrace.o(3643877097472L, 27149);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */