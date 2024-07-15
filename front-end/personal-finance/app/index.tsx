import { Button, StyleSheet, Text, View, Alert } from 'react-native';

export default function HomeScreen() {
    return (
        <View style={styles.container}>
            <Text>Bienvenid@!</Text>
            <Button
                title="Entrar"
                onPress={() => Alert.alert('Simple Button pressed')}
            />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});