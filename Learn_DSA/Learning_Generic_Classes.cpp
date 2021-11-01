#include <iostream>

using namespace std;

template <class T>
class Generic
{
    private:
        T a;
        T b;
    
    public:
        Generic(T a, T b)
        {
            this->a = a;
            this->b = b;
        }

        T add()
        {
            T c;
            c = a + b;
            return c;
        }

        T sub()
        {
            T d;
            d = a - b;
            return d;
        }
};

int main()
{
    Generic<int> obj1(2,3);
    Generic<float> obj2(2.5,3);

    cout<< obj1.add()<<endl;
    cout<< obj2.add()<<endl;
    cout<< obj1.sub()<<endl;
    cout<< obj2.sub()<<endl;
}