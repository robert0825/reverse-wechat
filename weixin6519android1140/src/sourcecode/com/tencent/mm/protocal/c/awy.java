package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awy
  extends ayx
{
  public int tMX;
  public float tYy;
  public float tYz;
  public int ujb;
  public String ujc;
  public String ujd;
  public int uje;
  
  public awy()
  {
    GMTrace.i(3937948139520L, 29340);
    GMTrace.o(3937948139520L, 29340);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3938082357248L, 29341);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.n(3, this.tYy);
      paramVarArgs.n(4, this.tYz);
      paramVarArgs.fk(5, this.ujb);
      if (this.ujc != null) {
        paramVarArgs.e(6, this.ujc);
      }
      if (this.ujd != null) {
        paramVarArgs.e(7, this.ujd);
      }
      paramVarArgs.fk(8, this.uje);
      GMTrace.o(3938082357248L, 29341);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX) + (b.a.a.b.b.a.cK(3) + 4) + (b.a.a.b.b.a.cK(4) + 4) + b.a.a.a.fh(5, this.ujb);
      paramInt = i;
      if (this.ujc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ujc);
      }
      i = paramInt;
      if (this.ujd != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ujd);
      }
      paramInt = b.a.a.a.fh(8, this.uje);
      GMTrace.o(3938082357248L, 29341);
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
      GMTrace.o(3938082357248L, 29341);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awy localawy = (awy)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3938082357248L, 29341);
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
          localawy.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 2: 
        localawy.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 3: 
        localawy.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 4: 
        localawy.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 5: 
        localawy.ujb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 6: 
        localawy.ujc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      case 7: 
        localawy.ujd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3938082357248L, 29341);
        return 0;
      }
      localawy.uje = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3938082357248L, 29341);
      return 0;
    }
    GMTrace.o(3938082357248L, 29341);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\awy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */