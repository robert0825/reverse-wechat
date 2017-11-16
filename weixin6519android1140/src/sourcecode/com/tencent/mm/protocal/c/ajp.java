package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajp
  extends azh
{
  public String gCA;
  public String tNa;
  public String tNn;
  public int uyA;
  public aiy uyv;
  public String uyx;
  public String uyy;
  public String uyz;
  
  public ajp()
  {
    GMTrace.i(3878489686016L, 28897);
    GMTrace.o(3878489686016L, 28897);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3878623903744L, 28898);
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
      if (this.uyv != null)
      {
        paramVarArgs.fm(2, this.uyv.aYq());
        this.uyv.a(paramVarArgs);
      }
      if (this.uyy != null) {
        paramVarArgs.e(3, this.uyy);
      }
      if (this.tNn != null) {
        paramVarArgs.e(4, this.tNn);
      }
      if (this.tNa != null) {
        paramVarArgs.e(5, this.tNa);
      }
      if (this.uyz != null) {
        paramVarArgs.e(6, this.uyz);
      }
      paramVarArgs.fk(7, this.uyA);
      if (this.uyx != null) {
        paramVarArgs.e(8, this.uyx);
      }
      if (this.gCA != null) {
        paramVarArgs.e(9, this.gCA);
      }
      GMTrace.o(3878623903744L, 28898);
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
      if (this.uyv != null) {
        paramInt = i + b.a.a.a.fj(2, this.uyv.aYq());
      }
      i = paramInt;
      if (this.uyy != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uyy);
      }
      paramInt = i;
      if (this.tNn != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tNn);
      }
      i = paramInt;
      if (this.tNa != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tNa);
      }
      paramInt = i;
      if (this.uyz != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uyz);
      }
      i = paramInt + b.a.a.a.fh(7, this.uyA);
      paramInt = i;
      if (this.uyx != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uyx);
      }
      i = paramInt;
      if (this.gCA != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.gCA);
      }
      GMTrace.o(3878623903744L, 28898);
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
      GMTrace.o(3878623903744L, 28898);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ajp localajp = (ajp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3878623903744L, 28898);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajp.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aiy();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aiy)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localajp.uyv = ((aiy)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 3: 
        localajp.uyy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 4: 
        localajp.tNn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 5: 
        localajp.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 6: 
        localajp.uyz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 7: 
        localajp.uyA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      case 8: 
        localajp.uyx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3878623903744L, 28898);
        return 0;
      }
      localajp.gCA = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3878623903744L, 28898);
      return 0;
    }
    GMTrace.o(3878623903744L, 28898);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */