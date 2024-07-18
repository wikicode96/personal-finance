import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Months from '@/screens/Months';
import Years from '@/screens/Years';

const Tab = createBottomTabNavigator();

export default function BottomTab() {
  return (
    <Tab.Navigator>
      <Tab.Screen name="Months" component={ Months } />
      <Tab.Screen name="Years" component={ Years } />
    </Tab.Navigator>
  );
}